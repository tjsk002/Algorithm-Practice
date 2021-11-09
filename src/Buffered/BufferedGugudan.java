package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedGugudan {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		//gugudan
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}
