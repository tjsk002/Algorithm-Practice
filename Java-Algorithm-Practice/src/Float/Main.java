package Float;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double num1, num2;
		String str;
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		str = sc.next();
		
		System.out.printf("%.2f\n",num1);
		System.out.printf("%.2f\n",num2);
		System.out.printf(str);
	}
}
