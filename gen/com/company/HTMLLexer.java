// Generated from C:/Users/96399/Desktop/COMPILER_PRO/src/com/company\HTMLLexer.g4 by ANTLR 4.9.1
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, TAG_WHITESPACE=2, SEA_WS=3, PAGE=4, HEADER=5, BODY=6, CONTROLLER=7, 
		PAGE_ID=8, PAGE_LINK=9, SESSION=10, SESSION_START=11, SESSION_END=12, 
		SESSION_REMOVE=13, MIX_CODE=14, LINK=15, LINK_NAME=16, HREF=17, OUT=18, 
		FORM=19, TRUE=20, FALSE=21, IN=22, FIELD=23, EMAIL_KEY=24, TEXT=25, EMAIL=26, 
		PASSWORD=27, FORM_NUMBER=28, PHONE_NUMBER=29, FILE=30, DATE=31, RADIO=32, 
		CHECKBOX=33, SELECT=34, SUBMIT=35, BUTTON=36, PASSWORD_VALUE=37, IMG=38, 
		VIDEO=39, AUDIO=40, ARROW=41, KEY=42, VALUE=43, PRINT_FUNCTION=44, ON_CLICK=45, 
		DOUBLE_CLICK=46, CONTROLE=47, FUNCTION_DEF_BOOLEAN=48, FUNCTION_DEF_VOID=49, 
		FUNCTION_DEF_DOUBLE=50, FUNCTION_DEF_INT=51, FUNCTION_DEF_STRING=52, FUNCTION_DEF_CHAR=53, 
		FUNCTION_DEF_MAP=54, FUNCTION_DEF_ARRAY=55, OUT_TEXT=56, AS=57, GO=58, 
		IF=59, LOOP=60, VAR=61, FUNCTION=62, RETURN=63, SEMICOLON=64, COLON=65, 
		COMMA=66, DOT=67, SINGLE_QUTATION=68, DOUBLE_QUTATION=69, BACK_SLASH=70, 
		EQUAL=71, GTHAN=72, LTHAN=73, NOTEQUAL=74, BLOCK_OPEN=75, BLOCK_CLOSE=76, 
		OPEN=77, CLOSE=78, ARRAY_OPEN=79, ARRAY_CLOSE=80, NUMBER=81, DATE_VAlUE=82, 
		NAME=83, MIX=84, STRING=85, CHAR=86;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "TAG_WHITESPACE", "SEA_WS", "HEXDIGIT", "DIGIT", "TAG_NameChar", 
			"TAG_NameStartChar", "DOUBLE", "INT", "BOOLEAN", "LETTER", "PAGE", "HEADER", 
			"BODY", "CONTROLLER", "PAGE_ID", "PAGE_LINK", "SESSION", "SESSION_START", 
			"SESSION_END", "SESSION_REMOVE", "MIX_CODE", "LINK", "LINK_NAME", "HREF", 
			"OUT", "FORM", "TRUE", "FALSE", "IN", "FIELD", "EMAIL_KEY", "TEXT", "EMAIL", 
			"PASSWORD", "FORM_NUMBER", "PHONE_NUMBER", "FILE", "DATE", "RADIO", "CHECKBOX", 
			"SELECT", "SUBMIT", "BUTTON", "PASSWORD_VALUE", "IMG", "VIDEO", "AUDIO", 
			"ARROW", "KEY", "VALUE", "PRINT_FUNCTION", "ON_CLICK", "DOUBLE_CLICK", 
			"CONTROLE", "FUNCTION_DEF_BOOLEAN", "FUNCTION_DEF_VOID", "FUNCTION_DEF_DOUBLE", 
			"FUNCTION_DEF_INT", "FUNCTION_DEF_STRING", "FUNCTION_DEF_CHAR", "FUNCTION_DEF_MAP", 
			"FUNCTION_DEF_ARRAY", "OUT_TEXT", "AS", "GO", "IF", "LOOP", "VAR", "FUNCTION", 
			"RETURN", "SEMICOLON", "COLON", "COMMA", "DOT", "SINGLE_QUTATION", "DOUBLE_QUTATION", 
			"BACK_SLASH", "EQUAL", "GTHAN", "LTHAN", "NOTEQUAL", "BLOCK_OPEN", "BLOCK_CLOSE", 
			"OPEN", "CLOSE", "ARRAY_OPEN", "ARRAY_CLOSE", "NUMBER", "DATE_VAlUE", 
			"NAME", "MIX", "STRING", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'page'", "'header'", "'body'", "'controller'", 
			"'page_id'", "'page_link'", "'session'", "'session_start'", "'session_end'", 
			"'session_remove'", "'mix'", "'link'", "'link_name'", "'href'", "'out'", 
			"'form'", "'true'", "'false'", "'in'", "'field'", "'@'", "'text-type'", 
			"'email-type'", "'password-type'", "'number-type'", "'phone_number-type'", 
			"'file'", "'date'", "'radio'", "'checkbox'", "'select'", "'submit'", 
			"'button'", null, "'img'", "'video'", "'audio'", "'->'", "'key'", "'value'", 
			"'print'", "'onclick'", "'doubleclick'", "'controle'", "'BOOLEAN'", "'VOID'", 
			"'DOUBLE'", "'INT'", "'STRING'", "'CHAR'", "'MAP'", "'ARRAY'", "'text'", 
			"'as'", "'go'", "'if'", "'loop'", "'var'", "'function'", "'return'", 
			"';'", "':'", "','", "'.'", "'''", "'\"'", "'\\'", "'='", "'>'", "'<'", 
			"'!'", null, null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "TAG_WHITESPACE", "SEA_WS", "PAGE", "HEADER", "BODY", 
			"CONTROLLER", "PAGE_ID", "PAGE_LINK", "SESSION", "SESSION_START", "SESSION_END", 
			"SESSION_REMOVE", "MIX_CODE", "LINK", "LINK_NAME", "HREF", "OUT", "FORM", 
			"TRUE", "FALSE", "IN", "FIELD", "EMAIL_KEY", "TEXT", "EMAIL", "PASSWORD", 
			"FORM_NUMBER", "PHONE_NUMBER", "FILE", "DATE", "RADIO", "CHECKBOX", "SELECT", 
			"SUBMIT", "BUTTON", "PASSWORD_VALUE", "IMG", "VIDEO", "AUDIO", "ARROW", 
			"KEY", "VALUE", "PRINT_FUNCTION", "ON_CLICK", "DOUBLE_CLICK", "CONTROLE", 
			"FUNCTION_DEF_BOOLEAN", "FUNCTION_DEF_VOID", "FUNCTION_DEF_DOUBLE", "FUNCTION_DEF_INT", 
			"FUNCTION_DEF_STRING", "FUNCTION_DEF_CHAR", "FUNCTION_DEF_MAP", "FUNCTION_DEF_ARRAY", 
			"OUT_TEXT", "AS", "GO", "IF", "LOOP", "VAR", "FUNCTION", "RETURN", "SEMICOLON", 
			"COLON", "COMMA", "DOT", "SINGLE_QUTATION", "DOUBLE_QUTATION", "BACK_SLASH", 
			"EQUAL", "GTHAN", "LTHAN", "NOTEQUAL", "BLOCK_OPEN", "BLOCK_CLOSE", "OPEN", 
			"CLOSE", "ARRAY_OPEN", "ARRAY_CLOSE", "NUMBER", "DATE_VAlUE", "NAME", 
			"MIX", "STRING", "CHAR"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u0306\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2\u00c6\n\2\f\2\16\2\u00c9\13\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00d5\n\4\3\4\6\4\u00d8\n\4\r\4\16\4\u00d9"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00e6\n\7\3\b\5\b\u00e9\n"+
		"\b\3\t\6\t\u00ec\n\t\r\t\16\t\u00ed\3\t\3\t\6\t\u00f2\n\t\r\t\16\t\u00f3"+
		"\5\t\u00f6\n\t\3\n\6\n\u00f9\n\n\r\n\16\n\u00fa\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0106\n\13\3\f\5\f\u0109\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3-\3.\6.\u0211\n.\r.\16.\u0212\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\3"+
		"9\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3"+
		"M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\7T\u02c1\nT\fT\16T\u02c4\13T"+
		"\3T\3T\7T\u02c8\nT\fT\16T\u02cb\13T\3U\7U\u02ce\nU\fU\16U\u02d1\13U\3"+
		"U\3U\7U\u02d5\nU\fU\16U\u02d8\13U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\5Z\u02e4"+
		"\nZ\3[\3[\6[\u02e8\n[\r[\16[\u02e9\3\\\6\\\u02ed\n\\\r\\\16\\\u02ee\3"+
		"]\3]\3]\7]\u02f4\n]\f]\16]\u02f7\13]\3^\3^\3^\5^\u02fc\n^\3^\3^\3_\3_"+
		"\3_\5_\u0303\n_\3_\3_\3\u00c7\2`\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22\63"+
		"\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$W%Y"+
		"&[\'](_)a*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\1779\u0081:\u0083"+
		";\u0085<\u0087=\u0089>\u008b?\u008d@\u008fA\u0091B\u0093C\u0095D\u0097"+
		"E\u0099F\u009bG\u009dH\u009fI\u00a1J\u00a3K\u00a5L\u00a7M\u00a9N\u00ab"+
		"O\u00adP\u00afQ\u00b1R\u00b3S\u00b5T\u00b7U\u00b9V\u00bbW\u00bdX\3\2\n"+
		"\5\2\13\f\17\17\"\"\4\2\13\13\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\5\2C\\aac|\2\u0317\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\3\u00bf\3\2\2\2\5\u00ce"+
		"\3\2\2\2\7\u00d7\3\2\2\2\t\u00dd\3\2\2\2\13\u00df\3\2\2\2\r\u00e5\3\2"+
		"\2\2\17\u00e8\3\2\2\2\21\u00eb\3\2\2\2\23\u00f8\3\2\2\2\25\u0105\3\2\2"+
		"\2\27\u0108\3\2\2\2\31\u010a\3\2\2\2\33\u010f\3\2\2\2\35\u0116\3\2\2\2"+
		"\37\u011b\3\2\2\2!\u0126\3\2\2\2#\u012e\3\2\2\2%\u0138\3\2\2\2\'\u0140"+
		"\3\2\2\2)\u014e\3\2\2\2+\u015a\3\2\2\2-\u0169\3\2\2\2/\u016d\3\2\2\2\61"+
		"\u0172\3\2\2\2\63\u017c\3\2\2\2\65\u0181\3\2\2\2\67\u0185\3\2\2\29\u018a"+
		"\3\2\2\2;\u018f\3\2\2\2=\u0195\3\2\2\2?\u0198\3\2\2\2A\u019e\3\2\2\2C"+
		"\u01a0\3\2\2\2E\u01aa\3\2\2\2G\u01b5\3\2\2\2I\u01c3\3\2\2\2K\u01cf\3\2"+
		"\2\2M\u01e1\3\2\2\2O\u01e6\3\2\2\2Q\u01eb\3\2\2\2S\u01f1\3\2\2\2U\u01fa"+
		"\3\2\2\2W\u0201\3\2\2\2Y\u0208\3\2\2\2[\u0210\3\2\2\2]\u0214\3\2\2\2_"+
		"\u0218\3\2\2\2a\u021e\3\2\2\2c\u0224\3\2\2\2e\u0227\3\2\2\2g\u022b\3\2"+
		"\2\2i\u0231\3\2\2\2k\u0237\3\2\2\2m\u023f\3\2\2\2o\u024b\3\2\2\2q\u0254"+
		"\3\2\2\2s\u025c\3\2\2\2u\u0261\3\2\2\2w\u0268\3\2\2\2y\u026c\3\2\2\2{"+
		"\u0273\3\2\2\2}\u0278\3\2\2\2\177\u027c\3\2\2\2\u0081\u0282\3\2\2\2\u0083"+
		"\u0287\3\2\2\2\u0085\u028a\3\2\2\2\u0087\u028d\3\2\2\2\u0089\u0290\3\2"+
		"\2\2\u008b\u0295\3\2\2\2\u008d\u0299\3\2\2\2\u008f\u02a2\3\2\2\2\u0091"+
		"\u02a9\3\2\2\2\u0093\u02ab\3\2\2\2\u0095\u02ad\3\2\2\2\u0097\u02af\3\2"+
		"\2\2\u0099\u02b1\3\2\2\2\u009b\u02b3\3\2\2\2\u009d\u02b5\3\2\2\2\u009f"+
		"\u02b7\3\2\2\2\u00a1\u02b9\3\2\2\2\u00a3\u02bb\3\2\2\2\u00a5\u02bd\3\2"+
		"\2\2\u00a7\u02c2\3\2\2\2\u00a9\u02cf\3\2\2\2\u00ab\u02d9\3\2\2\2\u00ad"+
		"\u02db\3\2\2\2\u00af\u02dd\3\2\2\2\u00b1\u02df\3\2\2\2\u00b3\u02e3\3\2"+
		"\2\2\u00b5\u02e7\3\2\2\2\u00b7\u02ec\3\2\2\2\u00b9\u02f5\3\2\2\2\u00bb"+
		"\u02f8\3\2\2\2\u00bd\u02ff\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7#\2"+
		"\2\u00c1\u00c2\7/\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c6"+
		"\13\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb"+
		"\7/\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7@\2\2\u00cd\4\3\2\2\2\u00ce\u00cf"+
		"\t\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\3\2\2\u00d1\6\3\2\2\2\u00d2"+
		"\u00d8\t\3\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\f\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\4\3\2\u00dc\b\3\2\2\2\u00dd\u00de"+
		"\t\4\2\2\u00de\n\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0\f\3\2\2\2\u00e1\u00e6"+
		"\5\17\b\2\u00e2\u00e6\t\6\2\2\u00e3\u00e6\5\13\6\2\u00e4\u00e6\t\7\2\2"+
		"\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\16\3\2\2\2\u00e7\u00e9\t\b\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\20\3\2\2\2\u00ea\u00ec\5\13\6\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f1"+
		"\5\u0097L\2\u00f0\u00f2\5\13\6\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ef"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\22\3\2\2\2\u00f7\u00f9\5\13\6\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\24\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff"+
		"\7w\2\2\u00ff\u0106\7g\2\2\u0100\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0106\7g\2\2\u0105\u00fc\3\2\2"+
		"\2\u0105\u0100\3\2\2\2\u0106\26\3\2\2\2\u0107\u0109\t\t\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\30\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7i\2\2\u010d\u010e\7g\2\2\u010e\32\3\2\2\2\u010f\u0110\7j\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7c\2\2\u0112\u0113\7f\2\2\u0113\u0114\7g\2\2"+
		"\u0114\u0115\7t\2\2\u0115\34\3\2\2\2\u0116\u0117\7d\2\2\u0117\u0118\7"+
		"q\2\2\u0118\u0119\7f\2\2\u0119\u011a\7{\2\2\u011a\36\3\2\2\2\u011b\u011c"+
		"\7e\2\2\u011c\u011d\7q\2\2\u011d\u011e\7p\2\2\u011e\u011f\7v\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7q\2\2\u0121\u0122\7n\2\2\u0122\u0123\7n\2\2"+
		"\u0123\u0124\7g\2\2\u0124\u0125\7t\2\2\u0125 \3\2\2\2\u0126\u0127\7r\2"+
		"\2\u0127\u0128\7c\2\2\u0128\u0129\7i\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7a\2\2\u012b\u012c\7k\2\2\u012c\u012d\7f\2\2\u012d\"\3\2\2\2\u012e\u012f"+
		"\7r\2\2\u012f\u0130\7c\2\2\u0130\u0131\7i\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7a\2\2\u0133\u0134\7n\2\2\u0134\u0135\7k\2\2\u0135\u0136\7p\2\2"+
		"\u0136\u0137\7m\2\2\u0137$\3\2\2\2\u0138\u0139\7u\2\2\u0139\u013a\7g\2"+
		"\2\u013a\u013b\7u\2\2\u013b\u013c\7u\2\2\u013c\u013d\7k\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u013f\7p\2\2\u013f&\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142"+
		"\7g\2\2\u0142\u0143\7u\2\2\u0143\u0144\7u\2\2\u0144\u0145\7k\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7p\2\2\u0147\u0148\7a\2\2\u0148\u0149\7u\2\2"+
		"\u0149\u014a\7v\2\2\u014a\u014b\7c\2\2\u014b\u014c\7t\2\2\u014c\u014d"+
		"\7v\2\2\u014d(\3\2\2\2\u014e\u014f\7u\2\2\u014f\u0150\7g\2\2\u0150\u0151"+
		"\7u\2\2\u0151\u0152\7u\2\2\u0152\u0153\7k\2\2\u0153\u0154\7q\2\2\u0154"+
		"\u0155\7p\2\2\u0155\u0156\7a\2\2\u0156\u0157\7g\2\2\u0157\u0158\7p\2\2"+
		"\u0158\u0159\7f\2\2\u0159*\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7g\2"+
		"\2\u015c\u015d\7u\2\2\u015d\u015e\7u\2\2\u015e\u015f\7k\2\2\u015f\u0160"+
		"\7q\2\2\u0160\u0161\7p\2\2\u0161\u0162\7a\2\2\u0162\u0163\7t\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7o\2\2\u0165\u0166\7q\2\2\u0166\u0167\7x\2\2"+
		"\u0167\u0168\7g\2\2\u0168,\3\2\2\2\u0169\u016a\7o\2\2\u016a\u016b\7k\2"+
		"\2\u016b\u016c\7z\2\2\u016c.\3\2\2\2\u016d\u016e\7n\2\2\u016e\u016f\7"+
		"k\2\2\u016f\u0170\7p\2\2\u0170\u0171\7m\2\2\u0171\60\3\2\2\2\u0172\u0173"+
		"\7n\2\2\u0173\u0174\7k\2\2\u0174\u0175\7p\2\2\u0175\u0176\7m\2\2\u0176"+
		"\u0177\7a\2\2\u0177\u0178\7p\2\2\u0178\u0179\7c\2\2\u0179\u017a\7o\2\2"+
		"\u017a\u017b\7g\2\2\u017b\62\3\2\2\2\u017c\u017d\7j\2\2\u017d\u017e\7"+
		"t\2\2\u017e\u017f\7g\2\2\u017f\u0180\7h\2\2\u0180\64\3\2\2\2\u0181\u0182"+
		"\7q\2\2\u0182\u0183\7w\2\2\u0183\u0184\7v\2\2\u0184\66\3\2\2\2\u0185\u0186"+
		"\7h\2\2\u0186\u0187\7q\2\2\u0187\u0188\7t\2\2\u0188\u0189\7o\2\2\u0189"+
		"8\3\2\2\2\u018a\u018b\7v\2\2\u018b\u018c\7t\2\2\u018c\u018d\7w\2\2\u018d"+
		"\u018e\7g\2\2\u018e:\3\2\2\2\u018f\u0190\7h\2\2\u0190\u0191\7c\2\2\u0191"+
		"\u0192\7n\2\2\u0192\u0193\7u\2\2\u0193\u0194\7g\2\2\u0194<\3\2\2\2\u0195"+
		"\u0196\7k\2\2\u0196\u0197\7p\2\2\u0197>\3\2\2\2\u0198\u0199\7h\2\2\u0199"+
		"\u019a\7k\2\2\u019a\u019b\7g\2\2\u019b\u019c\7n\2\2\u019c\u019d\7f\2\2"+
		"\u019d@\3\2\2\2\u019e\u019f\7B\2\2\u019fB\3\2\2\2\u01a0\u01a1\7v\2\2\u01a1"+
		"\u01a2\7g\2\2\u01a2\u01a3\7z\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7/\2\2"+
		"\u01a5\u01a6\7v\2\2\u01a6\u01a7\7{\2\2\u01a7\u01a8\7r\2\2\u01a8\u01a9"+
		"\7g\2\2\u01a9D\3\2\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7o\2\2\u01ac\u01ad"+
		"\7c\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7n\2\2\u01af\u01b0\7/\2\2\u01b0"+
		"\u01b1\7v\2\2\u01b1\u01b2\7{\2\2\u01b2\u01b3\7r\2\2\u01b3\u01b4\7g\2\2"+
		"\u01b4F\3\2\2\2\u01b5\u01b6\7r\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7u\2"+
		"\2\u01b8\u01b9\7u\2\2\u01b9\u01ba\7y\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc"+
		"\7t\2\2\u01bc\u01bd\7f\2\2\u01bd\u01be\7/\2\2\u01be\u01bf\7v\2\2\u01bf"+
		"\u01c0\7{\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2\7g\2\2\u01c2H\3\2\2\2\u01c3"+
		"\u01c4\7p\2\2\u01c4\u01c5\7w\2\2\u01c5\u01c6\7o\2\2\u01c6\u01c7\7d\2\2"+
		"\u01c7\u01c8\7g\2\2\u01c8\u01c9\7t\2\2\u01c9\u01ca\7/\2\2\u01ca\u01cb"+
		"\7v\2\2\u01cb\u01cc\7{\2\2\u01cc\u01cd\7r\2\2\u01cd\u01ce\7g\2\2\u01ce"+
		"J\3\2\2\2\u01cf\u01d0\7r\2\2\u01d0\u01d1\7j\2\2\u01d1\u01d2\7q\2\2\u01d2"+
		"\u01d3\7p\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7a\2\2\u01d5\u01d6\7p\2\2"+
		"\u01d6\u01d7\7w\2\2\u01d7\u01d8\7o\2\2\u01d8\u01d9\7d\2\2\u01d9\u01da"+
		"\7g\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7/\2\2\u01dc\u01dd\7v\2\2\u01dd"+
		"\u01de\7{\2\2\u01de\u01df\7r\2\2\u01df\u01e0\7g\2\2\u01e0L\3\2\2\2\u01e1"+
		"\u01e2\7h\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7g\2\2"+
		"\u01e5N\3\2\2\2\u01e6\u01e7\7f\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7v\2"+
		"\2\u01e9\u01ea\7g\2\2\u01eaP\3\2\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7"+
		"c\2\2\u01ed\u01ee\7f\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7q\2\2\u01f0R"+
		"\3\2\2\2\u01f1\u01f2\7e\2\2\u01f2\u01f3\7j\2\2\u01f3\u01f4\7g\2\2\u01f4"+
		"\u01f5\7e\2\2\u01f5\u01f6\7m\2\2\u01f6\u01f7\7d\2\2\u01f7\u01f8\7q\2\2"+
		"\u01f8\u01f9\7z\2\2\u01f9T\3\2\2\2\u01fa\u01fb\7u\2\2\u01fb\u01fc\7g\2"+
		"\2\u01fc\u01fd\7n\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7e\2\2\u01ff\u0200"+
		"\7v\2\2\u0200V\3\2\2\2\u0201\u0202\7u\2\2\u0202\u0203\7w\2\2\u0203\u0204"+
		"\7d\2\2\u0204\u0205\7o\2\2\u0205\u0206\7k\2\2\u0206\u0207\7v\2\2\u0207"+
		"X\3\2\2\2\u0208\u0209\7d\2\2\u0209\u020a\7w\2\2\u020a\u020b\7v\2\2\u020b"+
		"\u020c\7v\2\2\u020c\u020d\7q\2\2\u020d\u020e\7p\2\2\u020eZ\3\2\2\2\u020f"+
		"\u0211\7,\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\\\3\2\2\2\u0214\u0215\7k\2\2\u0215\u0216"+
		"\7o\2\2\u0216\u0217\7i\2\2\u0217^\3\2\2\2\u0218\u0219\7x\2\2\u0219\u021a"+
		"\7k\2\2\u021a\u021b\7f\2\2\u021b\u021c\7g\2\2\u021c\u021d\7q\2\2\u021d"+
		"`\3\2\2\2\u021e\u021f\7c\2\2\u021f\u0220\7w\2\2\u0220\u0221\7f\2\2\u0221"+
		"\u0222\7k\2\2\u0222\u0223\7q\2\2\u0223b\3\2\2\2\u0224\u0225\7/\2\2\u0225"+
		"\u0226\7@\2\2\u0226d\3\2\2\2\u0227\u0228\7m\2\2\u0228\u0229\7g\2\2\u0229"+
		"\u022a\7{\2\2\u022af\3\2\2\2\u022b\u022c\7x\2\2\u022c\u022d\7c\2\2\u022d"+
		"\u022e\7n\2\2\u022e\u022f\7w\2\2\u022f\u0230\7g\2\2\u0230h\3\2\2\2\u0231"+
		"\u0232\7r\2\2\u0232\u0233\7t\2\2\u0233\u0234\7k\2\2\u0234\u0235\7p\2\2"+
		"\u0235\u0236\7v\2\2\u0236j\3\2\2\2\u0237\u0238\7q\2\2\u0238\u0239\7p\2"+
		"\2\u0239\u023a\7e\2\2\u023a\u023b\7n\2\2\u023b\u023c\7k\2\2\u023c\u023d"+
		"\7e\2\2\u023d\u023e\7m\2\2\u023el\3\2\2\2\u023f\u0240\7f\2\2\u0240\u0241"+
		"\7q\2\2\u0241\u0242\7w\2\2\u0242\u0243\7d\2\2\u0243\u0244\7n\2\2\u0244"+
		"\u0245\7g\2\2\u0245\u0246\7e\2\2\u0246\u0247\7n\2\2\u0247\u0248\7k\2\2"+
		"\u0248\u0249\7e\2\2\u0249\u024a\7m\2\2\u024an\3\2\2\2\u024b\u024c\7e\2"+
		"\2\u024c\u024d\7q\2\2\u024d\u024e\7p\2\2\u024e\u024f\7v\2\2\u024f\u0250"+
		"\7t\2\2\u0250\u0251\7q\2\2\u0251\u0252\7n\2\2\u0252\u0253\7g\2\2\u0253"+
		"p\3\2\2\2\u0254\u0255\7D\2\2\u0255\u0256\7Q\2\2\u0256\u0257\7Q\2\2\u0257"+
		"\u0258\7N\2\2\u0258\u0259\7G\2\2\u0259\u025a\7C\2\2\u025a\u025b\7P\2\2"+
		"\u025br\3\2\2\2\u025c\u025d\7X\2\2\u025d\u025e\7Q\2\2\u025e\u025f\7K\2"+
		"\2\u025f\u0260\7F\2\2\u0260t\3\2\2\2\u0261\u0262\7F\2\2\u0262\u0263\7"+
		"Q\2\2\u0263\u0264\7W\2\2\u0264\u0265\7D\2\2\u0265\u0266\7N\2\2\u0266\u0267"+
		"\7G\2\2\u0267v\3\2\2\2\u0268\u0269\7K\2\2\u0269\u026a\7P\2\2\u026a\u026b"+
		"\7V\2\2\u026bx\3\2\2\2\u026c\u026d\7U\2\2\u026d\u026e\7V\2\2\u026e\u026f"+
		"\7T\2\2\u026f\u0270\7K\2\2\u0270\u0271\7P\2\2\u0271\u0272\7I\2\2\u0272"+
		"z\3\2\2\2\u0273\u0274\7E\2\2\u0274\u0275\7J\2\2\u0275\u0276\7C\2\2\u0276"+
		"\u0277\7T\2\2\u0277|\3\2\2\2\u0278\u0279\7O\2\2\u0279\u027a\7C\2\2\u027a"+
		"\u027b\7R\2\2\u027b~\3\2\2\2\u027c\u027d\7C\2\2\u027d\u027e\7T\2\2\u027e"+
		"\u027f\7T\2\2\u027f\u0280\7C\2\2\u0280\u0281\7[\2\2\u0281\u0080\3\2\2"+
		"\2\u0282\u0283\7v\2\2\u0283\u0284\7g\2\2\u0284\u0285\7z\2\2\u0285\u0286"+
		"\7v\2\2\u0286\u0082\3\2\2\2\u0287\u0288\7c\2\2\u0288\u0289\7u\2\2\u0289"+
		"\u0084\3\2\2\2\u028a\u028b\7i\2\2\u028b\u028c\7q\2\2\u028c\u0086\3\2\2"+
		"\2\u028d\u028e\7k\2\2\u028e\u028f\7h\2\2\u028f\u0088\3\2\2\2\u0290\u0291"+
		"\7n\2\2\u0291\u0292\7q\2\2\u0292\u0293\7q\2\2\u0293\u0294\7r\2\2\u0294"+
		"\u008a\3\2\2\2\u0295\u0296\7x\2\2\u0296\u0297\7c\2\2\u0297\u0298\7t\2"+
		"\2\u0298\u008c\3\2\2\2\u0299\u029a\7h\2\2\u029a\u029b\7w\2\2\u029b\u029c"+
		"\7p\2\2\u029c\u029d\7e\2\2\u029d\u029e\7v\2\2\u029e\u029f\7k\2\2\u029f"+
		"\u02a0\7q\2\2\u02a0\u02a1\7p\2\2\u02a1\u008e\3\2\2\2\u02a2\u02a3\7t\2"+
		"\2\u02a3\u02a4\7g\2\2\u02a4\u02a5\7v\2\2\u02a5\u02a6\7w\2\2\u02a6\u02a7"+
		"\7t\2\2\u02a7\u02a8\7p\2\2\u02a8\u0090\3\2\2\2\u02a9\u02aa\7=\2\2\u02aa"+
		"\u0092\3\2\2\2\u02ab\u02ac\7<\2\2\u02ac\u0094\3\2\2\2\u02ad\u02ae\7.\2"+
		"\2\u02ae\u0096\3\2\2\2\u02af\u02b0\7\60\2\2\u02b0\u0098\3\2\2\2\u02b1"+
		"\u02b2\7)\2\2\u02b2\u009a\3\2\2\2\u02b3\u02b4\7$\2\2\u02b4\u009c\3\2\2"+
		"\2\u02b5\u02b6\7^\2\2\u02b6\u009e\3\2\2\2\u02b7\u02b8\7?\2\2\u02b8\u00a0"+
		"\3\2\2\2\u02b9\u02ba\7@\2\2\u02ba\u00a2\3\2\2\2\u02bb\u02bc\7>\2\2\u02bc"+
		"\u00a4\3\2\2\2\u02bd\u02be\7#\2\2\u02be\u00a6\3\2\2\2\u02bf\u02c1\7\""+
		"\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c9\7}"+
		"\2\2\u02c6\u02c8\7\"\2\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u00a8\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cc\u02ce\7\"\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cf\3\2"+
		"\2\2\u02d2\u02d6\7\177\2\2\u02d3\u02d5\7\"\2\2\u02d4\u02d3\3\2\2\2\u02d5"+
		"\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u00aa\3\2"+
		"\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\7*\2\2\u02da\u00ac\3\2\2\2\u02db"+
		"\u02dc\7+\2\2\u02dc\u00ae\3\2\2\2\u02dd\u02de\7]\2\2\u02de\u00b0\3\2\2"+
		"\2\u02df\u02e0\7_\2\2\u02e0\u00b2\3\2\2\2\u02e1\u02e4\5\21\t\2\u02e2\u02e4"+
		"\5\23\n\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4\u00b4\3\2\2\2"+
		"\u02e5\u02e8\5\13\6\2\u02e6\u02e8\7/\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u00b6\3\2\2\2\u02eb\u02ed\5\27\f\2\u02ec\u02eb\3\2\2\2\u02ed\u02ee\3"+
		"\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u00b8\3\2\2\2\u02f0"+
		"\u02f4\5\27\f\2\u02f1\u02f4\5\13\6\2\u02f2\u02f4\7\60\2\2\u02f3\u02f0"+
		"\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u00ba\3\2\2\2\u02f7\u02f5\3\2"+
		"\2\2\u02f8\u02f9\5\u009bN\2\u02f9\u02fb\5\u00b9]\2\u02fa\u02fc\5A!\2\u02fb"+
		"\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\5\u009b"+
		"N\2\u02fe\u00bc\3\2\2\2\u02ff\u0302\5\u0099M\2\u0300\u0303\5\27\f\2\u0301"+
		"\u0303\5\13\6\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2\2\2\u0303\u0304\3"+
		"\2\2\2\u0304\u0305\5\u0099M\2\u0305\u00be\3\2\2\2\34\2\u00c7\u00d4\u00d7"+
		"\u00d9\u00e5\u00e8\u00ed\u00f3\u00f5\u00fa\u0105\u0108\u0212\u02c2\u02c9"+
		"\u02cf\u02d6\u02e3\u02e7\u02e9\u02ee\u02f3\u02f5\u02fb\u0302\4\2\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}