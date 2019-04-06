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
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OP_PAR=6, CL_PAR=7, ATTRIB=8, 
		COMMA=9, PRINT=10, READ_INT=11, NUMBER=12, VAR=13, SPACE=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COMMA", "PRINT", "READ_INT", "NUMBER", "VAR", "SPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "','", 
			"'print'", "'read_int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
			"ATTRIB", "COMMA", "PRINT", "READ_INT", "NUMBER", "VAR", "SPACE", "COMMENT"
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
		case 13:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rD\n\r\r\r\16"+
		"\rE\3\16\6\16I\n\16\r\16\16\16J\3\17\6\17N\n\17\r\17\16\17O\3\17\3\17"+
		"\3\20\3\20\7\20V\n\20\f\20\16\20Y\13\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\2_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2"+
		"\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\25\63\3\2\2\2\279"+
		"\3\2\2\2\31C\3\2\2\2\33H\3\2\2\2\35M\3\2\2\2\37S\3\2\2\2!\"\7-\2\2\"\4"+
		"\3\2\2\2#$\7/\2\2$\6\3\2\2\2%&\7,\2\2&\b\3\2\2\2\'(\7\61\2\2(\n\3\2\2"+
		"\2)*\7\'\2\2*\f\3\2\2\2+,\7*\2\2,\16\3\2\2\2-.\7+\2\2.\20\3\2\2\2/\60"+
		"\7?\2\2\60\22\3\2\2\2\61\62\7.\2\2\62\24\3\2\2\2\63\64\7r\2\2\64\65\7"+
		"t\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28\26\3\2\2\29:\7t\2\2:;\7g\2"+
		"\2;<\7c\2\2<=\7f\2\2=>\7a\2\2>?\7k\2\2?@\7p\2\2@A\7v\2\2A\30\3\2\2\2B"+
		"D\4\62;\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\32\3\2\2\2GI\4c|\2"+
		"HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\34\3\2\2\2LN\t\2\2\2ML\3\2\2"+
		"\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\b\17\2\2R\36\3\2\2\2SW\7"+
		"%\2\2TV\n\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3"+
		"\2\2\2Z[\b\20\3\2[ \3\2\2\2\7\2EJOW\4\3\17\2\3\20\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}