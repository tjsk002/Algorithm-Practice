package Scanner;

import java.util.Scanner;

public class IsDigitNumber {
	public static void main(String[] args) {
		// a123, 1234 숫자인지 확인하는 문제
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if(Character.isDigit(arr[i]) == true) {
				result = true;
			}else {
				result = false;
			}
		}
		System.out.println(result);
	}
}
