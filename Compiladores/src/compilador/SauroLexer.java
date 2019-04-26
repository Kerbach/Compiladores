// Generated from Sauro.g by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, OP_CUR=2, CL_CUR=3, EQ=4, NE=5, GT=6, GE=7, LT=8, LE=9, PLUS=10, 
		MINUS=11, TIMES=12, OVER=13, REMAINDER=14, OP_PAR=15, CL_PAR=16, ATTRIB=17, 
		COMMA=18, COLON=19, PRINT=20, READ_INT=21, NUMBER=22, VAR=23, COMMENT=24, 
		NL=25, SPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", "LE", "PLUS", 
			"MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COMMA", "COLON", "PRINT", "READ_INT", "NUMBER", "VAR", "COMMENT", "NL", 
			"SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "','", "':'", 
			"'print'", "'read_int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", "LE", "PLUS", 
			"MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COMMA", "COLON", "PRINT", "READ_INT", "NUMBER", "VAR", "COMMENT", "NL", 
			"SPACE"
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


	public SauroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sauro.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip();
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\6\27s\n\27\r\27\16\27t\3\30\6\30x\n\30\r\30\16\30y\3\31"+
		"\3\31\7\31~\n\31\f\31\16\31\u0081\13\31\3\31\3\31\3\32\5\32\u0086\n\32"+
		"\3\32\3\32\7\32\u008a\n\32\f\32\16\32\u008d\13\32\3\33\6\33\u0090\n\33"+
		"\r\33\16\33\u0091\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\3\2\4\4\2\f\f\17\17\4\2\13\13\"\"\2\u009a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2"+
		"\t>\3\2\2\2\13A\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2"+
		"\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2"+
		"\2!Z\3\2\2\2#\\\3\2\2\2%^\3\2\2\2\'`\3\2\2\2)b\3\2\2\2+h\3\2\2\2-r\3\2"+
		"\2\2/w\3\2\2\2\61{\3\2\2\2\63\u0085\3\2\2\2\65\u008f\3\2\2\2\678\7k\2"+
		"\289\7h\2\29\4\3\2\2\2:;\7}\2\2;\6\3\2\2\2<=\7\177\2\2=\b\3\2\2\2>?\7"+
		"?\2\2?@\7?\2\2@\n\3\2\2\2AB\7#\2\2BC\7?\2\2C\f\3\2\2\2DE\7@\2\2E\16\3"+
		"\2\2\2FG\7@\2\2GH\7?\2\2H\20\3\2\2\2IJ\7>\2\2J\22\3\2\2\2KL\7>\2\2LM\7"+
		"?\2\2M\24\3\2\2\2NO\7-\2\2O\26\3\2\2\2PQ\7/\2\2Q\30\3\2\2\2RS\7,\2\2S"+
		"\32\3\2\2\2TU\7\61\2\2U\34\3\2\2\2VW\7\'\2\2W\36\3\2\2\2XY\7*\2\2Y \3"+
		"\2\2\2Z[\7+\2\2[\"\3\2\2\2\\]\7?\2\2]$\3\2\2\2^_\7.\2\2_&\3\2\2\2`a\7"+
		"<\2\2a(\3\2\2\2bc\7r\2\2cd\7t\2\2de\7k\2\2ef\7p\2\2fg\7v\2\2g*\3\2\2\2"+
		"hi\7t\2\2ij\7g\2\2jk\7c\2\2kl\7f\2\2lm\7a\2\2mn\7k\2\2no\7p\2\2op\7v\2"+
		"\2p,\3\2\2\2qs\4\62;\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u.\3\2\2"+
		"\2vx\4c|\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\60\3\2\2\2{\177\7"+
		"%\2\2|~\n\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b\31\2\2\u0083\62"+
		"\3\2\2\2\u0084\u0086\7\17\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u008b\7\f\2\2\u0088\u008a\7\"\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\64\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\b\33\3\2\u0094\66\3\2\2\2\t\2ty\177\u0085\u008b\u0091"+
		"\4\3\31\2\3\33\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}