package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumABMinus7 {
	public static void main(String[] args) throws IOException{
		/*
		 * A+B - 7
		 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
			5
			1 1
			2 3
			3 4
			9 8
			5 2
			
			Case #1: 2
			Case #2: 5
			Case #3: 7
			Case #4: 17
			Case #5: 7
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
		
		int N = Integer.parseInt(br.readLine()); // 처음 몇개 입력할지 정해주는 숫자
		StringTokenizer str;
		
		for(int i=1; i <= N; i++) {
			str = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			System.out.println("Case #"+ i + ": " + (a+b));
			
		}
		
		br.close();
		
	}
}
