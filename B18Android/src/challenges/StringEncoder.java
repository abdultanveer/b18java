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
	
	public static void main(String[] args) {
		String input = "Hello World!";
		//expected outputg2kk4yv4qkc!
		System.out.println(input.replace('e', '2'));
		
	}

}
