/* The following code was generated by JFlex 1.4.1 on 12/4/07 10:25 AM */

package org.processmining.importing.erlangnet.arcinscriptionparser;

import java_cup.runtime.*;

/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a>
 * 1.4.1 on 12/4/07 10:25 AM from the specification file
 * 
 * <tt>/Users/Kristian/Documents/workspace/ProM_UI07/src/plugins/org/processmining/importing/erlangnet/arcinscriptionparser/Scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

	/** This character denotes the end of file */
	public static final int YYEOF = -1;

	/** initial size of the lookahead buffer */
	private static final int ZZ_BUFFERSIZE = 16384;

	/** lexical states */
	public static final int YYINITIAL = 0;

	/**
	 * Translates characters to character classes
	 */
	private static final String ZZ_CMAP_PACKED = "\11\0\1\3\1\2\1\0\1\3\1\1\16\0\4\0\1\3\1\0"
			+ "\1\11\1\0\1\0\3\0\1\21\1\22\2\0\1\23\3\0\12\5"
			+ "\7\0\1\4\1\41\1\4\1\44\2\4\1\40\1\4\1\33\2\4"
			+ "\1\43\1\4\1\34\1\42\1\32\1\4\1\37\1\36\1\35\6\4"
			+ "\4\0\1\0\1\0\1\16\1\4\1\30\1\26\1\6\1\15\1\31"
			+ "\1\4\1\25\2\4\1\17\1\27\1\7\1\4\1\24\1\4\1\13"
			+ "\1\20\1\12\1\14\1\10\4\4\4\0\41\0\2\0\4\0\4\0"
			+ "\1\0\2\0\1\0\7\0\1\0\4\0\1\0\5\0\27\0\1\0"
			+ "\37\0\1\0\u013f\0\31\0\162\0\4\0\14\0\16\0\5\0\11\0"
			+ "\1\0\21\0\130\0\5\0\23\0\12\0\1\0\13\0\1\0\1\0"
			+ "\3\0\1\0\1\0\1\0\24\0\1\0\54\0\1\0\46\0\1\0"
			+ "\5\0\4\0\202\0\1\0\4\0\3\0\105\0\1\0\46\0\2\0"
			+ "\2\0\6\0\20\0\41\0\46\0\2\0\1\0\7\0\47\0\11\0"
			+ "\21\0\1\0\27\0\1\0\3\0\1\0\1\0\1\0\2\0\1\0"
			+ "\1\0\13\0\33\0\5\0\3\0\15\0\4\0\14\0\6\0\13\0"
			+ "\32\0\5\0\31\0\7\0\12\0\4\0\146\0\1\0\11\0\1\0"
			+ "\12\0\1\0\23\0\2\0\1\0\17\0\74\0\2\0\3\0\60\0"
			+ "\62\0\u014f\0\71\0\2\0\22\0\2\0\5\0\3\0\14\0\2\0"
			+ "\12\0\21\0\3\0\1\0\10\0\2\0\2\0\2\0\26\0\1\0"
			+ "\7\0\1\0\1\0\3\0\4\0\2\0\11\0\2\0\2\0\2\0"
			+ "\3\0\11\0\1\0\4\0\2\0\1\0\5\0\2\0\16\0\15\0"
			+ "\3\0\1\0\6\0\4\0\2\0\2\0\26\0\1\0\7\0\1\0"
			+ "\2\0\1\0\2\0\1\0\2\0\2\0\1\0\1\0\5\0\4\0"
			+ "\2\0\2\0\3\0\13\0\4\0\1\0\1\0\7\0\17\0\14\0"
			+ "\3\0\1\0\11\0\1\0\3\0\1\0\26\0\1\0\7\0\1\0"
			+ "\2\0\1\0\5\0\2\0\12\0\1\0\3\0\1\0\3\0\2\0"
			+ "\1\0\17\0\4\0\2\0\12\0\1\0\1\0\17\0\3\0\1\0"
			+ "\10\0\2\0\2\0\2\0\26\0\1\0\7\0\1\0\2\0\1\0"
			+ "\5\0\2\0\10\0\3\0\2\0\2\0\3\0\10\0\2\0\4\0"
			+ "\2\0\1\0\3\0\4\0\12\0\1\0\1\0\20\0\2\0\1\0"
			+ "\6\0\3\0\3\0\1\0\4\0\3\0\2\0\1\0\1\0\1\0"
			+ "\2\0\3\0\2\0\3\0\3\0\3\0\10\0\1\0\3\0\4\0"
			+ "\5\0\3\0\3\0\1\0\4\0\11\0\1\0\17\0\11\0\11\0"
			+ "\1\0\7\0\3\0\1\0\10\0\1\0\3\0\1\0\27\0\1\0"
			+ "\12\0\1\0\5\0\4\0\7\0\1\0\3\0\1\0\4\0\7\0"
			+ "\2\0\11\0\2\0\4\0\12\0\22\0\2\0\1\0\10\0\1\0"
			+ "\3\0\1\0\27\0\1\0\12\0\1\0\5\0\2\0\11\0\1\0"
			+ "\3\0\1\0\4\0\7\0\2\0\7\0\1\0\1\0\2\0\4\0"
			+ "\12\0\22\0\2\0\1\0\10\0\1\0\3\0\1\0\27\0\1\0"
			+ "\20\0\4\0\6\0\2\0\3\0\1\0\4\0\11\0\1\0\10\0"
			+ "\2\0\4\0\12\0\22\0\2\0\1\0\22\0\3\0\30\0\1\0"
			+ "\11\0\1\0\1\0\2\0\7\0\3\0\1\0\4\0\6\0\1\0"
			+ "\1\0\1\0\10\0\22\0\2\0\15\0\72\0\4\0\20\0\1\0"
			+ "\12\0\47\0\2\0\1\0\1\0\2\0\2\0\1\0\1\0\2\0"
			+ "\1\0\6\0\4\0\1\0\7\0\1\0\3\0\1\0\1\0\1\0"
			+ "\1\0\2\0\2\0\1\0\15\0\1\0\3\0\2\0\5\0\1\0"
			+ "\1\0\1\0\6\0\2\0\12\0\2\0\2\0\42\0\1\0\27\0"
			+ "\2\0\6\0\12\0\13\0\1\0\1\0\1\0\1\0\1\0\4\0"
			+ "\12\0\1\0\42\0\6\0\24\0\1\0\6\0\4\0\10\0\1\0"
			+ "\44\0\11\0\1\0\71\0\42\0\1\0\5\0\1\0\2\0\1\0"
			+ "\7\0\3\0\4\0\6\0\12\0\6\0\12\0\106\0\46\0\12\0"
			+ "\51\0\7\0\132\0\5\0\104\0\5\0\122\0\6\0\7\0\1\0"
			+ "\77\0\1\0\1\0\1\0\4\0\2\0\7\0\1\0\1\0\1\0"
			+ "\4\0\2\0\47\0\1\0\1\0\1\0\4\0\2\0\37\0\1\0"
			+ "\1\0\1\0\4\0\2\0\7\0\1\0\1\0\1\0\4\0\2\0"
			+ "\7\0\1\0\7\0\1\0\27\0\1\0\37\0\1\0\1\0\1\0"
			+ "\4\0\2\0\7\0\1\0\47\0\1\0\23\0\16\0\11\0\56\0"
			+ "\125\0\14\0\u026c\0\2\0\10\0\12\0\32\0\5\0\113\0\3\0"
			+ "\3\0\17\0\15\0\1\0\7\0\13\0\25\0\13\0\24\0\14\0"
			+ "\15\0\1\0\3\0\1\0\2\0\14\0\124\0\3\0\1\0\3\0"
			+ "\3\0\2\0\12\0\41\0\3\0\2\0\12\0\6\0\130\0\10\0"
			+ "\52\0\126\0\35\0\3\0\14\0\4\0\14\0\12\0\50\0\2\0"
			+ "\5\0\u038b\0\154\0\224\0\234\0\4\0\132\0\6\0\26\0\2\0"
			+ "\6\0\2\0\46\0\2\0\6\0\2\0\10\0\1\0\1\0\1\0"
			+ "\1\0\1\0\1\0\1\0\37\0\2\0\65\0\1\0\7\0\1\0"
			+ "\1\0\3\0\3\0\1\0\7\0\3\0\4\0\2\0\6\0\4\0"
			+ "\15\0\5\0\3\0\1\0\7\0\17\0\4\0\32\0\5\0\20\0"
			+ "\2\0\23\0\1\0\13\0\4\0\6\0\6\0\1\0\1\0\15\0"
			+ "\1\0\40\0\22\0\36\0\15\0\4\0\1\0\3\0\6\0\27\0"
			+ "\1\0\4\0\1\0\2\0\12\0\1\0\1\0\3\0\5\0\6\0"
			+ "\1\0\1\0\1\0\1\0\1\0\1\0\4\0\1\0\3\0\1\0"
			+ "\7\0\3\0\3\0\5\0\5\0\26\0\44\0\u0e81\0\3\0\31\0"
			+ "\17\0\1\0\5\0\2\0\5\0\4\0\126\0\2\0\2\0\2\0"
			+ "\3\0\1\0\137\0\5\0\50\0\4\0\136\0\21\0\30\0\70\0"
			+ "\20\0\u0200\0\u19b6\0\112\0\u51a6\0\132\0\u048d\0\u0773\0\u2ba4\0\u215c\0"
			+ "\u012e\0\2\0\73\0\225\0\7\0\14\0\5\0\5\0\14\0\1\0"
			+ "\15\0\1\0\5\0\1\0\1\0\1\0\2\0\1\0\2\0\1\0"
			+ "\154\0\41\0\u016b\0\22\0\100\0\2\0\66\0\50\0\15\0\3\0"
			+ "\20\0\20\0\4\0\17\0\2\0\30\0\3\0\31\0\1\0\6\0"
			+ "\5\0\1\0\207\0\2\0\1\0\4\0\1\0\13\0\12\0\7\0"
			+ "\32\0\4\0\1\0\1\0\32\0\12\0\132\0\3\0\6\0\2\0"
			+ "\6\0\2\0\6\0\2\0\3\0\3\0\2\0\3\0\2\0\22\0" + "\3\0\4\0";

	/**
	 * Translates characters to character classes
	 */
	private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 = "\1\0\1\1\2\2\1\3\1\4\2\3\1\1\4\3"
			+ "\1\5\1\6\1\7\10\3\2\0\1\10\4\3\1\11"
			+ "\6\3\1\12\1\3\1\13\4\3\1\14\1\15\1\16"
			+ "\1\17\1\20\3\3\1\21\4\3\1\22\1\23\5\3"
			+ "\1\24\1\25\1\26\1\3\1\27";

	private static int[] zzUnpackAction() {
		int[] result = new int[70];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\45\0\112\0\45\0\157\0\224\0\271\0\336"
			+ "\0\u0103\0\u0128\0\u014d\0\u0172\0\u0197\0\45\0\45\0\45"
			+ "\0\u01bc\0\u01e1\0\u0206\0\u022b\0\u0250\0\u0275\0\u029a\0\u02bf"
			+ "\0\u02e4\0\u0309\0\45\0\u032e\0\u0353\0\u0378\0\u039d\0\157"
			+ "\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0\0\u04c5"
			+ "\0\45\0\u04ea\0\u050f\0\u0534\0\u0559\0\157\0\157\0\u057e"
			+ "\0\157\0\157\0\u05a3\0\u05c8\0\u05ed\0\157\0\u0612\0\u0637"
			+ "\0\u065c\0\u0681\0\157\0\157\0\u06a6\0\u06cb\0\u06f0\0\u0715"
			+ "\0\u073a\0\157\0\157\0\157\0\u075f\0\157";

	private static int[] zzUnpackRowMap() {
		int[] result = new int[70];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 = "\1\2\1\3\2\4\1\5\1\6\1\7\1\5\1\10"
			+ "\1\11\1\12\1\13\1\5\1\14\2\5\1\15\1\16"
			+ "\1\17\1\20\1\21\4\5\1\22\1\23\1\24\2\5"
			+ "\1\25\2\5\1\26\3\5\47\0\1\4\46\0\5\5"
			+ "\1\0\7\5\3\0\21\5\5\0\1\6\43\0\3\5"
			+ "\1\27\1\5\1\0\7\5\3\0\21\5\4\0\5\5"
			+ "\1\0\4\5\1\30\2\5\3\0\21\5\4\0\1\31"
			+ "\1\32\3\31\1\33\7\31\3\0\21\31\4\0\5\5"
			+ "\1\0\1\5\1\34\5\5\3\0\21\5\4\0\2\5"
			+ "\1\35\2\5\1\0\7\5\3\0\21\5\4\0\5\5"
			+ "\1\0\4\5\1\36\2\5\3\0\21\5\4\0\2\5"
			+ "\1\37\2\5\1\0\7\5\3\0\3\5\1\40\15\5"
			+ "\4\0\5\5\1\0\7\5\3\0\1\5\1\41\17\5"
			+ "\4\0\2\5\1\42\2\5\1\0\7\5\3\0\21\5"
			+ "\4\0\5\5\1\0\7\5\3\0\7\5\1\43\11\5"
			+ "\4\0\5\5\1\0\7\5\3\0\10\5\1\44\10\5"
			+ "\4\0\5\5\1\0\7\5\3\0\11\5\1\45\7\5"
			+ "\4\0\5\5\1\0\7\5\3\0\16\5\1\46\2\5"
			+ "\4\0\4\5\1\47\1\0\7\5\3\0\21\5\4\0"
			+ "\5\5\1\0\5\5\1\50\1\5\3\0\21\5\4\0"
			+ "\5\31\1\51\7\31\3\0\21\31\4\0\5\32\1\33"
			+ "\7\32\3\0\21\32\4\0\5\5\1\0\2\5\1\52"
			+ "\4\5\3\0\21\5\4\0\5\5\1\0\7\5\3\0"
			+ "\4\5\1\53\14\5\4\0\5\5\1\0\5\5\1\54"
			+ "\1\5\3\0\21\5\4\0\3\5\1\55\1\5\1\0"
			+ "\1\56\6\5\3\0\21\5\4\0\5\5\1\0\7\5"
			+ "\3\0\2\5\1\57\16\5\4\0\5\5\1\0\1\60"
			+ "\6\5\3\0\21\5\4\0\5\5\1\0\7\5\3\0"
			+ "\20\5\1\61\4\0\5\5\1\0\7\5\3\0\11\5"
			+ "\1\62\7\5\4\0\5\5\1\0\7\5\3\0\13\5"
			+ "\1\63\5\5\4\0\5\5\1\0\7\5\3\0\16\5"
			+ "\1\64\2\5\4\0\1\5\1\47\3\5\1\0\7\5"
			+ "\3\0\21\5\4\0\5\5\1\0\2\5\1\65\4\5"
			+ "\3\0\21\5\4\0\2\5\1\66\2\5\1\0\7\5"
			+ "\3\0\21\5\4\0\2\5\1\67\2\5\1\0\7\5"
			+ "\3\0\21\5\4\0\5\5\1\0\6\5\1\52\3\0"
			+ "\21\5\4\0\5\5\1\0\7\5\3\0\2\5\1\70"
			+ "\16\5\4\0\5\5\1\0\7\5\3\0\6\5\1\71"
			+ "\12\5\4\0\5\5\1\0\7\5\3\0\7\5\1\72"
			+ "\11\5\4\0\5\5\1\0\7\5\3\0\17\5\1\73"
			+ "\1\5\4\0\2\5\1\74\2\5\1\0\7\5\3\0"
			+ "\21\5\4\0\5\5\1\0\7\5\3\0\1\5\1\75"
			+ "\17\5\4\0\2\5\1\76\2\5\1\0\7\5\3\0"
			+ "\21\5\4\0\5\5\1\0\7\5\3\0\1\5\1\77"
			+ "\17\5\4\0\5\5\1\0\7\5\3\0\10\5\1\100"
			+ "\10\5\4\0\4\5\1\101\1\0\7\5\3\0\21\5"
			+ "\4\0\5\5\1\0\1\5\1\102\5\5\3\0\21\5"
			+ "\4\0\5\5\1\0\7\5\3\0\2\5\1\103\16\5"
			+ "\4\0\5\5\1\0\7\5\3\0\14\5\1\104\4\5"
			+ "\4\0\2\5\1\105\2\5\1\0\7\5\3\0\21\5"
			+ "\4\0\5\5\1\0\1\5\1\106\5\5\3\0\21\5";

	private static int[] zzUnpackTrans() {
		int[] result = new int[1924];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/* error codes */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;

	/* error messages for the codes above */
	private static final String ZZ_ERROR_MSG[] = {
			"Unkown internal scanner error", "Error: could not match input",
			"Error: pushback value was too large" };

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\1\0\1\11\1\1\1\11\11\1\3\11\10\1\2\0"
			+ "\1\11\15\1\1\11\35\1";

	private static int[] zzUnpackAttribute() {
		int[] result = new int[70];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** the input device */
	private java.io.Reader zzReader;

	/** the current state of the DFA */
	private int zzState;

	/** the current lexical state */
	private int zzLexicalState = YYINITIAL;

	/**
	 * this buffer contains the current text to be matched and is the source of
	 * the yytext() string
	 */
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	/** the textposition at the last accepting state */
	private int zzMarkedPos;

	/** the textposition at the last state to be included in yytext */
	private int zzPushbackPos;

	/** the current text position in the buffer */
	private int zzCurrentPos;

	/** startRead marks the beginning of the yytext() string in the buffer */
	private int zzStartRead;

	/**
	 * endRead marks the last character in the buffer, that has been read from
	 * input
	 */
	private int zzEndRead;

	/** number of newlines encountered up to the start of the matched text */
	private int yyline;

	/** the number of characters up to the start of the matched text */
	private int yychar;

	/**
	 * the number of characters from the last newline up to the start of the
	 * matched text
	 */
	private int yycolumn;

	/**
	 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
	 */
	private boolean zzAtBOL = true;

	/** zzAtEOF == true <=> the scanner is at the EOF */
	private boolean zzAtEOF;

	/** denotes if the user-EOF-code has already been executed */
	private boolean zzEOFDone;

	/* user code: */

	private Symbol symbol(int type) {
		return new Symbol(type, yyline, yycolumn);
	}

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}

	/**
	 * Creates a new scanner There is also a java.io.InputStream version of this
	 * constructor.
	 * 
	 * @param in
	 *            the java.io.Reader to read input from.
	 */
	public Scanner(java.io.Reader in) {
		this.zzReader = in;
	}

	/**
	 * Creates a new scanner. There is also java.io.Reader version of this
	 * constructor.
	 * 
	 * @param in
	 *            the java.io.Inputstream to read input from.
	 */
	public Scanner(java.io.InputStream in) {
		this(new java.io.InputStreamReader(in));
	}

	/**
	 * Unpacks the compressed character translation table.
	 * 
	 * @param packed
	 *            the packed character translation table
	 * @return the unpacked character translation table
	 */
	private static char[] zzUnpackCMap(String packed) {
		char[] map = new char[0x10000];
		int i = 0; /* index in packed string */
		int j = 0; /* index in unpacked array */
		while (i < 1644) {
			int count = packed.charAt(i++);
			char value = packed.charAt(i++);
			do
				map[j++] = value;
			while (--count > 0);
		}
		return map;
	}

	/**
	 * Refills the input buffer.
	 * 
	 * @return <code>false</code>, iff there was new input.
	 * 
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException {

		/* first: make room (if you can) */
		if (zzStartRead > 0) {
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead
					- zzStartRead);

			/* translate stored positions */
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzPushbackPos -= zzStartRead;
			zzStartRead = 0;
		}

		/* is the buffer big enough? */
		if (zzCurrentPos >= zzBuffer.length) {
			/* if not: blow it up */
			char newBuffer[] = new char[zzCurrentPos * 2];
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
		}

		/* finally: fill the buffer with new input */
		int numRead = zzReader.read(zzBuffer, zzEndRead, zzBuffer.length
				- zzEndRead);

		if (numRead < 0) {
			return true;
		} else {
			zzEndRead += numRead;
			return false;
		}
	}

	/**
	 * Closes the input stream.
	 */
	public final void yyclose() throws java.io.IOException {
		zzAtEOF = true; /* indicate end of file */
		zzEndRead = zzStartRead; /* invalidate buffer */

		if (zzReader != null)
			zzReader.close();
	}

	/**
	 * Resets the scanner to read from a new input stream. Does not close the
	 * old reader.
	 * 
	 * All internal variables are reset, the old input stream <b>cannot</b> be
	 * reused (internal buffer is discarded and lost). Lexical state is set to
	 * <tt>ZZ_INITIAL</tt>.
	 * 
	 * @param reader
	 *            the new input stream
	 */
	public final void yyreset(java.io.Reader reader) {
		zzReader = reader;
		zzAtBOL = true;
		zzAtEOF = false;
		zzEndRead = zzStartRead = 0;
		zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
		yyline = yychar = yycolumn = 0;
		zzLexicalState = YYINITIAL;
	}

	/**
	 * Returns the current lexical state.
	 */
	public final int yystate() {
		return zzLexicalState;
	}

	/**
	 * Enters a new lexical state
	 * 
	 * @param newState
	 *            the new lexical state
	 */
	public final void yybegin(int newState) {
		zzLexicalState = newState;
	}

	/**
	 * Returns the text matched by the current regular expression.
	 */
	public final String yytext() {
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	/**
	 * Returns the character at position <tt>pos</tt> from the matched text.
	 * 
	 * It is equivalent to yytext().charAt(pos), but faster
	 * 
	 * @param pos
	 *            the position of the character to fetch. A value from 0 to
	 *            yylength()-1.
	 * 
	 * @return the character at position pos
	 */
	public final char yycharat(int pos) {
		return zzBuffer[zzStartRead + pos];
	}

	/**
	 * Returns the length of the matched text region.
	 */
	public final int yylength() {
		return zzMarkedPos - zzStartRead;
	}

	/**
	 * Reports an error that occured while scanning.
	 * 
	 * In a wellformed scanner (no or only correct usage of yypushback(int) and
	 * a match-all fallback rule) this method will only be called with things
	 * that "Can't Possibly Happen". If this method is called, something is
	 * seriously wrong (e.g. a JFlex bug producing a faulty scanner etc.).
	 * 
	 * Usual syntax/scanner level error handling should be done in error
	 * fallback rules.
	 * 
	 * @param errorCode
	 *            the code of the errormessage to display
	 */
	private void zzScanError(int errorCode) {
		String message;
		try {
			message = ZZ_ERROR_MSG[errorCode];
		} catch (ArrayIndexOutOfBoundsException e) {
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}

	/**
	 * Pushes the specified amount of characters back into the input stream.
	 * 
	 * They will be read again by then next call of the scanning method
	 * 
	 * @param number
	 *            the number of characters to be read again. This number must
	 *            not be greater than yylength()!
	 */
	public void yypushback(int number) {
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}

	/**
	 * Contains user EOF-code, which will be executed exactly once, when the end
	 * of file is reached
	 */
	private void zzDoEOF() throws java.io.IOException {
		if (!zzEOFDone) {
			zzEOFDone = true;
			yyclose();
		}
	}

	/**
	 * Resumes scanning until the next regular expression is matched, the end of
	 * input is encountered or an I/O-Error occurs.
	 * 
	 * @return the next token
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	public java_cup.runtime.Symbol next_token() throws java.io.IOException {
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;
		char[] zzCMapL = ZZ_CMAP;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true) {
			zzMarkedPosL = zzMarkedPos;

			boolean zzR = false;
			for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL; zzCurrentPosL++) {
				switch (zzBufferL[zzCurrentPosL]) {
				case '\u000B':
				case '\u000C':
				case '\u0085':
				case '\u2028':
				case '\u2029':
					yyline++;
					yycolumn = 0;
					zzR = false;
					break;
				case '\r':
					yyline++;
					yycolumn = 0;
					zzR = true;
					break;
				case '\n':
					if (zzR)
						zzR = false;
					else {
						yyline++;
						yycolumn = 0;
					}
					break;
				default:
					zzR = false;
					yycolumn++;
				}
			}

			if (zzR) {
				// peek one character ahead if it is \n (if we have counted one
				// line too much)
				boolean zzPeek;
				if (zzMarkedPosL < zzEndReadL)
					zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				else if (zzAtEOF)
					zzPeek = false;
				else {
					boolean eof = zzRefill();
					zzEndReadL = zzEndRead;
					zzMarkedPosL = zzMarkedPos;
					zzBufferL = zzBuffer;
					if (eof)
						zzPeek = false;
					else
						zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				}
				if (zzPeek)
					yyline--;
			}
			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			zzState = zzLexicalState;

			zzForAction: {
				while (true) {

					if (zzCurrentPosL < zzEndReadL)
						zzInput = zzBufferL[zzCurrentPosL++];
					else if (zzAtEOF) {
						zzInput = YYEOF;
						break zzForAction;
					} else {
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof) {
							zzInput = YYEOF;
							break zzForAction;
						} else {
							zzInput = zzBufferL[zzCurrentPosL++];
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					if (zzNext == -1)
						break zzForAction;
					zzState = zzNext;

					int zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1) {
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8)
							break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
			case 4: {
				return symbol(sym.INT, yytext());
			}
			case 24:
				break;
			case 1: {
				throw new java.io.IOException("Illegal character <" + yytext()
						+ ">");
			}
			case 25:
				break;
			case 19: {
				return symbol(sym.VALUE);
			}
			case 26:
				break;
			case 14: {
				return symbol(sym.GET);
			}
			case 27:
				break;
			case 5: {
				return symbol(sym.LPAREN);
			}
			case 28:
				break;
			case 15: {
				return symbol(sym.PIDTYPE);
			}
			case 29:
				break;
			case 11: {
				return symbol(sym.STRINGID, yytext());
			}
			case 30:
				break;
			case 8: {
				return symbol(sym.STRING, yytext());
			}
			case 31:
				break;
			case 3: {
				return symbol(sym.ID, yytext());
			}
			case 32:
				break;
			case 7: {
				return symbol(sym.COMMA);
			}
			case 33:
				break;
			case 22: {
				return symbol(sym.STRINGTYPE);
			}
			case 34:
				break;
			case 13: {
				return symbol(sym.PID);
			}
			case 35:
				break;
			case 23: {
				return symbol(sym.RECEIVER);
			}
			case 36:
				break;
			case 12: {
				return symbol(sym.SET);
			}
			case 37:
				break;
			case 18: {
				return symbol(sym.BOOLTYPE);
			}
			case 38:
				break;
			case 10: {
				return symbol(sym.ENV, yytext());
			}
			case 39:
				break;
			case 20: {
				return symbol(sym.SENDER);
			}
			case 40:
				break;
			case 9: {
				return symbol(sym.SM);
			}
			case 41:
				break;
			case 21: {
				return symbol(sym.GETPID);
			}
			case 42:
				break;
			case 6: {
				return symbol(sym.RPAREN);
			}
			case 43:
				break;
			case 17: {
				return symbol(sym.BOOL, yytext());
			}
			case 44:
				break;
			case 2: { /* ignore */
			}
			case 45:
				break;
			case 16: {
				return symbol(sym.INTTYPE);
			}
			case 46:
				break;
			default:
				if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
					zzAtEOF = true;
					zzDoEOF();
					{
						return new java_cup.runtime.Symbol(sym.EOF);
					}
				} else {
					zzScanError(ZZ_NO_MATCH);
				}
			}
		}
	}

}
