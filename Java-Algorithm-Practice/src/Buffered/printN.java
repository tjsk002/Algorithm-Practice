package Buffered;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printN {
	public static void main(String[] args) throws IOException{
		/*
		  input 3
		  output
		  3
		  2
		  1
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 3
		
		int n = Integer.parseInt(br.readLine());
		
		while(n>0) {
			System.out.println(n);
			n--;
		}
	}
}
