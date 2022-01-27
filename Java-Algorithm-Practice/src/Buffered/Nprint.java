package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nprint {
	public static void main(String[] args) throws IOException{
		/*
		  input 3
		  output
		  1
		  2
		  3
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3
		
		int n = Integer.parseInt(br.readLine());
		int i=1;
		
		while(i<=n) {
			
			System.out.println(i);
			i++;
		}
		
	}
}
