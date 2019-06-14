grammar Sauro;

/*
COMANDOS TERMINAL

        C:
        cd C:\Users\wrkerber\Documents\NetBeansProjects\Compiladores\Compiladores\src\compilador
        1_build.bat
        2_compile.bat teste.dino

        "C:\Program Files\Java\jdk1.8.0_191\bin\javac.exe" -cp antlr-4.7.2.jar DenterHelper.java

        "C:\Program Files\Java\jdk1.7.0_80\bin\javac.exe" List.java

*/

/*---------------- LEXER INTERNALS ----------------*/

@lexer::members
{
    private DenterHelper denter = new DenterHelper(NL, SauroParser.INDENT,
                                                   SauroParser.DEDENT) {
        @Override
        public Token pullToken() {
            return SauroLexer.super.nextToken();
        }
    };

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}


/*---------------- PARSER INTERNALS ----------------*/

@parser::header
{
    //import java.util.ArrayList;
}

@parser::members
{
    private static int stack_cur, stack_max, if_counter;
    private static int if_count = 0;
    private static int while_count = 0;
	private static int num_args = 0;
	private static int num_param = 0;
	private static boolean function_return, function_return_expected;
	private static String r = "";
    
    private static boolean has_error = false;

    public static void emit (String bytecode, int delta)
    {
        System.out.println("    " + bytecode);
        stack_cur += delta;
        if(stack_cur > stack_max)
        {
            stack_max = stack_cur;
        }
    }

    private static ArrayList<String> symbol_table;
    private static ArrayList<Character> type_table;
    private static ArrayList<String> func_table;

    public static void main(String[] args) throws Exception
    {
        CharStream input = CharStreams.fromStream(System.in);
        SauroLexer lexer = new SauroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SauroParser parser = new SauroParser(tokens);

        has_error = false;

        // Tabela de Símbolos
        symbol_table = new ArrayList<String>();
        type_table = new ArrayList<Character>();
        func_table = new ArrayList<String>();

        //symbol_table.add("args");
        //type_table.add('-'); //tirei para colocar no main apenas
        
        parser.program();
        System.out.println("; symbols: " + symbol_table);

        if(has_error == true)
		{
            System.err.println("Existem erros que precisam ser corrigidos!");
            System.exit(1);
		}
    }
}

/*---------------- LEXER RULES ----------------*/

tokens {INDENT, DEDENT}

IF          : 'if' ;
WHILE       : 'while' ;
OP_CUR      : '{' ;
CL_CUR      : '}' ;
EQ          : '==' ;
NE          : '!=' ;
GT          : '>' ;
GE          : '>=' ;
LT          : '<' ;
LE          : '<=' ; 

PLUS        : '+' ;
MINUS       : '-' ;
TIMES       : '*' ;
OVER        : '/' ;
REMAINDER   : '%' ;
OP_PAR      : '(' ;
CL_PAR      : ')' ;
ATTRIB      : '=' ;
COMMA       : ',' ;
COLON       : ':' ;

PRINT       : 'print' ;
READ_INT    : 'read_int' ;
READ_STR    : 'read_str' ;
RETURN      : 'return' ;

APPEND      : 'append' ;
LIST        : 'list' ;
OP_BRA      : '[' ;
CL_BRA      : ']' ;
DOT         : '.' ;
LEN         : 'len' ;
STR         : 'str' ;
INT         : 'int' ;

DEF         : 'def' ;

