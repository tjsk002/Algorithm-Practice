package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class lowNumber {
	public static void main(String[] args) {
//		정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//		10 5
//		1 10 4 9 2 3 8 5 7 6
//		1 4 2 3 [output]
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		
		// 처음 입력한 숫자의 개수에 맞춰 배열에 넣은값
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(arr[i] < x) {
				System.out.printf(arr[i] + " ");
			}
		}
		sc.close();
	}
}
