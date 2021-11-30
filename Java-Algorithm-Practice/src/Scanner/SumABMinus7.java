package Scanner;

import java.util.Scanner;

public class SumABMinus7 {
	public static void main(String[] args) {
		/*
		 * A+B - 7
		 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
			5
			1 1
			2 3
			3 4
			9 8
			5 2
			
			Case #1: 2
			Case #2: 5
			Case #3: 7
			Case #4: 17
			Case #5: 7
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
		
		sc.close();
	}
}
