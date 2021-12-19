package Scanner;

public class SelfNumber {
	public static void main(String[] args) {
		/**
		 * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한
		 * 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
		 */
		for (int i = 0; i < 1; i++) {
			int n = d(i); // d(n)의 생성자 -> n
			System.out.println("n: " + n);
		}
	}

	public static int d(int number) {
		number = 75;
		System.out.println("*number: " + number);
		int cnt = number; // cnt는 n과 각 자리수를 더한값 예)75

		System.out.println("*cnt: " + cnt);
		while (number != 0) {
			cnt = cnt + (number % 10); // cnt = 80
			System.out.println("cnt: " + cnt);
			number = number / 10; // 7
			System.out.println("number: " + number);
		}
		return cnt;
	}
}
