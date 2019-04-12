package challenges;

public class StringEncoder {
	public static String replaceVowels(String string) {

		string.replace('a', '1');
		string.replace('e', '2');
		string.replace('i', '3');
		string.replace('o', '4');
		string.replace('u', '5');

		return string;
	}

	static char[] letters;

	public static void main(String[] args) {
		String input = "Hello World!";
		//expected output   g2kk4yv4qkc!
		//System.out.println(input.replace('e', '2'));
		letters = input.toCharArray();	
		for(char c : letters) {
			isVowel(c);
			isConsonant(c);
			isSpecialChar(c);
		}
	}
	
	

	public static void isVowel(char c) {
		String s = String.valueOf(c);
		if(s.matches("[aeiou]")) {
			System.out.println("vowel--"+c);
		}
		
	}

	public static void isConsonant(char c) {
		String s = String.valueOf(c);
		if(s.matches("[a-z&&[^aeiou]]")) {
			System.out.println("consonant--"+c);

		}
		
	}
	public static void isY() {}
	public static void isSpace() {}
	public static void isSpecialChar(char c) {
		String s = String.valueOf(c);
		if( s.matches("[^a-zA-Z0-9]")) {
			System.out.println("special char--"+c);
		}

	}

}
