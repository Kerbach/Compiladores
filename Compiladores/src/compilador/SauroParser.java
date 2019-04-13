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
		IF=1, OP_CUR=2, CL_CUR=3, EQ=4, NE=5, GT=6, GE=7, LT=8, LE=9, PLUS=10, 
		MINUS=11, TIMES=12, OVER=13, REMAINDER=14, OP_PAR=15, CL_PAR=16, ATTRIB=17, 
		COMMA=18, PRINT=19, READ_INT=20, NUMBER=21, VAR=22, SPACE=23, COMMENT=24;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_print = 3, 
		RULE_st_attrib = 4, RULE_st_if = 5, RULE_comparison = 6, RULE_expression = 7, 
		RULE_term = 8, RULE_factor = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "st_print", "st_attrib", "st_if", "comparison", 
			"expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "','", "'print'", 
			"'read_int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", "LE", "PLUS", 
			"MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COMMA", "PRINT", "READ_INT", "NUMBER", "VAR", "SPACE", "COMMENT"
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

	    public static void main(String[] args) throws Exception
	    {
	        CharStream input = CharStreams.fromStream(System.in);
	        SauroLexer lexer = new SauroLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        SauroParser parser = new SauroParser(tokens);

	        // Tabela de Símbolos
	        symbol_table = new ArrayList<String>();
	        symbol_table.add("args");
	        parser.program();
	        System.out.println("; symbols: " + symbol_table);
	    }

	public SauroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
			        
			setState(21);
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
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println("\n.method public static main([Ljava/lang/String;)V");
			        
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << VAR))) != 0) );

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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				st_print();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				st_attrib();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				st_if();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode PRINT() { return getToken(SauroParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
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
		enterRule(_localctx, 6, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(PRINT);
			setState(37);
			match(OP_PAR);
			 
			                emit("    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
			            
			setState(39);
			expression();
			 
			                emit("    invokevirtual java/io/PrintStream/print(I)V", - 2); 
			            
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(41);
				match(COMMA);

				                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				                emit("    ldc \" \" ", + 1); 
				                emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 1); 

				                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				            
				setState(43);
				expression();
				 
				                emit("    invokevirtual java/io/PrintStream/print(I)V", - 2); 
				            
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(CL_PAR);
			 
			                emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
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

	public static class St_attribContext extends ParserRuleContext {
		public Token VAR;
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
		enterRule(_localctx, 8, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(55);
			match(ATTRIB);
			setState(56);
			expression();

			            if (!symbol_table.contains((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null)))
			            {
			                symbol_table.add((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			            }
			            int address = symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			            
			            emit("    istore " + address + "\n", - 1);
			        
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
		public TerminalNode IF() { return getToken(SauroParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode OP_CUR() { return getToken(SauroParser.OP_CUR, 0); }
		public TerminalNode CL_CUR() { return getToken(SauroParser.CL_CUR, 0); }
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
		enterRule(_localctx, 10, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int if_local = ++if_counter;
			setState(60);
			match(IF);
			setState(61);
			comparison();
			setState(62);
			match(OP_CUR);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << VAR))) != 0) );
			setState(68);
			match(CL_CUR);
			 
			                System.out.println("        NOT_IF_" + if_local + ":"); 
			            
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

	public static class ComparisonContext extends ParserRuleContext {
		public Token op;
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
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			expression();
			setState(72);
			((ComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(73);
			expression();

			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == EQ) { emit("\n        if_icmpne NOT_IF_" + if_counter,-2); }
			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == NE) { emit("\n        if_icmpeq NOT_IF_" + if_counter,-2); }
			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LT) { emit("\n        if_icmpge NOT_IF_" + if_counter,-2); }
			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == LE) { emit("\n        if_icmpgt NOT_IF_" + if_counter,-2); }
			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GT) { emit("\n        if_icmple NOT_IF_" + if_counter,-2); }
			            if((((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getType():0) == GE) { emit("\n        if_icmplt NOT_IF_" + if_counter,-2); }
			        
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
		public Token op;
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
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			term();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(77);
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
				setState(78);
				term();

				                emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "    isub", - 1);
				            
				}
				}
				setState(85);
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

	public static class TermContext extends ParserRuleContext {
		public Token op;
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
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			factor();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(87);
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
				setState(88);
				factor();
				 
				                if      ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) {emit("    imul", - 1);}    
				                else if ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER)  {emit("    idiv", - 1);}    
				                else                        {emit("    irem", - 1);}    
				            
				}
				}
				setState(95);
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

	public static class FactorContext extends ParserRuleContext {
		public Token NUMBER;
		public Token VAR;
		public TerminalNode NUMBER() { return getToken(SauroParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode READ_INT() { return getToken(SauroParser.READ_INT, 0); }
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
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				                emit("    ldc "+ (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), + 1); 
				            
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(OP_PAR);
				setState(99);
				expression();
				setState(100);
				match(CL_PAR);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				((FactorContext)_localctx).VAR = match(VAR);

				            if(!symbol_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)))
				            { 
				                System.err.println("Variable " + (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) + " not declared.\n"); 
				                System.exit(1);
				            }
				            if(symbol_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)))
				            {
				                emit("    iload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				            }
				            else
				            {
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				            }
				        
				}
				break;
			case READ_INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(READ_INT);
				setState(105);
				match(OP_PAR);
				setState(106);
				match(CL_PAR);

				            emit("    invokestatic Runtime/readInt()I", +1);
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\4\3\4\3\4\5\4%\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64\13\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7C\n\7\r\7\16\7D"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tT\n\t\f\t\16\t"+
		"W\13\t\3\n\3\n\3\n\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\13\2\2\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\5\3\2\6\13\3\2\f\r\3\2\16\20\2p\2\26\3\2\2\2\4\31\3"+
		"\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n8\3\2\2\2\f=\3\2\2\2\16I\3\2\2\2\20N\3\2"+
		"\2\2\22X\3\2\2\2\24n\3\2\2\2\26\27\b\2\1\2\27\30\5\4\3\2\30\3\3\2\2\2"+
		"\31\33\b\3\1\2\32\34\5\6\4\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\37\3\2\2\2\37 \b\3\1\2 \5\3\2\2\2!%\5\b\5\2\"%\5\n\6"+
		"\2#%\5\f\7\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\7\25\2\2\'("+
		"\7\21\2\2()\b\5\1\2)*\5\20\t\2*\62\b\5\1\2+,\7\24\2\2,-\b\5\1\2-.\5\20"+
		"\t\2./\b\5\1\2/\61\3\2\2\2\60+\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\22\2\2\66\67\b\5\1\2\67"+
		"\t\3\2\2\289\7\30\2\29:\7\23\2\2:;\5\20\t\2;<\b\6\1\2<\13\3\2\2\2=>\b"+
		"\7\1\2>?\7\3\2\2?@\5\16\b\2@B\7\4\2\2AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB"+
		"\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\5\2\2GH\b\7\1\2H\r\3\2\2\2IJ\5\20\t\2"+
		"JK\t\2\2\2KL\5\20\t\2LM\b\b\1\2M\17\3\2\2\2NU\5\22\n\2OP\t\3\2\2PQ\5\22"+
		"\n\2QR\b\t\1\2RT\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3"+
		"\2\2\2WU\3\2\2\2X_\5\24\13\2YZ\t\4\2\2Z[\5\24\13\2[\\\b\n\1\2\\^\3\2\2"+
		"\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\23\3\2\2\2a_\3\2\2\2bc\7\27"+
		"\2\2co\b\13\1\2de\7\21\2\2ef\5\20\t\2fg\7\22\2\2go\3\2\2\2hi\7\30\2\2"+
		"io\b\13\1\2jk\7\26\2\2kl\7\21\2\2lm\7\22\2\2mo\b\13\1\2nb\3\2\2\2nd\3"+
		"\2\2\2nh\3\2\2\2nj\3\2\2\2o\25\3\2\2\2\t\35$\62DU_n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}