package Programers;

import java.util.Arrays;
import java.util.Collections;

public class LongTypeSort {
	public static void main(String[] args) {
		// 정수 내림차순 배치
		long n = 118372;
		// answer = 873211 출력
		long answer;
		String str = String.valueOf(n);
		// long -> String으로 형변환
		String[] arr = new String[str.length()];
		arr = str.split("");
		System.out.println(Arrays.deepToString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(arr));
		String temp = String.join("", arr);
		answer = Long.parseLong(temp);
		System.out.println(answer);
	}
}
