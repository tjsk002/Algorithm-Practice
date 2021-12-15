package Scanner;
import java.util.Arrays;

public class StringTest {
	public static void main(String[] args) {
		String str = new String();
		str = "테스트중입니다";
		char result = str.charAt(0);
//		System.out.println(result);
		int[] arr = new int[26];
		
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			System.out.println(ch);
		}
		
	}
}
