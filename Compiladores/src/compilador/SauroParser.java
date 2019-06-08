// Generated from Sauro.g by ANTLR 4.7.2

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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, WHILE=2, OP_CUR=3, CL_CUR=4, EQ=5, NE=6, GT=7, GE=8, LT=9, LE=10, 
		PLUS=11, MINUS=12, TIMES=13, OVER=14, REMAINDER=15, OP_PAR=16, CL_PAR=17, 
		ATTRIB=18, COMMA=19, COLON=20, PRINT=21, READ_INT=22, READ_STR=23, RETURN=24, 
		APPEND=25, LIST=26, OP_BRA=27, CL_BRA=28, DOT=29, LEN=30, STR=31, INT=32, 
		DEF=33, NUMBER=34, VAR=35, STRING=36, COMMENT=37, NL=38, SPACE=39, INDENT=40, 
		DEDENT=41;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_arguments = 3, 
		RULE_main = 4, RULE_statement = 5, RULE_st_call = 6, RULE_st_print = 7, 
		RULE_st_new_list = 8, RULE_st_list_append = 9, RULE_st_list_attrib = 10, 
		RULE_st_attrib = 11, RULE_st_if = 12, RULE_st_while = 13, RULE_expression = 14, 
		RULE_term = 15, RULE_st_return = 16, RULE_factor = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "arguments", "main", "statement", 
			"st_call", "st_print", "st_new_list", "st_list_append", "st_list_attrib", 
			"st_attrib", "st_if", "st_while", "expression", "term", "st_return", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "':'", "'print'", "'read_int'", "'read_str'", "'return'", "'append'", 
			"'list'", "'['", "']'", "'.'", "'len'", "'str'", "'int'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "WHILE", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", 
			"LE", "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
			"ATTRIB", "COMMA", "COLON", "PRINT", "READ_INT", "READ_STR", "RETURN", 
			"APPEND", "LIST", "OP_BRA", "CL_BRA", "DOT", "LEN", "STR", "INT", "DEF", 
			"NUMBER", "VAR", "STRING", "COMMENT", "NL", "SPACE", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitProgram(this);
		}
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
			        
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(37);
				function();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode INT() { return getToken(SauroParser.INT, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						r = "V"; 
						function_return = false; 
					
			setState(46);
			match(DEF);
			setState(47);
			((FunctionContext)_localctx).VAR = match(VAR);
			setState(48);
			match(OP_PAR);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(49);
				parameters();
				}
			}

			setState(52);
			match(CL_PAR);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(53);
				match(INT);
				 
							r = "I"; 
							function_return = true; 
							function_return_expected = true; 
						
				}
			}

			setState(57);
			match(COLON);
			setState(58);
			match(INDENT);

						String qt_param = "";
						for (int i = 0; i < num_param; i++)
						{ 
							qt_param = qt_param + "I";
						}
						
			            System.out.println("\n.method public static " + (((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null) + "(" + qt_param + ")"+ r);   //.method public static cube()V
						num_param = 0;
						
			            if(!func_table.contains((((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null)))
			            {
			                func_table.add((((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null));
			            }
			            else
			            {
			                System.err.println("Function already exists: " + (((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null)); 
			                has_error = true;
			            }
			        
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << NL))) != 0) );
			setState(65);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ParametersContext)_localctx).VAR = match(VAR);

			            if(!symbol_table.contains((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null)))
			            {
							num_param = 1;
			                symbol_table.add((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null));
			                type_table.add('i');
			            }
			        
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				((ParametersContext)_localctx).VAR = match(VAR);

				            if (!symbol_table.contains((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null)))
				            {
								num_param++;
				                symbol_table.add((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null));
				                type_table.add('i');
				            }
				        
				}
				}
				setState(77);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			((ArgumentsContext)_localctx).e1 = expression();
			}
			 
						num_args = 1;
						if(((ArgumentsContext)_localctx).e1.type == 'a')
						{
			                System.err.println("Apenas Inteiros."); 
			                has_error = true;
						}
			        
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				((ArgumentsContext)_localctx).e2 = expression();
				 	
							num_args++;
				            if(((ArgumentsContext)_localctx).e2.type == 'a')
							{
				                System.err.println("Apenas Inteiros."); 
				                has_error = true;
							}		
				        
				}
				}
				setState(88);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println("\n.method public static main([Ljava/lang/String;)V");
			            symbol_table.add("args");
			            type_table.add('-');
			        
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << NL))) != 0) );

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
		public St_returnContext st_return() {
			return getRuleContext(St_returnContext.class,0);
		}
		public TerminalNode NL() { return getToken(SauroParser.NL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				st_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				st_new_list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				st_list_append();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				st_list_attrib();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				st_return();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_call(this);
		}
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((St_callContext)_localctx).VAR = match(VAR);
			setState(110);
			match(OP_PAR);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << LEN) | (1L << STR) | (1L << NUMBER) | (1L << VAR) | (1L << STRING))) != 0)) {
				{
				setState(111);
				arguments();
				}
			}

			setState(114);
			match(CL_PAR);

							if(!func_table.contains((((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null)))
							{
								System.err.println("Function do not exists: " + (((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null)); 
								has_error = true;
							}
							String qt_argumentos = "";
							for (int i = 0; i < num_args; i++)
							{ 
								qt_argumentos = qt_argumentos + "I";
							}
							num_args = 0;
							emit("    invokestatic Test/" + (((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null) + "("+qt_argumentos+")V", 0);
			            
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_print(this);
		}
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PRINT);
			setState(118);
			match(OP_PAR);
			 
			                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
			            
			setState(120);
			((St_printContext)_localctx).e1 = expression();

			                if (((St_printContext)_localctx).e1.type == 'i') 
			                {
			                    emit("    invokevirtual java/io/PrintStream/println(I)V", - 2);
			                } 
			                else 
			                {
			                    emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
			                }
			            
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				 
				                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				            
				setState(124);
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
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_new_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_new_list(this);
		}
	}

	public final St_new_listContext st_new_list() throws RecognitionException {
		St_new_listContext _localctx = new St_new_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_new_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((St_new_listContext)_localctx).VAR = match(VAR);

			            symbol_table.add((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			            int address = symbol_table.indexOf((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			        
			setState(137);
			match(ATTRIB);
			setState(138);
			match(LIST);
			setState(139);
			match(OP_PAR);
			setState(140);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_list_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_list_append(this);
		}
	}

	public final St_list_appendContext st_list_append() throws RecognitionException {
		St_list_appendContext _localctx = new St_list_appendContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_list_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((St_list_appendContext)_localctx).VAR = match(VAR);

			            int address = symbol_table.indexOf((((St_list_appendContext)_localctx).VAR!=null?((St_list_appendContext)_localctx).VAR.getText():null));
			            emit("    aload " + address, + 1);
			        
			setState(145);
			match(DOT);
			setState(146);
			match(APPEND);
			setState(147);
			match(OP_PAR);
			setState(148);
			((St_list_appendContext)_localctx).e = expression();
			setState(149);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_list_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_list_attrib(this);
		}
	}

	public final St_list_attribContext st_list_attrib() throws RecognitionException {
		St_list_attribContext _localctx = new St_list_attribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st_list_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((St_list_attribContext)_localctx).VAR = match(VAR);

			                int address = symbol_table.indexOf((((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getText():null));
			                emit("    aload " + address + "\n", + 1);
			            
			setState(154);
			match(OP_BRA);
			setState(155);
			((St_list_attribContext)_localctx).e1 = expression();

			                if (((St_list_attribContext)_localctx).e1.type != 'i') 
			                {
			                    System.err.println("# error: list index must be integer");
			                    //System.exit(1);
			                }
			            
			setState(157);
			match(CL_BRA);
			setState(158);
			match(ATTRIB);
			setState(159);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_attrib(this);
		}
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(163);
			match(ATTRIB);
			setState(164);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_if(this);
		}
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            if_count++;
			            int if_local = if_count;
			        
			setState(168);
			match(IF);
			setState(169);
			((St_ifContext)_localctx).e1 = expression();
			setState(170);
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
			setState(171);
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
			        
			setState(173);
			match(COLON);
			setState(174);
			match(INDENT);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << NL))) != 0) );
			setState(180);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_while(this);
		}
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            while_count++;
			            int while_local = while_count;
			            System.out.println("BEGIN_WHILE_" + while_local + ":"); 
			        
			setState(184);
			match(WHILE);
			setState(185);
			((St_whileContext)_localctx).e1 = expression();
			setState(186);
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
			setState(187);
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
					
			setState(189);
			match(COLON);
			setState(190);
			match(INDENT);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << VAR) | (1L << NL))) != 0) );
			setState(196);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((ExpressionContext)_localctx).t1 = term();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(200);
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
				setState(201);
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
				setState(208);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((TermContext)_localctx).f1 = factor();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(212);
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
				setState(213);
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
				setState(220);
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

	public static class St_returnContext extends ParserRuleContext {
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(SauroParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_return(this);
		}
	}

	public final St_returnContext st_return() throws RecognitionException {
		St_returnContext _localctx = new St_returnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_st_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(RETURN);
			setState(224);
			((St_returnContext)_localctx).e = expression();

						if(function_return == false)
			            {
			                System.err.println("Integer return not expected"); 
			                has_error = true;
			            }    
			            if(((St_returnContext)_localctx).e.type == 'a')
						{
			                System.err.println("Waited an integer on return"); 
			                has_error = true;
			            }
			            else
						{
			                function_return_expected = false;
			                emit("ireturn", - 1);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode READ_INT() { return getToken(SauroParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(SauroParser.READ_STR, 0); }
		public TerminalNode STRING() { return getToken(SauroParser.STRING, 0); }
		public TerminalNode LEN() { return getToken(SauroParser.LEN, 0); }
		public TerminalNode STR() { return getToken(SauroParser.STR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				                ((FactorContext)_localctx).type =  'i';
				                emit("    ldc "+ (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), + 1); 
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(OP_PAR);
				setState(230);
				((FactorContext)_localctx).e = expression();
				setState(231);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  ((FactorContext)_localctx).e.type;
				            
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
				            
				setState(236);
				match(OP_BRA);
				setState(237);
				((FactorContext)_localctx).e = expression();
				setState(238);
				match(CL_BRA);

				                emit("    invokevirtual List/get(I)I", + 1);
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
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
				setState(243);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(244);
				match(OP_PAR);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << LEN) | (1L << STR) | (1L << NUMBER) | (1L << VAR) | (1L << STRING))) != 0)) {
					{
					setState(245);
					arguments();
					}
				}

				setState(248);
				match(CL_PAR);

								((FactorContext)_localctx).type =  'i';
								if(!func_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)))
								{
									System.err.println("Function do not exists: " + (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)); 
									has_error = true;
								}
								String qt_argumentos = "";
								for (int i = 0; i < num_args; i++)
								{ 
									qt_argumentos = qt_argumentos + "I";
								}
								num_args = 0;
								emit("    invokestatic Test/" + (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) + "("+qt_argumentos+")I", 0);
							
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(READ_INT);
				setState(251);
				match(OP_PAR);
				setState(252);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    invokestatic Runtime/readInt()I", +1);
				            
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				match(READ_STR);
				setState(255);
				match(OP_PAR);
				setState(256);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    invokestatic Runtime/readString()Ljava/lang/String;", - 1);
				            
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				((FactorContext)_localctx).STRING = match(STRING);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    ldc "+ (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), + 1); 
				            
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				match(LEN);
				setState(261);
				match(OP_PAR);
				setState(262);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(263);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                emit("    invokevirtual List/len()I", 0);
				            
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(265);
				match(STR);
				setState(266);
				match(OP_PAR);
				setState(267);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(268);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\6\3@\n\3\r\3\16\3A\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\6\3\6\6\6^\n\6\r\6\16\6_\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\5\bs\n\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16"+
		"\t\u0085\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\6\16\u00b3\n\16\r\16\16\16\u00b4\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\6\17\u00c3\n\17\r\17\16\17\u00c4\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00cf\n\20\f\20\16\20\u00d2\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00db\n\21\f\21\16\21\u00de\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f9\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0111\n\23\3\23\2\2\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\7\f\3\2\r\16\3\2\17"+
		"\21\2\u0120\2&\3\2\2\2\4/\3\2\2\2\6F\3\2\2\2\bP\3\2\2\2\n[\3\2\2\2\fm"+
		"\3\2\2\2\16o\3\2\2\2\20w\3\2\2\2\22\u0089\3\2\2\2\24\u0091\3\2\2\2\26"+
		"\u009a\3\2\2\2\30\u00a4\3\2\2\2\32\u00a9\3\2\2\2\34\u00b9\3\2\2\2\36\u00c9"+
		"\3\2\2\2 \u00d5\3\2\2\2\"\u00e1\3\2\2\2$\u0110\3\2\2\2&*\b\2\1\2\')\5"+
		"\4\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-."+
		"\5\n\6\2.\3\3\2\2\2/\60\b\3\1\2\60\61\7#\2\2\61\62\7%\2\2\62\64\7\22\2"+
		"\2\63\65\5\6\4\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\669\7\23\2"+
		"\2\678\7\"\2\28:\b\3\1\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\26\2\2<="+
		"\7*\2\2=?\b\3\1\2>@\5\f\7\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC"+
		"\3\2\2\2CD\7+\2\2DE\b\3\1\2E\5\3\2\2\2FG\7%\2\2GM\b\4\1\2HI\7\25\2\2I"+
		"J\7%\2\2JL\b\4\1\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2"+
		"OM\3\2\2\2PQ\5\36\20\2QX\b\5\1\2RS\7\25\2\2ST\5\36\20\2TU\b\5\1\2UW\3"+
		"\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\t\3\2\2\2ZX\3\2\2\2[]"+
		"\b\6\1\2\\^\5\f\7\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2"+
		"ab\b\6\1\2b\13\3\2\2\2cn\5\20\t\2dn\5\30\r\2en\5\32\16\2fn\5\34\17\2g"+
		"n\5\16\b\2hn\5\22\n\2in\5\24\13\2jn\5\26\f\2kn\5\"\22\2ln\7(\2\2mc\3\2"+
		"\2\2md\3\2\2\2me\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2mj\3\2"+
		"\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2op\7%\2\2pr\7\22\2\2qs\5\b\5\2rq\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\23\2\2uv\b\b\1\2v\17\3\2\2\2wx\7\27\2\2"+
		"xy\7\22\2\2yz\b\t\1\2z{\5\36\20\2{\u0083\b\t\1\2|}\7\25\2\2}~\b\t\1\2"+
		"~\177\5\36\20\2\177\u0080\b\t\1\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\23\2\2\u0087\u0088\b\t\1\2\u0088"+
		"\21\3\2\2\2\u0089\u008a\7%\2\2\u008a\u008b\b\n\1\2\u008b\u008c\7\24\2"+
		"\2\u008c\u008d\7\34\2\2\u008d\u008e\7\22\2\2\u008e\u008f\7\23\2\2\u008f"+
		"\u0090\b\n\1\2\u0090\23\3\2\2\2\u0091\u0092\7%\2\2\u0092\u0093\b\13\1"+
		"\2\u0093\u0094\7\37\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\22\2\2\u0096"+
		"\u0097\5\36\20\2\u0097\u0098\7\23\2\2\u0098\u0099\b\13\1\2\u0099\25\3"+
		"\2\2\2\u009a\u009b\7%\2\2\u009b\u009c\b\f\1\2\u009c\u009d\7\35\2\2\u009d"+
		"\u009e\5\36\20\2\u009e\u009f\b\f\1\2\u009f\u00a0\7\36\2\2\u00a0\u00a1"+
		"\7\24\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\b\f\1\2\u00a3\27\3\2\2\2\u00a4"+
		"\u00a5\7%\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\b"+
		"\r\1\2\u00a8\31\3\2\2\2\u00a9\u00aa\b\16\1\2\u00aa\u00ab\7\3\2\2\u00ab"+
		"\u00ac\5\36\20\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af"+
		"\b\16\1\2\u00af\u00b0\7\26\2\2\u00b0\u00b2\7*\2\2\u00b1\u00b3\5\f\7\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7\u00b8\b\16\1\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00ba\b\17\1\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\5\36"+
		"\20\2\u00bc\u00bd\t\2\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\b\17\1\2\u00bf"+
		"\u00c0\7\26\2\2\u00c0\u00c2\7*\2\2\u00c1\u00c3\5\f\7\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\b\17\1\2\u00c8\35\3\2\2"+
		"\2\u00c9\u00d0\5 \21\2\u00ca\u00cb\t\3\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd"+
		"\b\20\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d2\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d4\b\20\1\2\u00d4\37\3\2\2\2\u00d5\u00dc\5$\23\2\u00d6"+
		"\u00d7\t\4\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9\b\21\1\2\u00d9\u00db\3"+
		"\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\21"+
		"\1\2\u00e0!\3\2\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4"+
		"\b\22\1\2\u00e4#\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6\u0111\b\23\1\2\u00e7"+
		"\u00e8\7\22\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb"+
		"\b\23\1\2\u00eb\u0111\3\2\2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee\b\23\1\2"+
		"\u00ee\u00ef\7\35\2\2\u00ef\u00f0\5\36\20\2\u00f0\u00f1\7\36\2\2\u00f1"+
		"\u00f2\b\23\1\2\u00f2\u0111\3\2\2\2\u00f3\u00f4\7%\2\2\u00f4\u0111\b\23"+
		"\1\2\u00f5\u00f6\7%\2\2\u00f6\u00f8\7\22\2\2\u00f7\u00f9\5\b\5\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\23"+
		"\2\2\u00fb\u0111\b\23\1\2\u00fc\u00fd\7\30\2\2\u00fd\u00fe\7\22\2\2\u00fe"+
		"\u00ff\7\23\2\2\u00ff\u0111\b\23\1\2\u0100\u0101\7\31\2\2\u0101\u0102"+
		"\7\22\2\2\u0102\u0103\7\23\2\2\u0103\u0111\b\23\1\2\u0104\u0105\7&\2\2"+
		"\u0105\u0111\b\23\1\2\u0106\u0107\7 \2\2\u0107\u0108\7\22\2\2\u0108\u0109"+
		"\7%\2\2\u0109\u010a\7\23\2\2\u010a\u0111\b\23\1\2\u010b\u010c\7!\2\2\u010c"+
		"\u010d\7\22\2\2\u010d\u010e\7%\2\2\u010e\u010f\7\23\2\2\u010f\u0111\b"+
		"\23\1\2\u0110\u00e5\3\2\2\2\u0110\u00e7\3\2\2\2\u0110\u00ec\3\2\2\2\u0110"+
		"\u00f3\3\2\2\2\u0110\u00f5\3\2\2\2\u0110\u00fc\3\2\2\2\u0110\u0100\3\2"+
		"\2\2\u0110\u0104\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0111"+
		"%\3\2\2\2\22*\649AMX_mr\u0083\u00b4\u00c4\u00d0\u00dc\u00f8\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}