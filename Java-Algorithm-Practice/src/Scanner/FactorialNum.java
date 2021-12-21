package Scanner;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			// 0 1 2 3 4
			result = fac2(i);
		}
		System.out.println(result);
	}

	public static int fac1(int n) {
		int p = 1;
		for (int i = 1; i < n; i++) {
			p = p*1;
		}
		return p;
	}
	
	public static int fac2(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fac2(n-1)*n;
		}
	}
}
