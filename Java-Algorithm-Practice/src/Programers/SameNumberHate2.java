package Programers;

import java.util.ArrayList;
import java.util.Arrays;

public class SameNumberHate2 {
	public static void main(String[] args) {
		// 같은 숫자는 싫어 다시 풀어보기
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				num = arr[i];
				list.add(num);
				System.out.println(list.toString());
			}
		}
		answer = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
				answer[j] = list.get(j);
				System.out.println(Arrays.toString(answer));
		}

	}
}
