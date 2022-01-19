package Programers;

import java.util.Arrays;

public class MinNumDelecte {
	public static void main(String[] args) {
		// 제일 작은 수 제거
		int[] arr = { 5, 4, 3, 2, 1 };
		int[] answer = new int[arr.length - 1];

		int minN = arr[0];
		// 기준으로 잡는다
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(minN);
			minN = Math.min(minN, arr[i]);
		}

		if (arr.length <= 1) {
			// 1미만이면
			answer = new int[] { -1 };
		}

		
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == minN) {
				// 제일 작은 수는 빼버린다
				continue;
			} 
			answer[idx++] = arr[i];
			
		}
		System.out.println(Arrays.toString(answer));
	}
}
