package Scanner;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {
			System.out.println("숫자을 입력해주세요.");
			int R = sc.nextInt();
			System.out.println("숫자와 단어를 입력해주세요.");
			String S = sc.next();
			for (int j = 0; j < arr.length; j++) {

				System.out.println(arr[j]);
			}
		}

	}
}
