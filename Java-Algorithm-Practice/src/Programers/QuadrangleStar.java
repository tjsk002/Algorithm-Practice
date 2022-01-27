package Programers;

import java.util.Scanner;

public class QuadrangleStar {
	public static void main(String[] args) {
		// 직사각형 찍기
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		// input 5 3
		/*
		 * output
		 *****
		 *****
		 *****
		 */
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
