package Scanner;

import java.util.Scanner;

public class IdentificationNumber {
	public static void main(String[] args) {
		// 고유번호 identification number
		/**
		 * 고유번호의 처음 5자리의 숫자들이 04256이면,
		 * 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 
		 * 81 을 10으로 나눈 나머지인 1이 검증수이다.
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int temp = sc.nextInt();
//			sum += temp*temp;
			sum += Math.pow(temp, 2);
		}
		
		int result = sum%10;
		
		System.out.println(result);
	}
}
