package Programers;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int n = 12345;
		int[] answer = {};
		
		// [5,4,3,2,1] Ãâ·Â
		String str = Integer.toString(n);
		StringBuilder sb = new StringBuilder(str);
		
		sb = sb.reverse();
		System.out.println(sb);
		
		String[] strArr = sb.toString().split("");
		System.out.println(Arrays.deepToString(strArr));
		
		answer = new int[sb.length()];
		
		for (int i = 0; i < sb.length(); i++) {
			answer[i] = Integer.parseInt(strArr[i]);
//			System.out.println(Arrays.toString(answer));
		}
		System.out.println(Arrays.toString(answer));
		
	}
}
