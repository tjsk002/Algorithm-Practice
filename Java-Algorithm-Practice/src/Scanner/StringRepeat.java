package Scanner;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 맨처음 숫자

		for (int i = 0; i < T; i++) {
			int R = sc.nextInt(); // 두번째 입력 숫자
			String S = sc.next(); // String 입력

			for (int j = 0; j < S.length(); j++) {
				for (int j2 = 0; j2 < R; j2++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}

	}
}
