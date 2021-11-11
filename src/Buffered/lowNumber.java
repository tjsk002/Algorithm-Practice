package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lowNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer str;
		int arr[] = new int[n];
		System.out.println(Arrays.toString(arr));
		
		/*
 		정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 		이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		10 5
		1 10 4 9 2 3 8 5 7 6
		------
		1 4 2 3
		 */
		
	}
}
