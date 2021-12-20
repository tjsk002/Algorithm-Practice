package Scanner;

public class SelfNumber {
	public static void main(String[] args) {
		/*
		 * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한
		 * 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
		 */
		int[] arr = new int[10000];
		for (int i = 1; i < 10000; i++) {
			arr[d(i)]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static int d(int number) {
		int cnt = number;
		// number 생성자, 새로운 숫자 cnt
		while (number != 0) {
			cnt = cnt + (number % 10);
			number = number / 10;
			if (cnt > 9999) {
				return 0;
			}
		}
		return cnt;
	}
}