NUMBER      : '0'..'9'+ ;
VAR         : 'a'..'z'+ ;
STRING      : '"' ~["]* '"' ;

COMMENT     : '#' ~[\r\n]* { skip();} ;
NL: ('\r'? '\n' ' '*) ;
SPACE       : (' '|'\t')+ { skip(); } ;


/*---------------- PARSER RULES ----------------*/

program
    :
        {
            System.out.println(".source Test.j");
            System.out.println(".class  public Test");
            System.out.println(".super  java/lang/Object");
            System.out.println("\n.method public <init>()V");
            System.out.println("    aload_0");
            System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
            System.out.println("    return");
            System.out.println(".end method");
        }
       (function)*  main
    ;

function 
    :
		{
			r = "V"; 
			function_return = false; 
		}
	DEF VAR OP_PAR ( parameters ) ? CL_PAR (INT  
		{ 
			r = "I"; 
			function_return = true; 
			function_return_expected = true; 
		} 
	)? COLON INDENT
        {
			String qt_param = "";
			for (int i = 0; i < num_param; i++)
			{ 
				qt_param = qt_param + "I";
			}
			
            System.out.println("\n.method public static " + $VAR.text + "(" + qt_param + ")"+ r);   //.method public static cube()V
			num_param = 0;
			
            if(!func_table.contains($VAR.text))
            {
                func_table.add($VAR.text);
            }
            else
            {
                System.err.println("Error: function " + $VAR.text + " already exists.");
                has_error = true;
            }
        }
    (statement)+ DEDENT
        {
            System.out.println("        return");              
            System.out.println(".limit locals " + symbol_table.size());
            System.out.println(".limit stack " + stack_max);
            System.out.println(".end method");
            stack_max = 0;
            symbol_table.clear();
            type_table.clear(); 				
        }
    ;

parameters
	: 
    VAR 
        {
            if(!symbol_table.contains($VAR.text))
            {
				num_param = 1;
                symbol_table.add($VAR.text);
                type_table.add('i');
            }
        }
    ( COMMA VAR 
        {
            if (!symbol_table.contains($VAR.text))
            {
				num_param++;
                symbol_table.add($VAR.text);
                type_table.add('i');
            }
        }
    )*
	;

arguments
    : 
    (e1 = expression) 
		{ 
			num_args = 1;
			if($e1.type != 'i')
			{
                System.err.println("Error: only Integer values allowed.");
                has_error = true;
			}
        } 
	(COMMA e2 = expression 
		{ 	
			num_args++;
            if($e2.type != 'i')
			{
                System.err.println("Error: only Integer values allowed.");
                has_error = true;
			}		
        } 
	)*
    ;

main
    :   {
            System.out.println("\n.method public static main([Ljava/lang/String;)V");
            symbol_table.add("args");
            type_table.add('-');
        }
        (statement)+
        {
            System.out.println("        return");
            System.out.println(".limit locals " + symbol_table.size());
            System.out.println(".limit stack " + stack_max);
            System.out.println(".end method");
        }
    ;

statement
    : st_print | st_attrib | st_if | st_while | st_call | st_new_list | st_list_append | st_list_attrib | st_return | NL
    ;

st_return
	:
	RETURN e = expression
		{
			if(function_return == false)
            {
                System.err.println("Error: return not expected.");
                has_error = true;
            }    
            if($e.type != 'i')
			{
                System.err.println("Error: expected Integer on return.");
                has_error = true;
            }
            else
			{
                function_return_expected = false;
                emit("ireturn", - 1);
            } 
		}
	;
	
st_print
    :   PRINT OP_PAR
            { 
                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
            }
            e1 = expression
            {
                if ($e1.type == 'l') 
				{
					System.err.println("Error: cannot print List directly.");
					has_error = true;
				}
				if ($e1.type == 'i') 
				{
					emit("invokevirtual java/io/PrintStream/print(I)V", - 2);
				} 
				else 
				{
					emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
				}
            }
        (COMMA
            { 
                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
            }
        e2 = expression
            {
                if ($e2.type == 'l') 
				{
					System.err.println("Error: cannot print List directly.");
					has_error = true;
				}
				if ($e2.type == 'i') 
				{
					emit("invokevirtual java/io/PrintStream/print(I)V", - 2);
				} 
				else 
				{
					emit("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
				}
            }
        )* CL_PAR
        {
            emit("    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
            emit("    invokevirtual java/io/PrintStream/println()V", - 1);
        }
    ;
	
st_attrib
    :   
        VAR ATTRIB e = expression
        {
            if (!symbol_table.contains($VAR.text)) 
			{
                symbol_table.add($VAR.text);
                type_table.add($e.type);
            } 
			else 
			{
                if (type_table.get(symbol_table.indexOf($VAR.text)) != $e.type) 
				{
                   System.err.println("Error: impossible to change variable type.");
                   has_error = true;
                }
            }

            if ($e.type == 'i') 
			{
                emit("istore " + symbol_table.indexOf($VAR.text), - 1);
            } 
			else 
			{
                emit("astore " + symbol_table.indexOf($VAR.text), - 1);
            }
        }
    ;
	
st_call
    :
        VAR OP_PAR ( arguments ) ? CL_PAR // variable (n,b)
            {
				if(!func_table.contains($VAR.text))
				{
					System.err.println("Error: function " + $VAR.text + " do not exists.");
					has_error = true;
				}
				String qt_argumentos = "";
				for (int i = 0; i < num_args; i++)
				{ 
					qt_argumentos = qt_argumentos + "I";
				}
				num_args = 0;
				emit("    invokestatic Test/" + $VAR.text + "("+qt_argumentos+")V", 0);
            }
    ;

st_new_list
        // variable = list()
    :   VAR
			{
				if (symbol_table.contains($VAR.text)) {
					System.err.println("Error: List '" + $VAR.text + "' already declared.");
					has_error = true;
				}
				symbol_table.add($VAR.text);
				type_table.add('l');
			}
        ATTRIB LIST OP_PAR CL_PAR
			{
				emit("    new List", + 1);
				emit("    dup", + 1);
				emit("    invokespecial List/<init>()V", - 1);
				emit("    astore " + symbol_table.indexOf($VAR.text) + "\n", - 1);
			}
    ;

st_list_append
        // variable . append ( expression )
    :   VAR
			{
				if (!symbol_table.contains($VAR.text)) 
				{
					System.err.println("Error: List '" + $VAR.text + "' not declared.");
					has_error = true;
				}
			} 
        DOT APPEND 
			{
				emit("aload " + symbol_table.indexOf($VAR.text), + 1);
			}
		OP_PAR e = expression CL_PAR
			{
				emit("    invokevirtual List/append(I)V", - 2);
			}
    ;

st_list_attrib
        // variable [ expression ] = expression
    :
        VAR
			{
				if (!symbol_table.contains($VAR.text)) {
					System.err.println("Error: List '" + $VAR.text + "' not declared.");
					has_error = true;
				}
				if (type_table.get(symbol_table.indexOf($VAR.text)) != 'l') {
					System.err.println("Error: '" + $VAR.text + "' is not List.");
					has_error = true;
				}
				emit("aload " + symbol_table.indexOf($VAR.text), + 1);
			}
        OP_BRA e1 = expression
			{
				if ($e1.type != 'i') {
					System.err.println("Error: index must be from Integer type.");
					has_error = true;
				}
			}
        CL_BRA ATTRIB e2 = expression
			{
				if ($e2.type != 'i' && $e2.type != 's') {
					System.err.println("Error: incompatible type.");
					has_error = true;
				}
				emit("invokevirtual List/set(II)V", - 3);
			}
    ;

st_if
    :   {
            if_count++;
            int if_local = if_count;
        }
        IF 
        e1 = expression op = (EQ | NE | GT | GE | LT | LE) e2 = expression 
        {
            if($e1.type == 'i' && $e2.type == 'i')
            {
                if ($op.type == EQ) { emit("\nif_icmpne NOT_IF_" + if_count, -2); }
                else if ($op.type == NE) { emit("\nif_icmpeq NOT_IF_" + if_count, -2); }
                else if ($op.type == GT) { emit("\nif_icmple NOT_IF_" + if_count, -2); }
                else if ($op.type == GE) { emit("\nif_icmplt NOT_IF_" + if_count, -2); }
                else if ($op.type == LT) { emit("\nif_icmpge NOT_IF_" + if_count, -2); }
                else if ($op.type == LE) { emit("\nif_icmpgt NOT_IF_" + if_count, -2); }
            }
            else
            {
                System.err.println("# error: cannot mix types. -> " + $e1.text + " and " + $e2.text + "! [Line " + $op.line + "]");
                has_error = true;
            }
        }
        COLON INDENT ( statement )+ DEDENT
        { System.out.println("NOT_IF_" + if_local + ":"); }
    ;

st_while
    :   {
            while_count++;
            int while_local = while_count;
            System.out.println("BEGIN_WHILE_" + while_local + ":"); 
        }
        WHILE 
        e1 = expression op = (EQ | NE | GT | GE | LT | LE) e2 = expression 
		{
			if($e1.type == 'i' && $e2.type == 'i')
			{
                     if ($op.type == EQ) { emit("\nif_icmpne END_WHILE_" + while_count, -2); }
                else if ($op.type == NE) { emit("\nif_icmpeq END_WHILE_" + while_count, -2); }
                else if ($op.type == GT) { emit("\nif_icmple END_WHILE_" + while_count, -2); }
                else if ($op.type == GE) { emit("\nif_icmplt END_WHILE_" + while_count, -2); }
                else if ($op.type == LT) { emit("\nif_icmpge END_WHILE_" + while_count, -2); }
                else if ($op.type == LE) { emit("\nif_icmpgt END_WHILE_" + while_count, -2); }		
			}
			else
			{
				System.err.println("# error: cannot mix types. -> " + $e1.text + " and " + $e2.text + "! [Line " + $op.line + "]");
				has_error = true;
			}
		}
        COLON INDENT ( statement )+ DEDENT
        {
            emit("    goto BEGIN_WHILE_" + while_local, 1);
            System.out.println("END_WHILE_" + while_local + ":");
        }
    ;

expression returns [char type]
    :   t1 = term ( op = ( PLUS | MINUS ) t2 = term 
        {
            if($t1.type == 'i' && $t2.type == 'i')
            {
                if ($op.type == PLUS)
                { 
                    emit("iadd", - 1); 
                }
                else
                {
                    emit("isub", - 1);
                }
            }
            else
            {
                System.err.println("# error: cannot mix types. -> " + $t1.text + " and " + $t2.text + "! [Line " + $op.line + "]");
                has_error = true;
            }
        } 
        )*
        {$type = $t1.type;}
    ;

term returns [char type]
    :   f1 = factor ( op = ( TIMES | OVER | REMAINDER ) f2 = factor 
        {
            if(($f1.type == 'i') && ($f2.type == 'i'))
            {
                if      ($op.type == TIMES) {emit("    imul", - 1);}    
                else if ($op.type == OVER)  {emit("    idiv", - 1);}    
                else                        {emit("    irem", - 1);}    
            }
            else
            {
                System.err.println("# error: cannot mix types. -> " + $f1.text + " and " + $f2.text + "! [Line " + $op.line + "]");
                has_error = true;
            } 
        }
         )*
         {$type = $f1.type;}
    ;


	
factor returns [char type]             // NUMBER  |   OP_PAR expression CL_PAR |   VAR |   READ_INT OP_PAR CL_PAR
    :   NUMBER
            { 
                $type = 'i';
                emit("    ldc "+ $NUMBER.text, + 1); 
            }
    |   OP_PAR e = expression CL_PAR
            {
                $type = $e.type;
            }
    |   VAR
            {
                if (!symbol_table.contains($VAR.text)) 
                {
                    System.err.println("Error: variable '" + $VAR.text + "' not declared.");
                    has_error = true;
					//System.exit(1);
                } else 
                {
                    $type = 'i';
                    emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                }
            }
        OP_BRA e = expression CL_BRA
            {
                emit("    invokevirtual List/get(I)I", + 1);
            }
    |   VAR
            {
                if (!symbol_table.contains($VAR.text)) 
                {
                     System.err.println("Error: variable '" + $VAR.text + "' not declared.");
                    has_error = true;
                } 
                else 
                {
                    if (type_table.get(symbol_table.indexOf($VAR.text)) == 'i') 
                    {
                        emit("    iload " + symbol_table.indexOf($VAR.text), + 1);
                    } 
                    else 
                    {
                        emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                    }

                    $type = type_table.get(symbol_table.indexOf($VAR.text));
                }
            }
	|	VAR OP_PAR (arguments) ? CL_PAR
			{
				$type = 'i';
				if(!func_table.contains($VAR.text))
				{
					System.err.println("Error: function " + $VAR.text + " do not exists.");
					has_error = true;
				}
				String qt_argumentos = "";
				for (int i = 0; i < num_args; i++)
				{ 
					qt_argumentos = qt_argumentos + "I";
				}
				num_args = 0;
				emit("    invokestatic Test/" + $VAR.text + "("+qt_argumentos+")I", 0);
			}
    |   READ_INT OP_PAR CL_PAR
            {
                $type = 'i';
                emit("    invokestatic Runtime/readInt()I", +1);
            }
    |   READ_STR OP_PAR CL_PAR
            {
                $type = 'a';
                emit("    invokestatic Runtime/readString()Ljava/lang/String;", - 1);
            }
    |   STRING 
            {
                $type = 'a';
                emit("    ldc "+ $STRING.text, + 1); 
            }
        // LEN (variable)
    |   LEN OP_PAR VAR CL_PAR
            {
				if (!symbol_table.contains($VAR.text)) 
				{
					System.err.println("Error: variable '" + $VAR.text + "' not declared.");
					has_error = true;
				}
				if (type_table.get(symbol_table.indexOf($VAR.text)) != 'l') 
				{
					System.err.println("Error: variable '" + $VAR.text + "' must be List.");
					has_error = true;
				}
                $type = 'i';
                emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                emit("    invokevirtual List/len()I", 0);
            }
        // STR (variable)
    |   STR OP_PAR VAR CL_PAR
            {
				if (!symbol_table.contains($VAR.text)) 
				{
					System.err.println("Error: variable '" + $VAR.text + "' not declared.");
					has_error = true;
				}
				if (type_table.get(symbol_table.indexOf($VAR.text)) != 'l') 
				{
					System.err.println("Error: variable '" + $VAR.text + "' must be List.");
					has_error = true;
				}
                $type = 'a';
                emit("    aload " + symbol_table.indexOf($VAR.text), + 1);
                emit("    invokevirtual List/str()Ljava/lang/String;", 0);
            }
    ;
