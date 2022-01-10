package Programers;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int intN = 12345;
		long longN = 12345;
		// long -> String = String.valueOf(); 사용
		int[] answer = {};
		
		// [5,4,3,2,1] 출력
		String str = Integer.toString(intN);
		StringBuilder sb = new StringBuilder(str);
		
		sb = sb.reverse();
		System.out.println(sb);
		
		String[] strArr = sb.toString().split("");
		
		System.out.println("strArr = " + Arrays.deepToString(strArr));
		
		answer = new int[sb.length()];
//		System.out.println(answer.length);
//		System.out.println(sb.length());
		
		for (int i = 0; i < sb.length(); i++) {
			answer[i] = Integer.parseInt(strArr[i]);
//			System.out.println(Arrays.toString(answer));
		}
		System.out.println(Arrays.toString(answer));
		
	}
}
