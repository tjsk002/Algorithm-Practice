package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortInside {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
		
		Integer[] arr = new Integer[n];
		Integer arr2[] = {2,3,4,5,6,6,4};
		
		Arrays.sort(arr, Collections.reverseOrder());
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		for(int result : arr2) {
			System.out.println(result);
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
	}
}
