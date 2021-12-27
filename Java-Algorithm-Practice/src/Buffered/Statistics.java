package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
	public static void main(String[] args) throws IOException{
		//Statistics 통계학
		/**
		5
		1 3 8 -2 2 -> 2 2 1 10
		산술평균 : N개의 수들의 합을 N으로 나눈 값 1+3+8+0 = 12/5 -> 2.4 -> 2
		중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		최빈값 : N개의 수들 중 가장 많이 나타나는 값
		범위 : N개의 수들 중 최댓값과 최솟값의 차이
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double sum = 0;
		int min = Integer.MIN_VALUE; // 최소값
		int max = Integer.MAX_VALUE; // 최대값
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			sum += arr[i];
		}
		
		// 1번 문제 avg
		int avg = (int)sum/n;
		
		// 2번 문제 centerN
		Arrays.sort(arr);
		int centerN = (int)arr[n/2];
		System.out.println(centerN);
		
		// 4번 문제 range 범위 구하기
		// -2 1 2 3 8 - > 10
		// 최소 최대 -2 8
		int range = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				range = (int)arr[i];
			}
			if(arr[i] > max) {
				range = (int)arr[i];
			}
			
			System.out.println(min + " " + max);
		}
	}
}
