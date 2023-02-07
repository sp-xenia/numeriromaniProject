package numeriromani;

import java.util.HashMap;

public class LetteraToDecimale {
	@SuppressWarnings("serial")
	private static final HashMap<Character, Integer> decimalValueOfRomanSymbols = new HashMap<Character, Integer>() {{
			put('I',1);
			put('V',5);
			put('X',10);
			put('L',50);
			put('C',100);
			put('D',500);
			put('M',1000);
		}
	};
	
	public static int getDecimale(char c) {
		return decimalValueOfRomanSymbols.get(c);
	}

}
