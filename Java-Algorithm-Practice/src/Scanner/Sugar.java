package Scanner;

import java.util.Scanner;

public class Sugar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int max = 5001;
		final int invalid = (int) 1e9; // 10^9
		int[] a = new int[max];

		for (int i = 0; i < max; i++) {
			a[i] = invalid;
		}

		a[0] = 0; // a[0] index 0으로 초기화

		for (int i = 0; i < max - 5; ++i) {
			if (a[i] == invalid) {
				continue;
			}
			a[i + 5] = Math.min(a[i] + 1, a[i + 5]);
		}

		for (int i = 0; i < max - 3; i++) {
			if (a[i] == invalid) {
				continue;
			}
			a[i + 3] = Math.min(a[i] + 1, a[i + 3]);
		}

		int n = sc.nextInt();
		System.out.println(a[n] == invalid ? -1 : a[n]);
	}
}
