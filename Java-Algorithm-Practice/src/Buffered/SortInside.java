package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInside {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		// ют╥б 2143 -> 4321
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
	}
}
