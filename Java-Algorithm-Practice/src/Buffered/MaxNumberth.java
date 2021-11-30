package Buffered;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
public class MaxNumberth {
	public static void main(String[] args) throws IOException{
		// 최대값을 구하고 몇번째에 있는지 구하시오
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9]; // 배열안의 원소 자리 9개를 만들어준다
		
		int count = 0; // 비교
		int max = 0; // 최대값
		int index = 0; //배열의 원소 index
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max + " " + index);
	}
}
