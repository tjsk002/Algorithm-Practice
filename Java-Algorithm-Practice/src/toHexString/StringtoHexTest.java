package toHexString;

import java.util.Scanner;

public class StringtoHexTest {
	public static void main(String[] args) {
		// 10진수 값을 16진수로 변환
		// 16진수 값을 10진수로 변환
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		//10진수 -> 16진수
//		System.out.println(Integer.toHexString(13));
		//16진수 -> 10진수
		System.out.println(Integer.parseInt(n, 16));
		
	}
}
