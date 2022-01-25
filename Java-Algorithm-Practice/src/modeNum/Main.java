package modeNum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 가장많이 출현한 수를 출력하시오
		// 1 2 2 3 1 4 2 2 4 3
		// 배열 for문

		Scanner sc = new Scanner(System.in);

		// num 안에 10개의 수 배열1개
		int[] inputNum = new int[10];
		
		for (int i = 0; i < 10; i++) {

			inputNum[i] = sc.nextInt();
		}

		int[] mode = new int[10];

		// index 출현한 수
		// index 값 -> index(출현한수)가 몇번 나왔는지 저장하는 용도

		// mode[3] = 5, -> 3번 숫자가 5번 출현했다

		// inputNum -> 1 2 2 3 1 4 2 2 4 3
		
		for (int i = 0; i < 10; i++) {
			// 0번 부터 9번까지 돌아감
			mode[inputNum[i]]++;

			// ex) inputNum[5] -> 숫자 "4"
			// mode의 숫자 4가 +1씩 증가 -> 그래서 2

			// 1씩 증가 ex) i=2

			// mode[1] == 2 숫자 '1'의 개수는 2개
			// mode[2] == 4 숫자 '2'의 개수는 4개
			// mode[3] == 2
			// mode[4] == 2
		}
		int modeNum = 0; // 최빈수
		int modeCnt = 0; // 최빈수가 나온 횟수

		for (int i = 0; i < 10; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수는 : " + modeNum + " // cnt : " + modeCnt);
	}

}
