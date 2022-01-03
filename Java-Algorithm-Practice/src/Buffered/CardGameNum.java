package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGameNum {
	public static void main(String[] args) throws IOException {
		// 백준 5522 카드게임문제 -> 총점을 구하는 프로그램을 작성하라.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0; // 총점
		
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sum += temp;
		}
		System.out.println(sum);
	}
}
