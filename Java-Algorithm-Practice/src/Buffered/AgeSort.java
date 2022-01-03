package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSort {
	public static void main(String[] args) throws IOException{
		// 백준 나이순 정렬 문제
		/**
		 * 3
		 * 21 Junkyu
		 * 21 Dohyun
         * 20 Sunyoung
         * 
         * 20 Sunyoung
         * 21 Junkyu
         * 21 Dohyun
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken(); // 나이
			arr[i][1] = st.nextToken(); // 이름
		}
		
		Arrays.sort(arr, new Comparator<String[]>(){
			// 나이 순으로 정리
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		// 문자열 더할때 StringBuilder 사용
		
		for (int i = 0; i < n; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
	}
}
