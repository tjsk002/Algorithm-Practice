package Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class fastAsumB {
	public static void main(String[] args) throws IOException {

		/*
		ºü¸¥ A+B
		5
		1 1
		12 34
		5 500
		40 60
		1000 1000
	 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			str = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()) + "\n");
		}
		bw.close();
	}
}
