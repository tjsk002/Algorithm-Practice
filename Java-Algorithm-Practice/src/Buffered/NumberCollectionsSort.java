package Buffered;

import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Collections;

public class NumberCollectionsSort {
	public static void main(String[] args) throws IOException {
		// 5 54321 -> 12345
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 첫번째 숫자
		ArrayList<Integer> list = new ArrayList<>(); // arraylist 배열
		StringBuilder sb = new StringBuilder(); // String 이어붙이기
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list); // 오름차순 정리 Arrays.sort();
		
		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb.toString());
	}
}
