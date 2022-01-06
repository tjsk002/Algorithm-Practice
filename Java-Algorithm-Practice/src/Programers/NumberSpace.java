package Programers;

import java.util.Arrays;

public class NumberSpace {
	public static void main(String[] args) {
		// x만큼 간격이 있는 n개의 숫자
		// x-> 2 n -> 5 [2,4,6,8,10]
		int x = -4;
		int n = 2;
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] += x*(i+1);
//			System.out.println(i+1);
			System.out.println(Arrays.toString(answer));
		}
	}
}
