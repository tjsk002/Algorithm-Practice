package Buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class NumberCollectionsSort {
	public static void main(String[] args) throws IOException {
		// 5 54321 -> 12345
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		Arrays.sort(arr);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.flush();
	}
}
