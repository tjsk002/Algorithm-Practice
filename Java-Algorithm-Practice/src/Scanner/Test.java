package Scanner;

public class Test {
	public static void main(String[] args) {
		String str = new String();
		str = "baekjoon";
		
		
		char ch2 = str.charAt(0);
		System.out.println(ch2 - 'b');
		
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
//			System.out.println(ch);
		}
		
		for(char ch = 'a'; ch <= 'z'; ++ch) {
//			System.out.println(ch - 'a');
		}
	}
}
