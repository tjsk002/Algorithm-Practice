package Scanner;
import java.util.Scanner;

public class FibonacciNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피보나치 숫자를 입력해주세요.");
		int n = sc.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = (fivo(i));
		}
		System.out.println(result);
	}

	public static int fivo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fivo(n - 2) + fivo(n - 1);
		}
	}
}
