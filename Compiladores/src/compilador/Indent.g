grammar Indent;

/*---------------- LEXER INTERNALS ----------------*/

@lexer::members
{
    private DenterHelper denter = new DenterHelper(NL, IndentParser.INDENT,
                                                   IndentParser.DEDENT) {
        @Override
        public Token pullToken() {
            return IndentLexer.super.nextToken();
        }
    };

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}

/*---------------- PARSER INTERNALS ----------------*/

@parser::members
{
    public static void main(String[] args) throws Exception
    {
        String s = "1\n    2\n    3\n4\n5\n";

        CharStream input = CharStreams.fromString(s);
        IndentLexer lexer = new IndentLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IndentParser parser = new IndentParser(tokens);

        parser.program();
    }
}

/*---------------- LEXER RULES ----------------*/

tokens {INDENT, DEDENT}

NL: ('\r'? '\n' ' '*) ;

NUMBER: ('0'..'9')+ ;

/*---------------- PARSER RULES ----------------*/

program
    :   NUMBER INDENT
               NUMBER NL
               NUMBER NL
        DEDENT
        NUMBER NL
        NUMBER NL
    ;

// java -jar antlr-4.7.2.jar Indent.g
// javac -cp antlr-4.7.2.jar Indent*.java DenterHelper.java
// java  -cp antlr-4.7.2.jar:. IndentParser
//
