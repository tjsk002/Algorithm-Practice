package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class WordSort {
	public static void main(String[] args) throws IOException {
		// 백준 단어 정렬 문제
		/*
		 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오. 
		 * 1. 길이가 짧은것부터 
		 * 2. 길이가 같으면 사전 순으로 문자열 길이는 50을 넘지 않는다
		 */
		final int wordN = 50; // 문자열 길이는 50을 넘지 않는다

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		// HashSet -> 중복 제거
		
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		System.out.println(set);
		// boolean equals() 문자열 내용이 같은지 비교
		ArrayList<String> list = new ArrayList<String>(set);

		// Comparator 클래스를 통하여 custom 정렬
		// 길이에 따라서 먼저 정렬하고, 길이가 같으면 사전 순

		Collections.sort(list, new Comparator<String>() {
			/*
			 * - int compareTo(NumberSubClass referenceName) 
			 * - int compareTo(String
			 * anotherString) 숫자일 경우 1 크다, 0 같다, -1 작다 문자일 경우 0 같다, 그 외 양수/음수값
			 * 기준값.compareTo( 비교대상 )
			 */
			// no no more hello apple
			public int compare(String v1, String v2) {
				// return v1.length() - v2.length(); // 오름차순
				if (v1.length() > v2.length()) {
					// 글자 수 순서
					return 1;
					// 1 크다, 0 같다
				} else if (v1.length() < v2.length()) {
					return -1;
					// -1 작다
				} else {
					return v1.compareTo(v2);
					// v1 == v2 같으면 문자열 비교하기
					// compareTo() 함수에는 문자열 비교, 숫자 비교 가능하다
				}
			}
		});

		for (String s : list) {
			System.out.println(s);
		}

		String str = "abcd";
		System.out.println(str.compareTo("ab"));
	}
}
