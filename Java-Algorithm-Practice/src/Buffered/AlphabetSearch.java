package Buffered;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class AlphabetSearch {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int arr[] = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
s		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for(int result : arr) {
			System.out.printf(result + " ");
		}
		
	}
}
