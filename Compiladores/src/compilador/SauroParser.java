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
		ATTRIB=18, COMMA=19, COLON=20, PRINT=21, READ_INT=22, READ_STR=23, APPEND=24, 
		LIST=25, OP_BRA=26, CL_BRA=27, DOT=28, LEN=29, STR=30, DEF=31, NUMBER=32, 
		VAR=33, STRING=34, COMMENT=35, NL=36, SPACE=37, INDENT=38, DEDENT=39;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_parameters = 2, RULE_arguments = 3, 
		RULE_main = 4, RULE_statement = 5, RULE_st_call = 6, RULE_st_print = 7, 
		RULE_st_new_list = 8, RULE_st_list_append = 9, RULE_st_list_attrib = 10, 
		RULE_st_attrib = 11, RULE_st_if = 12, RULE_st_while = 13, RULE_expression = 14, 
		RULE_term = 15, RULE_factor = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "parameters", "arguments", "main", "statement", 
			"st_call", "st_print", "st_new_list", "st_list_append", "st_list_attrib", 
			"st_attrib", "st_if", "st_while", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "':'", "'print'", "'read_int'", "'read_str'", "'append'", "'list'", 
			"'['", "']'", "'.'", "'len'", "'str'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "WHILE", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", 
			"LE", "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
			"ATTRIB", "COMMA", "COLON", "PRINT", "READ_INT", "READ_STR", "APPEND", 
			"LIST", "OP_BRA", "CL_BRA", "DOT", "LEN", "STR", "DEF", "NUMBER", "VAR", 
			"STRING", "COMMENT", "NL", "SPACE", "INDENT", "DEDENT"
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
			        
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(35);
				function();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			setState(43);
			match(DEF);
			setState(44);
			((FunctionContext)_localctx).VAR = match(VAR);
			setState(45);
			match(OP_PAR);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(46);
				parameters();
				}
			}

			setState(49);
			match(CL_PAR);
			setState(50);
			match(COLON);
			setState(51);
			match(INDENT);

						String qt_param = "";
						for (int i = 0; i < num_param; i++)
						{ 
							qt_param = qt_param + "I";
						}
						
			            System.out.println("\n.method public static " + (((FunctionContext)_localctx).VAR!=null?((FunctionContext)_localctx).VAR.getText():null) + "(" + qt_param + ")V");   //.method public static cube()V
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
			        
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(58);
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
			setState(61);
			((ParametersContext)_localctx).VAR = match(VAR);

			            if(!symbol_table.contains((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null)))
			            {
							num_param = 1;
			                symbol_table.add((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null));
			                type_table.add('i');
			            }
			        
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(63);
				match(COMMA);
				setState(64);
				((ParametersContext)_localctx).VAR = match(VAR);

				            if (!symbol_table.contains((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null)))
				            {
								num_param++;
				                symbol_table.add((((ParametersContext)_localctx).VAR!=null?((ParametersContext)_localctx).VAR.getText():null));
				                type_table.add('i');
				            }
				        
				}
				}
				setState(70);
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
			setState(71);
			((ArgumentsContext)_localctx).e1 = expression();
			}
			 
						num_args = 1;
						if(((ArgumentsContext)_localctx).e1.type == 'a')
						{
			                System.err.println("Apenas Inteiros."); 
			                has_error = true;
						}
			        
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				((ArgumentsContext)_localctx).e2 = expression();
				 	
							num_args++;
				            if(((ArgumentsContext)_localctx).e2.type == 'a')
							{
				                System.err.println("Apenas Inteiros."); 
				                has_error = true;
							}		
				        
				}
				}
				setState(81);
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
			        
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				statement();
				}
				}
				setState(86); 
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				st_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				st_new_list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				st_list_append();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				st_list_attrib();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
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
			setState(101);
			((St_callContext)_localctx).VAR = match(VAR);
			setState(102);
			match(OP_PAR);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PAR) | (1L << READ_INT) | (1L << READ_STR) | (1L << LEN) | (1L << STR) | (1L << NUMBER) | (1L << VAR) | (1L << STRING))) != 0)) {
				{
				setState(103);
				arguments();
				}
			}

			setState(106);
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
							//emit("    invokestatic Test/" + (((St_callContext)_localctx).VAR!=null?((St_callContext)_localctx).VAR.getText():null) + "("+qt_argumentos+")V", 0);
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
			setState(109);
			match(PRINT);
			setState(110);
			match(OP_PAR);
			 
			                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
			            
			setState(112);
			((St_printContext)_localctx).e1 = expression();

			                if (((St_printContext)_localctx).e1.type == 'i') 
			                {
			                    emit("    invokevirtual java/io/PrintStream/println(I)V", - 2);
			                } 
			                else 
			                {
			                    emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 2);
			                }
			            
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				 
				                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				            
				setState(116);
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
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(127);
			((St_new_listContext)_localctx).VAR = match(VAR);

			            symbol_table.add((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			            int address = symbol_table.indexOf((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			        
			setState(129);
			match(ATTRIB);
			setState(130);
			match(LIST);
			setState(131);
			match(OP_PAR);
			setState(132);
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
			setState(135);
			((St_list_appendContext)_localctx).VAR = match(VAR);

			            int address = symbol_table.indexOf((((St_list_appendContext)_localctx).VAR!=null?((St_list_appendContext)_localctx).VAR.getText():null));
			            emit("    aload " + address, + 1);
			        
			setState(137);
			match(DOT);
			setState(138);
			match(APPEND);
			setState(139);
			match(OP_PAR);
			setState(140);
			((St_list_appendContext)_localctx).e = expression();
			setState(141);
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
			setState(144);
			((St_list_attribContext)_localctx).VAR = match(VAR);

			                int address = symbol_table.indexOf((((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getText():null));
			                emit("    aload " + address + "\n", + 1);
			            
			setState(146);
			match(OP_BRA);
			setState(147);
			((St_list_attribContext)_localctx).e1 = expression();

			                if (((St_list_attribContext)_localctx).e1.type != 'i') 
			                {
			                    System.err.println("# error: list index must be integer");
			                    //System.exit(1);
			                }
			            
			setState(149);
			match(CL_BRA);
			setState(150);
			match(ATTRIB);
			setState(151);
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
			setState(154);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(155);
			match(ATTRIB);
			setState(156);
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
			        
			setState(160);
			match(IF);
			setState(161);
			((St_ifContext)_localctx).e1 = expression();
			setState(162);
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
			setState(163);
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
			        
			setState(165);
			match(COLON);
			setState(166);
			match(INDENT);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				statement();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(172);
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
			        
			setState(176);
			match(WHILE);
			setState(177);
			((St_whileContext)_localctx).e1 = expression();
			setState(178);
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
			setState(179);
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
					
			setState(181);
			match(COLON);
			setState(182);
			match(INDENT);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(188);
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
			setState(191);
			((ExpressionContext)_localctx).t1 = term();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(192);
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
				setState(193);
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
				setState(200);
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
			setState(203);
			((TermContext)_localctx).f1 = factor();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(204);
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
				setState(205);
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
				setState(212);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				                ((FactorContext)_localctx).type =  'i';
				                emit("    ldc "+ (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), + 1); 
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(OP_PAR);
				setState(218);
				((FactorContext)_localctx).e = expression();
				setState(219);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  ((FactorContext)_localctx).e.type;
				            
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
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
				            
				setState(224);
				match(OP_BRA);
				setState(225);
				((FactorContext)_localctx).e = expression();
				setState(226);
				match(CL_BRA);

				                emit("    invokevirtual List/get(I)I", + 1);
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
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
				setState(231);
				match(READ_INT);
				setState(232);
				match(OP_PAR);
				setState(233);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    invokestatic Runtime/readInt()I", +1);
				            
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				match(READ_STR);
				setState(236);
				match(OP_PAR);
				setState(237);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    invokestatic Runtime/readString()Ljava/lang/String;", - 1);
				            
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				((FactorContext)_localctx).STRING = match(STRING);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    ldc "+ (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), + 1); 
				            
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				match(LEN);
				setState(242);
				match(OP_PAR);
				setState(243);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(244);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                emit("    invokevirtual List/len()I", 0);
				            
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				match(STR);
				setState(247);
				match(OP_PAR);
				setState(248);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(249);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13"+
		"\5\3\6\3\6\6\6W\n\6\r\6\16\6X\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7f\n\7\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\6\16\u00ab\n\16\r\16\16\16\u00ac\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00bb\n\17\r\17"+
		"\16\17\u00bc\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00c7\n\20\f"+
		"\20\16\20\u00ca\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00d3\n"+
		"\21\f\21\16\21\u00d6\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00fe\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\5\3\2\7\f\3\2\r\16\3\2\17\21\2\u010a\2$\3\2\2\2\4-\3\2\2\2\6"+
		"?\3\2\2\2\bI\3\2\2\2\nT\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20o\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u0089\3\2\2\2\26\u0092\3\2\2\2\30\u009c\3\2\2\2\32\u00a1"+
		"\3\2\2\2\34\u00b1\3\2\2\2\36\u00c1\3\2\2\2 \u00cd\3\2\2\2\"\u00fd\3\2"+
		"\2\2$(\b\2\1\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3"+
		"\2\2\2*(\3\2\2\2+,\5\n\6\2,\3\3\2\2\2-.\7!\2\2./\7#\2\2/\61\7\22\2\2\60"+
		"\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\23\2\2\64"+
		"\65\7\26\2\2\65\66\7(\2\2\668\b\3\1\2\679\5\f\7\28\67\3\2\2\29:\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7)\2\2=>\b\3\1\2>\5\3\2\2\2?@\7#\2"+
		"\2@F\b\4\1\2AB\7\25\2\2BC\7#\2\2CE\b\4\1\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\5\36\20\2JQ\b\5\1\2KL\7\25\2\2LM\5"+
		"\36\20\2MN\b\5\1\2NP\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R"+
		"\t\3\2\2\2SQ\3\2\2\2TV\b\6\1\2UW\5\f\7\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z[\b\6\1\2[\13\3\2\2\2\\f\5\20\t\2]f\5\30\r\2^f\5"+
		"\32\16\2_f\5\34\17\2`f\5\16\b\2af\5\22\n\2bf\5\24\13\2cf\5\26\f\2df\7"+
		"&\2\2e\\\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3"+
		"\2\2\2ec\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gh\7#\2\2hj\7\22\2\2ik\5\b\5\2ji"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\23\2\2mn\b\b\1\2n\17\3\2\2\2op\7\27\2"+
		"\2pq\7\22\2\2qr\b\t\1\2rs\5\36\20\2s{\b\t\1\2tu\7\25\2\2uv\b\t\1\2vw\5"+
		"\36\20\2wx\b\t\1\2xz\3\2\2\2yt\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|"+
		"~\3\2\2\2}{\3\2\2\2~\177\7\23\2\2\177\u0080\b\t\1\2\u0080\21\3\2\2\2\u0081"+
		"\u0082\7#\2\2\u0082\u0083\b\n\1\2\u0083\u0084\7\24\2\2\u0084\u0085\7\33"+
		"\2\2\u0085\u0086\7\22\2\2\u0086\u0087\7\23\2\2\u0087\u0088\b\n\1\2\u0088"+
		"\23\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\b\13\1\2\u008b\u008c\7\36\2"+
		"\2\u008c\u008d\7\32\2\2\u008d\u008e\7\22\2\2\u008e\u008f\5\36\20\2\u008f"+
		"\u0090\7\23\2\2\u0090\u0091\b\13\1\2\u0091\25\3\2\2\2\u0092\u0093\7#\2"+
		"\2\u0093\u0094\b\f\1\2\u0094\u0095\7\34\2\2\u0095\u0096\5\36\20\2\u0096"+
		"\u0097\b\f\1\2\u0097\u0098\7\35\2\2\u0098\u0099\7\24\2\2\u0099\u009a\5"+
		"\36\20\2\u009a\u009b\b\f\1\2\u009b\27\3\2\2\2\u009c\u009d\7#\2\2\u009d"+
		"\u009e\7\24\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\b\r\1\2\u00a0\31\3\2"+
		"\2\2\u00a1\u00a2\b\16\1\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\5\36\20\2\u00a4"+
		"\u00a5\t\2\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\b\16\1\2\u00a7\u00a8"+
		"\7\26\2\2\u00a8\u00aa\7(\2\2\u00a9\u00ab\5\f\7\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\7)\2\2\u00af\u00b0\b\16\1\2\u00b0\33\3\2\2\2\u00b1\u00b2"+
		"\b\17\1\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\t\2\2"+
		"\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\b\17\1\2\u00b7\u00b8\7\26\2\2\u00b8"+
		"\u00ba\7(\2\2\u00b9\u00bb\5\f\7\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7)\2\2\u00bf\u00c0\b\17\1\2\u00c0\35\3\2\2\2\u00c1\u00c8\5 \21"+
		"\2\u00c2\u00c3\t\3\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\b\20\1\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\b\20\1\2\u00cc\37\3\2\2\2\u00cd\u00d4\5\"\22\2\u00ce\u00cf\t\4"+
		"\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\b\21\1\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\b\21\1\2\u00d8"+
		"!\3\2\2\2\u00d9\u00da\7\"\2\2\u00da\u00fe\b\22\1\2\u00db\u00dc\7\22\2"+
		"\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\7\23\2\2\u00de\u00df\b\22\1\2\u00df"+
		"\u00fe\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\b\22\1\2\u00e2\u00e3\7\34"+
		"\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6\b\22\1\2\u00e6"+
		"\u00fe\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8\u00fe\b\22\1\2\u00e9\u00ea\7\30"+
		"\2\2\u00ea\u00eb\7\22\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00fe\b\22\1\2\u00ed"+
		"\u00ee\7\31\2\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00fe"+
		"\b\22\1\2\u00f1\u00f2\7$\2\2\u00f2\u00fe\b\22\1\2\u00f3\u00f4\7\37\2\2"+
		"\u00f4\u00f5\7\22\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00fe"+
		"\b\22\1\2\u00f8\u00f9\7 \2\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\7#\2\2\u00fb"+
		"\u00fc\7\23\2\2\u00fc\u00fe\b\22\1\2\u00fd\u00d9\3\2\2\2\u00fd\u00db\3"+
		"\2\2\2\u00fd\u00e0\3\2\2\2\u00fd\u00e7\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd"+
		"\u00ed\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fe#\3\2\2\2\20(\61:FQXej{\u00ac\u00bc\u00c8\u00d4\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}