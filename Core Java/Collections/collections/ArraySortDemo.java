package collections;


import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {

		char[] ch = elminateDupChar("b", "a");
		System.out.println(ch);

	
	}

	/**
	 * Replacing all duplicate characters and special charters by a space
	 * 
	 * @param frStr
	 * @param secStr
	 * @return
	 */

	public static char[] elminateDupChar(String frStr, String secStr) {
		String dupChar = (frStr + secStr).replaceAll("[^a-zA-Z0-9 ]", "");

		char ch;
		char[] dChar;
		String newChar = "";

		for (int i = 0; i < dupChar.length(); i++) {
			ch = dupChar.charAt(i);
			if (ch != ' ')
				newChar = newChar + ch;
			dupChar = dupChar.replace(ch, ' ');
		}

		dChar = newChar.toCharArray();
		Arrays.sort(dChar);

		return dChar;
	}

}
