package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IdentificationNumber {
	public static void main(String[] args) throws IOException {
		// 고유번호 identification number
		/**
		 * 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인
		 * 1이 검증수이다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sum += temp*temp;
		}
		sum = sum%10;
		System.out.println(sum);
//		System.out.println(Math.pow(3, 2));
		// 제곱을 사용할때는 Math.pow()
	}
}
