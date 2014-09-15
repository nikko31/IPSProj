// Generated from C:/Users/nikko31/Desktop/IPSProj/src/com/intertechitalia/ips2/core\IPS.g4 by ANTLR 4.4.1-dev

package com.intertechitalia.ips2.core;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IPSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, AggOr=4, ScaG2=5, Effettive=6, ModOr=7, Giorno=8, 
		Mese=9, ValPa=10, DurG1=11, DurG2=12, DO=13, END=14, Salta=15, Println=16, 
		Print=17, If=18, Else=19, Null=20, Or=21, And=22, Equals=23, NEquals=24, 
		GTEquals=25, LTEquals=26, Pow=27, Excl=28, GT=29, LT=30, Add=31, Subtract=32, 
		Multiply=33, Divide=34, Modulus=35, OBrace=36, CBrace=37, OBracket=38, 
		CBracket=39, OParen=40, CParen=41, Assign=42, Colon=43, Per=44, Bool=45, 
		Days=46, Months=47, Identifier=48, Number=49, String=50, Comment=51, Space=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "AggOr", "ScaG2", "Effettive", "ModOr", "Giorno", 
		"Mese", "ValPa", "DurG1", "DurG2", "DO", "END", "Salta", "Println", "Print", 
		"If", "Else", "Null", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
		"Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "Assign", 
		"Colon", "Per", "Bool", "Days", "Months", "Identifier", "Number", "String", 
		"Int", "Digit", "Comment", "Space"
	};


	public IPSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IPS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u01d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0128\n.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u013f\n/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0165\n\60\3\61\3\61\7\61\u0169"+
		"\n\61\f\61\16\61\u016c\13\61\3\61\7\61\u016f\n\61\f\61\16\61\u0172\13"+
		"\61\3\61\6\61\u0175\n\61\r\61\16\61\u0176\3\61\7\61\u017a\n\61\f\61\16"+
		"\61\u017d\13\61\3\61\6\61\u0180\n\61\r\61\16\61\u0181\3\61\6\61\u0185"+
		"\n\61\r\61\16\61\u0186\3\61\7\61\u018a\n\61\f\61\16\61\u018d\13\61\5\61"+
		"\u018f\n\61\3\62\3\62\3\62\7\62\u0194\n\62\f\62\16\62\u0197\13\62\5\62"+
		"\u0199\n\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u01a1\n\63\f\63\16\63\u01a4"+
		"\13\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u01ad\n\63\f\63\16\63\u01b0"+
		"\13\63\3\63\5\63\u01b3\n\63\3\64\3\64\7\64\u01b7\n\64\f\64\16\64\u01ba"+
		"\13\64\3\64\3\64\7\64\u01be\n\64\f\64\16\64\u01c1\13\64\5\64\u01c3\n\64"+
		"\3\65\3\65\3\66\3\66\7\66\u01c9\n\66\f\66\16\66\u01cc\13\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\2i\2k\65m\66\3\2\r\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\7\2"+
		"\62;AAC\\aac|\3\2\63;\3\2$$\5\2\f\f\17\17$$\3\2))\5\2\f\f\17\17))\4\2"+
		"\f\f\17\17\5\2\13\f\16\17\"\"\u01f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2k\3\2"+
		"\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7u\3\2\2\2\t\u0080\3\2\2\2\13\u0086"+
		"\3\2\2\2\r\u008c\3\2\2\2\17\u0096\3\2\2\2\21\u009c\3\2\2\2\23\u00a3\3"+
		"\2\2\2\25\u00a8\3\2\2\2\27\u00ae\3\2\2\2\31\u00b4\3\2\2\2\33\u00ba\3\2"+
		"\2\2\35\u00be\3\2\2\2\37\u00c0\3\2\2\2!\u00c6\3\2\2\2#\u00d2\3\2\2\2%"+
		"\u00d9\3\2\2\2\'\u00dc\3\2\2\2)\u00e3\3\2\2\2+\u00e8\3\2\2\2-\u00ea\3"+
		"\2\2\2/\u00ec\3\2\2\2\61\u00ef\3\2\2\2\63\u00f2\3\2\2\2\65\u00f5\3\2\2"+
		"\2\67\u00f8\3\2\2\29\u00fa\3\2\2\2;\u00fc\3\2\2\2=\u00fe\3\2\2\2?\u0100"+
		"\3\2\2\2A\u0102\3\2\2\2C\u0104\3\2\2\2E\u0106\3\2\2\2G\u0108\3\2\2\2I"+
		"\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0112\3\2"+
		"\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0118\3\2\2\2Y\u011a\3\2\2\2[\u0127"+
		"\3\2\2\2]\u013e\3\2\2\2_\u0164\3\2\2\2a\u018e\3\2\2\2c\u0190\3\2\2\2e"+
		"\u01b2\3\2\2\2g\u01c2\3\2\2\2i\u01c4\3\2\2\2k\u01c6\3\2\2\2m\u01cf\3\2"+
		"\2\2op\7.\2\2p\4\3\2\2\2qr\7C\2\2rs\7t\2\2st\7t\2\2t\6\3\2\2\2uv\7K\2"+
		"\2vw\7p\2\2wx\7v\2\2xy\7g\2\2yz\7t\2\2z{\7t\2\2{|\7q\2\2|}\7o\2\2}~\7"+
		"r\2\2~\177\7k\2\2\177\b\3\2\2\2\u0080\u0081\7C\2\2\u0081\u0082\7i\2\2"+
		"\u0082\u0083\7i\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7t\2\2\u0085\n\3\2"+
		"\2\2\u0086\u0087\7U\2\2\u0087\u0088\7e\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7I\2\2\u008a\u008b\7\64\2\2\u008b\f\3\2\2\2\u008c\u008d\7G\2\2\u008d"+
		"\u008e\7h\2\2\u008e\u008f\7h\2\2\u008f\u0090\7g\2\2\u0090\u0091\7v\2\2"+
		"\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093\u0094\7x\2\2\u0094\u0095"+
		"\7g\2\2\u0095\16\3\2\2\2\u0096\u0097\7O\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7f\2\2\u0099\u009a\7Q\2\2\u009a\u009b\7t\2\2\u009b\20\3\2\2\2\u009c\u009d"+
		"\7I\2\2\u009d\u009e\7k\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7O\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\24\3\2\2\2\u00a8"+
		"\u00a9\7X\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7R\2\2"+
		"\u00ac\u00ad\7c\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7F\2\2\u00af\u00b0\7"+
		"w\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7I\2\2\u00b2\u00b3\7\63\2\2\u00b3"+
		"\30\3\2\2\2\u00b4\u00b5\7F\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7I\2\2\u00b8\u00b9\7\64\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7H\2\2"+
		"\u00bb\u00bc\7c\2\2\u00bc\u00bd\7k\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7"+
		"=\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7U\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7c\2\2\u00c5 \3\2\2\2\u00c6\u00c7"+
		"\7U\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7x\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7E\2\2"+
		"\u00ce\u00cf\7c\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7q\2\2\u00d1\"\3\2"+
		"\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7k\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7k\2\2\u00d8$\3\2\2\2\u00d9\u00da"+
		"\7U\2\2\u00da\u00db\7g\2\2\u00db&\3\2\2\2\u00dc\u00dd\7Q\2\2\u00dd\u00de"+
		"\7r\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7w\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7n\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7Q\2\2\u00e9"+
		",\3\2\2\2\u00ea\u00eb\7G\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7@\2\2\u00f1\62"+
		"\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3\u00f4\7?\2\2\u00f4\64\3\2\2\2\u00f5"+
		"\u00f6\7>\2\2\u00f6\u00f7\7?\2\2\u00f7\66\3\2\2\2\u00f8\u00f9\7`\2\2\u00f9"+
		"8\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd<"+
		"\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff>\3\2\2\2\u0100\u0101\7-\2\2\u0101@\3"+
		"\2\2\2\u0102\u0103\7/\2\2\u0103B\3\2\2\2\u0104\u0105\7,\2\2\u0105D\3\2"+
		"\2\2\u0106\u0107\7\61\2\2\u0107F\3\2\2\2\u0108\u0109\7\'\2\2\u0109H\3"+
		"\2\2\2\u010a\u010b\7}\2\2\u010bJ\3\2\2\2\u010c\u010d\7\177\2\2\u010dL"+
		"\3\2\2\2\u010e\u010f\7]\2\2\u010fN\3\2\2\2\u0110\u0111\7_\2\2\u0111P\3"+
		"\2\2\2\u0112\u0113\7*\2\2\u0113R\3\2\2\2\u0114\u0115\7+\2\2\u0115T\3\2"+
		"\2\2\u0116\u0117\7?\2\2\u0117V\3\2\2\2\u0118\u0119\7<\2\2\u0119X\3\2\2"+
		"\2\u011a\u011b\7R\2\2\u011b\u011c\7g\2\2\u011c\u011d\7t\2\2\u011dZ\3\2"+
		"\2\2\u011e\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7w\2\2\u0121\u0128"+
		"\7g\2\2\u0122\u0123\7h\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125"+
		"\u0126\7u\2\2\u0126\u0128\7g\2\2\u0127\u011e\3\2\2\2\u0127\u0122\3\2\2"+
		"\2\u0128\\\3\2\2\2\u0129\u012a\7N\2\2\u012a\u012b\7w\2\2\u012b\u013f\7"+
		"p\2\2\u012c\u012d\7O\2\2\u012d\u012e\7c\2\2\u012e\u013f\7t\2\2\u012f\u0130"+
		"\7O\2\2\u0130\u0131\7g\2\2\u0131\u013f\7t\2\2\u0132\u0133\7I\2\2\u0133"+
		"\u0134\7k\2\2\u0134\u013f\7q\2\2\u0135\u0136\7X\2\2\u0136\u0137\7g\2\2"+
		"\u0137\u013f\7p\2\2\u0138\u0139\7U\2\2\u0139\u013a\7c\2\2\u013a\u013f"+
		"\7d\2\2\u013b\u013c\7F\2\2\u013c\u013d\7q\2\2\u013d\u013f\7o\2\2\u013e"+
		"\u0129\3\2\2\2\u013e\u012c\3\2\2\2\u013e\u012f\3\2\2\2\u013e\u0132\3\2"+
		"\2\2\u013e\u0135\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013b\3\2\2\2\u013f"+
		"^\3\2\2\2\u0140\u0141\7I\2\2\u0141\u0142\7g\2\2\u0142\u0165\7p\2\2\u0143"+
		"\u0144\7H\2\2\u0144\u0145\7g\2\2\u0145\u0165\7d\2\2\u0146\u0147\7O\2\2"+
		"\u0147\u0148\7c\2\2\u0148\u0165\7t\2\2\u0149\u014a\7C\2\2\u014a\u014b"+
		"\7r\2\2\u014b\u0165\7t\2\2\u014c\u014d\7O\2\2\u014d\u014e\7c\2\2\u014e"+
		"\u0165\7i\2\2\u014f\u0150\7I\2\2\u0150\u0151\7k\2\2\u0151\u0165\7w\2\2"+
		"\u0152\u0153\7N\2\2\u0153\u0154\7w\2\2\u0154\u0165\7i\2\2\u0155\u0156"+
		"\7C\2\2\u0156\u0157\7i\2\2\u0157\u0165\7q\2\2\u0158\u0159\7U\2\2\u0159"+
		"\u015a\7g\2\2\u015a\u0165\7v\2\2\u015b\u015c\7Q\2\2\u015c\u015d\7v\2\2"+
		"\u015d\u0165\7v\2\2\u015e\u015f\7P\2\2\u015f\u0160\7q\2\2\u0160\u0165"+
		"\7x\2\2\u0161\u0162\7F\2\2\u0162\u0163\7k\2\2\u0163\u0165\7e\2\2\u0164"+
		"\u0140\3\2\2\2\u0164\u0143\3\2\2\2\u0164\u0146\3\2\2\2\u0164\u0149\3\2"+
		"\2\2\u0164\u014c\3\2\2\2\u0164\u014f\3\2\2\2\u0164\u0152\3\2\2\2\u0164"+
		"\u0155\3\2\2\2\u0164\u0158\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u015e\3\2"+
		"\2\2\u0164\u0161\3\2\2\2\u0165`\3\2\2\2\u0166\u016a\t\2\2\2\u0167\u0169"+
		"\t\3\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u018f\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\t\4"+
		"\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\t\2"+
		"\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u017b\3\2\2\2\u0178\u017a\t\5\2\2\u0179\u0178\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u018f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\7\62\2\2\u017f\u017e\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0185\t\6\2\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018b\3\2\2\2\u0188"+
		"\u018a\t\4\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0166\3\2\2\2\u018e\u0170\3\2\2\2\u018e\u017f\3\2\2\2\u018fb\3\2\2\2"+
		"\u0190\u0198\5g\64\2\u0191\u0195\7\60\2\2\u0192\u0194\5i\65\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0191\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199d\3\2\2\2\u019a\u01a2\t\7\2\2\u019b\u01a1\n\b\2\2\u019c\u019d"+
		"\7^\2\2\u019d\u01a1\7^\2\2\u019e\u019f\7^\2\2\u019f\u01a1\7$\2\2\u01a0"+
		"\u019b\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01b3\t\7\2\2\u01a6\u01ae\t\t\2\2\u01a7\u01ad\n\n"+
		"\2\2\u01a8\u01a9\7^\2\2\u01a9\u01ad\7^\2\2\u01aa\u01ab\7^\2\2\u01ab\u01ad"+
		"\7)\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\t\t\2\2\u01b2\u019a\3\2\2\2\u01b2"+
		"\u01a6\3\2\2\2\u01b3f\3\2\2\2\u01b4\u01b8\t\6\2\2\u01b5\u01b7\5i\65\2"+
		"\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01c3\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\7\62\2\2"+
		"\u01bc\u01be\5i\65\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01b4\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c3h\3\2\2\2\u01c4\u01c5\t\4\2\2"+
		"\u01c5j\3\2\2\2\u01c6\u01ca\7%\2\2\u01c7\u01c9\n\13\2\2\u01c8\u01c7\3"+
		"\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\b\66\2\2\u01cel\3\2\2\2"+
		"\u01cf\u01d0\t\f\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\b\67\2\2\u01d2n\3"+
		"\2\2\2\31\2\u0127\u013e\u0164\u016a\u0170\u0176\u017b\u0181\u0186\u018b"+
		"\u018e\u0195\u0198\u01a0\u01a2\u01ac\u01ae\u01b2\u01b8\u01bf\u01c2\u01ca"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}