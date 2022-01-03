package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort2 {
	public static void main(String[] args) throws IOException{
		// 백준 10989번 문제 '수 정렬하기3'
		// 10,000,000 천만 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//for (int i = 0; i < n; i++) {
		//	sb.append(arr[i]).append('\n');
		//}
		
		for(int result : arr) {
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
