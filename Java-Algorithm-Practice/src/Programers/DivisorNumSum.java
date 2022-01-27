package Programers;

public class DivisorNumSum {
	public static void main(String[] args) {
		// 프로그래머스 약수의 개수와 덧셈
		int left = 13;
		int right = 17;
//		System.out.println(Arrays.toString(arr));

		int result = 0;
//		int cnt = 0; // 약수 되는 숫자 카운팅
		for (int i = left; i <= right; i++) {
			// i는 13부터 17까지 = 13,14,15,16,17
			int cnt = 0; // 약수 되는 숫자 카운팅
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					// 약수 몇개인지
					cnt++;
//					System.out.println(cnt);
				}
			}
			if (cnt % 2 == 0) {
				// 짝수인지 아닌지
				result += i;
			} else {
				result -= i;
			}
		}
		System.out.println(result);
	}
}
