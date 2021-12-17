package Scanner;

import java.util.Scanner;

public class Constant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		StringBuffer sb1 = new StringBuffer(A);
		StringBuffer sb2 = new StringBuffer(B);

		String str1 = sb1.reverse().toString();
		String str2 = sb2.reverse().toString();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

//		if (num1 > num2) {
//			System.out.println(num1);
//		} else if (num1 < num2) {
//			System.out.println(num2);
//		} else {
//			System.out.println("¿À·ù");
//		}

		int result = ((num1 > num2) ? num1 : num2);
		System.out.println(result);

	}
}
