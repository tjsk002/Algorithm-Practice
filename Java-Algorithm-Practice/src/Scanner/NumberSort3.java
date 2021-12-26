package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort3 {
	public static void main(String[] args) throws IOException{
		// 10,000,000 Ãµ¸¸
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10000001];
		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		System.out.println("arr = " + Arrays.toString(arr));
		br.close();
		
		for (int i = 1; i < 10000001; i++) {
			while(arr[i] > 0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}
