// Generated from c:\Users\wrkerber\Documents\NetBeansProjects\Compiladores\Compiladores\src\compilador\Sauro.g by ANTLR 4.7.1

    //import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, WHILE=2, OP_CUR=3, CL_CUR=4, EQ=5, NE=6, GT=7, GE=8, LT=9, LE=10, 
		PLUS=11, MINUS=12, TIMES=13, OVER=14, REMAINDER=15, OP_PAR=16, CL_PAR=17, 
		ATTRIB=18, COMMA=19, COLON=20, PRINT=21, READ_INT=22, READ_STR=23, APPEND=24, 
		LIST=25, OP_BRA=26, CL_BRA=27, DOT=28, LEN=29, STR=30, DEF=31, NUMBER=32, 
		VAR=33, STRING=34, COMMENT=35, NL=36, SPACE=37, INDENT=38, DEDENT=39;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_main = 3, 
		RULE_statement = 4, RULE_st_call = 5, RULE_st_print = 6, RULE_st_new_list = 7, 
		RULE_st_list_append = 8, RULE_st_list_attrib = 9, RULE_st_attrib = 10, 
		RULE_st_if = 11, RULE_st_while = 12, RULE_expression = 13, RULE_term = 14, 
		RULE_factor = 15;
	public static final String[] ruleNames = {
		"program", "function", "parameters", "main", "statement", "st_call", "st_print", 
		"st_new_list", "st_list_append", "st_list_attrib", "st_attrib", "st_if", 
		"st_while", "expression", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'while'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
		"','", "':'", "'print'", "'read_int'", "'read_str'", "'append'", "'list'", 
		"'['", "']'", "'.'", "'len'", "'str'", "'def'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "WHILE", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", 
		"LE", "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
		"ATTRIB", "COMMA", "COLON", "PRINT", "READ_INT", "READ_STR", "APPEND", 
		"LIST", "OP_BRA", "CL_BRA", "DOT", "LEN", "STR", "DEF", "NUMBER", "VAR", 
		"STRING", "COMMENT", "NL", "SPACE", "INDENT", "DEDENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sauro.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private static int stack_cur, stack_max, if_counter;
	    private static int if_count = 0;
	    private static int while_count = 0;
	    
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

	public SauroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println(".source Test.j");
			            System.out.println(".class  public Test");
			            System.out.println(".super  java/lang/Object");
			            System.out.println("\n.method public <init>()V");
			            System.out.println("    aload_0");
			            System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
			            System.out.println("    return");
			            System.out.println(".end method");
			        
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(33);
				function();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode DEF() { return getToken(SauroParser.DEF, 0); }
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(DEF);
			setState(42);
			((FunctionContext)_localctx).VAR = match(VAR);
			setState(43);
			match(OP_PAR);
			setState(44);
			match(CL_PAR);
			setState(45);
			match(COLON);
			setState(46);
			match(INDENT);

			            System.out.println("\n.method public static " + (((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null) + "()V");   //.method public static cube()V
			            if(!func_table.contains((((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null)))
			            {
			                func_table.add((((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null));
			            }
			            else
			            {
			                System.err.println("Function already exists: " + (((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null)); 
			                has_error = true;
			            }
			        
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(53);
			match(DEDENT);

			            System.out.println("        return");              
			            System.out.println(".limit locals " + symbol_table.size());
			            System.out.println(".limit stack " + stack_max);
			            System.out.println(".end method");
			            stack_max = 0;
			            symbol_table.clear();
			            type_table.clear(); 				
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Token VAR;
		public List<TerminalNode> VAR() { return getTokens(SauroParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SauroParser.VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SauroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SauroParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((ParametersContext)_localctx).VAR = match(VAR);

			            if(!symbol_table.contains((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null)))
			            {
			                symbol_table.add((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null));
			                type_table.add('i');
			            }
			        
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58);
				match(COMMA);
				setState(59);
				((ParametersContext)_localctx).VAR = match(VAR);

				            if (!symbol_table.contains((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null)))
				            {
				                symbol_table.add((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null));
				                type_table.add('i');
				            }
				        
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println("\n.method public static main([Ljava/lang/String;)V");
			            symbol_table.add("args");
			            type_table.add('-');
			        
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );

			            System.out.println("        return");
			            System.out.println(".limit locals " + symbol_table.size());
			            System.out.println(".limit stack " + stack_max);
			            System.out.println(".end method");
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
		}
		public St_new_listContext st_new_list() {
			return getRuleContext(St_new_listContext.class,0);
		}
		public St_list_appendContext st_list_append() {
			return getRuleContext(St_list_appendContext.class,0);
		}
		public St_list_attribContext st_list_attrib() {
			return getRuleContext(St_list_attribContext.class,0);
		}
		public TerminalNode NL() { return getToken(SauroParser.NL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				st_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				st_new_list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				st_list_append();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				st_list_attrib();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_callContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((St_callContext)_localctx).VAR = match(VAR);
			setState(86);
			match(OP_PAR);
			setState(87);
			match(CL_PAR);

			                emit("    invokestatic Test/"+(((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null)+"()V", 0); 
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_printContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PRINT() { return getToken(SauroParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SauroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SauroParser.COMMA, i);
		}
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(PRINT);
			setState(91);
			match(OP_PAR);
			 
			                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
			            
			setState(93);
			((St_printContext)_localctx).e1 = expression();

			                if (((St_printContext)_localctx).e1.type == 'i') 
			                {
			                    emit("    invokevirtual java/io/PrintStream/println(I)V", - 2);
			                } 
			                else 
			                {
			                    emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
			                }
			            
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				 
				                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				            
				setState(97);
				((St_printContext)_localctx).e2 = expression();

				                if (((St_printContext)_localctx).e2.type == 'i') 
				                {
				                    emit("    invokevirtual java/io/PrintStream/println(I)V", - 2);
				                } 
				                else 
				                {
				                    emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
				                }
				            
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(CL_PAR);

			            emit("    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
			            emit("    invokevirtual java/io/PrintStream/println()V", - 1);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_new_listContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public TerminalNode LIST() { return getToken(SauroParser.LIST, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public St_new_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_new_list; }
	}

	public final St_new_listContext st_new_list() throws RecognitionException {
		St_new_listContext _localctx = new St_new_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_new_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((St_new_listContext)_localctx).VAR = match(VAR);

			            symbol_table.add((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			            int address = symbol_table.indexOf((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			        
			setState(110);
			match(ATTRIB);
			setState(111);
			match(LIST);
			setState(112);
			match(OP_PAR);
			setState(113);
			match(CL_PAR);

			            emit("    new List", + 1);
			            emit("    dup", + 1);
			            emit("    invokespecial List/<init>()V", - 1);
			            emit("    astore " + address + "\n", - 1);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_list_appendContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode DOT() { return getToken(SauroParser.DOT, 0); }
		public TerminalNode APPEND() { return getToken(SauroParser.APPEND, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_list_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list_append; }
	}

	public final St_list_appendContext st_list_append() throws RecognitionException {
		St_list_appendContext _localctx = new St_list_appendContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_list_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((St_list_appendContext)_localctx).VAR = match(VAR);

			            int address = symbol_table.indexOf((((St_list_appendContext)_localctx).VAR!=null?((St_list_appendContext)_localctx).VAR.getText():null));
			            emit("    aload " + address, + 1);
			        
			setState(118);
			match(DOT);
			setState(119);
			match(APPEND);
			setState(120);
			match(OP_PAR);
			setState(121);
			((St_list_appendContext)_localctx).e = expression();
			setState(122);
			match(CL_PAR);

			            emit("    invokevirtual List/append(I)V", - 2);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_list_attribContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_BRA() { return getToken(SauroParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(SauroParser.CL_BRA, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public St_list_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list_attrib; }
	}

	public final St_list_attribContext st_list_attrib() throws RecognitionException {
		St_list_attribContext _localctx = new St_list_attribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_list_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((St_list_attribContext)_localctx).VAR = match(VAR);

			                int address = symbol_table.indexOf((((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getText():null));
			                emit("    aload " + address + "\n", + 1);
			            
			setState(127);
			match(OP_BRA);
			setState(128);
			((St_list_attribContext)_localctx).e1 = expression();

			                if (((St_list_attribContext)_localctx).e1.type != 'i') 
			                {
			                    System.err.println("# error: list index must be integer");
			                    //System.exit(1);
			                }
			            
			setState(130);
			match(CL_BRA);
			setState(131);
			match(ATTRIB);
			setState(132);
			((St_list_attribContext)_localctx).e2 = expression();

			                if (((St_list_attribContext)_localctx).e1.type != 'i') 
			                {
			                    System.err.println("# error: list index must be integer");
			                    //System.exit(1);
			                }
			                emit("    invokevirtual List/set(II)V", - 3);
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_attribContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(136);
			match(ATTRIB);
			setState(137);
			((St_attribContext)_localctx).e = expression();

			            if (!symbol_table.contains((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null)))
			            {
			                symbol_table.add((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			                type_table.add(((St_attribContext)_localctx).e.type);
			                if(((St_attribContext)_localctx).e.type == 'i')
			                {
			                    type_table.add('i');
			                }
			                else
			                {
			                    type_table.add('a');
			                }
			            }
			            else 
			            {
			                System.err.println("# error: '" + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) + "' is already declared");
			            }

			            int address = symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			            
			            if (((St_attribContext)_localctx).e.type == 'i')
			            {
			                if(type_table.get(address) == 'i')
			                {
			                    emit("    istore " + address + "\n", - 1);
			                }
			                else
			                {
			                    System.err.println("A variável " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) + " está com o tipo incorreto! [Linha " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getLine():0) + "]");
			                    has_error = true;
			                }
			            }
			            else
			            {
			                if(type_table.get(address) == 'a')
			                {
			                    emit("    astore " + address + "\n", - 1);
			                }
			                else
			                {
			                    System.err.println("A variável " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) + " está com o tipo incorreto! [Linha " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getLine():0) + "]");
			                    has_error=true;
			                }
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_ifContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode IF() { return getToken(SauroParser.IF, 0); }
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SauroParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SauroParser.NE, 0); }
		public TerminalNode GT() { return getToken(SauroParser.GT, 0); }
		public TerminalNode GE() { return getToken(SauroParser.GE, 0); }
		public TerminalNode LT() { return getToken(SauroParser.LT, 0); }
		public TerminalNode LE() { return getToken(SauroParser.LE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            if_count++;
			            int if_local = if_count;
			        
			setState(141);
			match(IF);
			setState(142);
			((St_ifContext)_localctx).e1 = expression();
			setState(143);
			((St_ifContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((St_ifContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			((St_ifContext)_localctx).e2 = expression();

			            if(((St_ifContext)_localctx).e1.type == 'i' && ((St_ifContext)_localctx).e2.type == 'i')
			            {
			                if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == EQ) { emit("\nif_icmpne NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == NE) { emit("\nif_icmpeq NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == GT) { emit("\nif_icmple NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == GE) { emit("\nif_icmplt NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == LT) { emit("\nif_icmpge NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == LE) { emit("\nif_icmpgt NOT_IF_" + if_count, -2); }
			            }
			            else
			            {
			                System.err.println("# error: cannot mix types. -> " + (((St_ifContext)_localctx).e1!=null?_input.getText(((St_ifContext)_localctx).e1.start,((St_ifContext)_localctx).e1.stop):null) + " and " + (((St_ifContext)_localctx).e2!=null?_input.getText(((St_ifContext)_localctx).e2.start,((St_ifContext)_localctx).e2.stop):null) + "! [Line " + (((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getLine():0) + "]");
			                has_error = true;
			            }
			        
			setState(146);
			match(COLON);
			setState(147);
			match(INDENT);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				statement();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(153);
			match(DEDENT);
			 System.out.println("NOT_IF_" + if_local + ":"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class St_whileContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode WHILE() { return getToken(SauroParser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SauroParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SauroParser.NE, 0); }
		public TerminalNode GT() { return getToken(SauroParser.GT, 0); }
		public TerminalNode GE() { return getToken(SauroParser.GE, 0); }
		public TerminalNode LT() { return getToken(SauroParser.LT, 0); }
		public TerminalNode LE() { return getToken(SauroParser.LE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            while_count++;
			            int while_local = while_count;
			            System.out.println("BEGIN_WHILE_" + while_local + ":"); 
			        
			setState(157);
			match(WHILE);
			setState(158);
			((St_whileContext)_localctx).e1 = expression();
			setState(159);
			((St_whileContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((St_whileContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(160);
			((St_whileContext)_localctx).e2 = expression();

						if(((St_whileContext)_localctx).e1.type == 'i' && ((St_whileContext)_localctx).e2.type == 'i')
						{
			                     if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == EQ) { emit("\nif_icmpne END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == NE) { emit("\nif_icmpeq END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == GT) { emit("\nif_icmple END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == GE) { emit("\nif_icmplt END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == LT) { emit("\nif_icmpge END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == LE) { emit("\nif_icmpgt END_WHILE_" + while_count, -2); }		
						}
						else
						{
							System.err.println("# error: cannot mix types. -> " + (((St_whileContext)_localctx).e1!=null?_input.getText(((St_whileContext)_localctx).e1.start,((St_whileContext)_localctx).e1.stop):null) + " and " + (((St_whileContext)_localctx).e2!=null?_input.getText(((St_whileContext)_localctx).e2.start,((St_whileContext)_localctx).e2.stop):null) + "! [Line " + (((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getLine():0) + "]");
							has_error = true;
						}
					
			setState(162);
			match(COLON);
			setState(163);
			match(INDENT);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(169);
			match(DEDENT);

			            emit("    goto BEGIN_WHILE_" + while_local, 1);
			            System.out.println("END_WHILE_" + while_local + ":");
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SauroParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SauroParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SauroParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SauroParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((ExpressionContext)_localctx).t1 = term();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(173);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				((ExpressionContext)_localctx).t2 = term();

				            if(((ExpressionContext)_localctx).t1.type == 'i' && ((ExpressionContext)_localctx).t2.type == 'i')
				            {
				                if ((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS)
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
				                System.err.println("# error: cannot mix types. -> " + (((ExpressionContext)_localctx).t1!=null?_input.getText(((ExpressionContext)_localctx).t1.start,((ExpressionContext)_localctx).t1.stop):null) + " and " + (((ExpressionContext)_localctx).t2!=null?_input.getText(((ExpressionContext)_localctx).t2.start,((ExpressionContext)_localctx).t2.stop):null) + "! [Line " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) + "]");
				                has_error = true;
				            }
				        
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).t1.type;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(SauroParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(SauroParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(SauroParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(SauroParser.OVER, i);
		}
		public List<TerminalNode> REMAINDER() { return getTokens(SauroParser.REMAINDER); }
		public TerminalNode REMAINDER(int i) {
			return getToken(SauroParser.REMAINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((TermContext)_localctx).f1 = factor();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(185);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				((TermContext)_localctx).f2 = factor();

				            if((((TermContext)_localctx).f1.type == 'i') && (((TermContext)_localctx).f2.type == 'i'))
				            {
				                if      ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) {emit("    imul", - 1);}    
				                else if ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER)  {emit("    idiv", - 1);}    
				                else                        {emit("    irem", - 1);}    
				            }
				            else
				            {
				                System.err.println("# error: cannot mix types. -> " + (((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null) + " and " + (((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null) + "! [Line " + (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) + "]");
				                has_error = true;
				            } 
				        
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public char type;
		public Token NUMBER;
		public ExpressionContext e;
		public Token VAR;
		public Token STRING;
		public TerminalNode NUMBER() { return getToken(SauroParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_BRA() { return getToken(SauroParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(SauroParser.CL_BRA, 0); }
		public TerminalNode READ_INT() { return getToken(SauroParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(SauroParser.READ_STR, 0); }
		public TerminalNode STRING() { return getToken(SauroParser.STRING, 0); }
		public TerminalNode LEN() { return getToken(SauroParser.LEN, 0); }
		public TerminalNode STR() { return getToken(SauroParser.STR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				                ((FactorContext)_localctx).type =  'i';
				                emit("    ldc "+ (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), + 1); 
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(OP_PAR);
				setState(199);
				((FactorContext)_localctx).e = expression();
				setState(200);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  ((FactorContext)_localctx).e.type;
				            
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				((FactorContext)_localctx).VAR = match(VAR);

				                if (!symbol_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null))) 
				                {
				                    System.err.println("# error: '"+ (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) +"' not defined");
				                    //System.exit(1);
				                } else 
				                {
				                    ((FactorContext)_localctx).type =  'i';
				                    emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                }
				            
				setState(205);
				match(OP_BRA);
				setState(206);
				((FactorContext)_localctx).e = expression();
				setState(207);
				match(CL_BRA);

				                emit("    invokevirtual List/get(I)I", + 1);
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				((FactorContext)_localctx).VAR = match(VAR);

				                if (!symbol_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null))) 
				                {
				                    System.err.println("# error: '"+ (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) +"' not defined");
				                    //System.exit(1);
				                } 
				                else 
				                {
				                    if (type_table.get(symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null))) == 'i') 
				                    {
				                        emit("    iload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                    } 
				                    else 
				                    {
				                        emit("aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                    }

				                    ((FactorContext)_localctx).type =  type_table.get(symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)));
				                }
				            
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(READ_INT);
				setState(213);
				match(OP_PAR);
				setState(214);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    invokestatic Runtime/readInt()I", +1);
				            
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(READ_STR);
				setState(217);
				match(OP_PAR);
				setState(218);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    invokestatic Runtime/readString()Ljava/lang/String;", - 1);
				            
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				((FactorContext)_localctx).STRING = match(STRING);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    ldc "+ (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), + 1); 
				            
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(LEN);
				setState(223);
				match(OP_PAR);
				setState(224);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(225);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                emit("    invokevirtual List/len()I", 0);
				            
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				match(STR);
				setState(228);
				match(OP_PAR);
				setState(229);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(230);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                emit("    invokevirtual List/str()Ljava/lang/String;", 0);
				            
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\64"+
		"\n\3\r\3\16\3\65\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13"+
		"\4\3\5\3\5\6\5G\n\5\r\5\16\5H\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6V\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u0098\n\r\r\r\16\r\u0099\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\7\20\u00c0\n\20\f\20\16\20\u00c3\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00eb\n\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\7\f\3\2\r\16\3"+
		"\2\17\21\2\u00f5\2\"\3\2\2\2\4+\3\2\2\2\6:\3\2\2\2\bD\3\2\2\2\nU\3\2\2"+
		"\2\fW\3\2\2\2\16\\\3\2\2\2\20n\3\2\2\2\22v\3\2\2\2\24\177\3\2\2\2\26\u0089"+
		"\3\2\2\2\30\u008e\3\2\2\2\32\u009e\3\2\2\2\34\u00ae\3\2\2\2\36\u00ba\3"+
		"\2\2\2 \u00ea\3\2\2\2\"&\b\2\1\2#%\5\4\3\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2"+
		"\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\5\b\5\2*\3\3\2\2\2+,\7!\2\2,-\7#"+
		"\2\2-.\7\22\2\2./\7\23\2\2/\60\7\26\2\2\60\61\7(\2\2\61\63\b\3\1\2\62"+
		"\64\5\n\6\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\7)\2\289\b\3\1\29\5\3\2\2\2:;\7#\2\2;A\b\4\1\2<=\7\25"+
		"\2\2=>\7#\2\2>@\b\4\1\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2"+
		"\2\2CA\3\2\2\2DF\b\5\1\2EG\5\n\6\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2IJ\3\2\2\2JK\b\5\1\2K\t\3\2\2\2LV\5\16\b\2MV\5\26\f\2NV\5\30\r\2O"+
		"V\5\32\16\2PV\5\f\7\2QV\5\20\t\2RV\5\22\n\2SV\5\24\13\2TV\7&\2\2UL\3\2"+
		"\2\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2"+
		"\2\2UT\3\2\2\2V\13\3\2\2\2WX\7#\2\2XY\7\22\2\2YZ\7\23\2\2Z[\b\7\1\2[\r"+
		"\3\2\2\2\\]\7\27\2\2]^\7\22\2\2^_\b\b\1\2_`\5\34\17\2`h\b\b\1\2ab\7\25"+
		"\2\2bc\b\b\1\2cd\5\34\17\2de\b\b\1\2eg\3\2\2\2fa\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\23\2\2lm\b\b\1\2m\17\3\2\2\2"+
		"no\7#\2\2op\b\t\1\2pq\7\24\2\2qr\7\33\2\2rs\7\22\2\2st\7\23\2\2tu\b\t"+
		"\1\2u\21\3\2\2\2vw\7#\2\2wx\b\n\1\2xy\7\36\2\2yz\7\32\2\2z{\7\22\2\2{"+
		"|\5\34\17\2|}\7\23\2\2}~\b\n\1\2~\23\3\2\2\2\177\u0080\7#\2\2\u0080\u0081"+
		"\b\13\1\2\u0081\u0082\7\34\2\2\u0082\u0083\5\34\17\2\u0083\u0084\b\13"+
		"\1\2\u0084\u0085\7\35\2\2\u0085\u0086\7\24\2\2\u0086\u0087\5\34\17\2\u0087"+
		"\u0088\b\13\1\2\u0088\25\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7\24\2"+
		"\2\u008b\u008c\5\34\17\2\u008c\u008d\b\f\1\2\u008d\27\3\2\2\2\u008e\u008f"+
		"\b\r\1\2\u008f\u0090\7\3\2\2\u0090\u0091\5\34\17\2\u0091\u0092\t\2\2\2"+
		"\u0092\u0093\5\34\17\2\u0093\u0094\b\r\1\2\u0094\u0095\7\26\2\2\u0095"+
		"\u0097\7(\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7)\2\2\u009c\u009d\b\r\1\2\u009d\31\3\2\2\2\u009e\u009f\b\16\1"+
		"\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\t\2\2\2\u00a2"+
		"\u00a3\5\34\17\2\u00a3\u00a4\b\16\1\2\u00a4\u00a5\7\26\2\2\u00a5\u00a7"+
		"\7(\2\2\u00a6\u00a8\5\n\6\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7)"+
		"\2\2\u00ac\u00ad\b\16\1\2\u00ad\33\3\2\2\2\u00ae\u00b5\5\36\20\2\u00af"+
		"\u00b0\t\3\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\b\17\1\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\17"+
		"\1\2\u00b9\35\3\2\2\2\u00ba\u00c1\5 \21\2\u00bb\u00bc\t\4\2\2\u00bc\u00bd"+
		"\5 \21\2\u00bd\u00be\b\20\1\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\20\1\2\u00c5\37\3\2\2\2\u00c6"+
		"\u00c7\7\"\2\2\u00c7\u00eb\b\21\1\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca\5"+
		"\34\17\2\u00ca\u00cb\7\23\2\2\u00cb\u00cc\b\21\1\2\u00cc\u00eb\3\2\2\2"+
		"\u00cd\u00ce\7#\2\2\u00ce\u00cf\b\21\1\2\u00cf\u00d0\7\34\2\2\u00d0\u00d1"+
		"\5\34\17\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\b\21\1\2\u00d3\u00eb\3\2\2"+
		"\2\u00d4\u00d5\7#\2\2\u00d5\u00eb\b\21\1\2\u00d6\u00d7\7\30\2\2\u00d7"+
		"\u00d8\7\22\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00eb\b\21\1\2\u00da\u00db"+
		"\7\31\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00eb\b\21\1"+
		"\2\u00de\u00df\7$\2\2\u00df\u00eb\b\21\1\2\u00e0\u00e1\7\37\2\2\u00e1"+
		"\u00e2\7\22\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\7\23\2\2\u00e4\u00eb\b"+
		"\21\1\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\7#\2\2\u00e8"+
		"\u00e9\7\23\2\2\u00e9\u00eb\b\21\1\2\u00ea\u00c6\3\2\2\2\u00ea\u00c8\3"+
		"\2\2\2\u00ea\u00cd\3\2\2\2\u00ea\u00d4\3\2\2\2\u00ea\u00d6\3\2\2\2\u00ea"+
		"\u00da\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e5\3\2"+
		"\2\2\u00eb!\3\2\2\2\r&\65AHUh\u0099\u00a9\u00b5\u00c1\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}