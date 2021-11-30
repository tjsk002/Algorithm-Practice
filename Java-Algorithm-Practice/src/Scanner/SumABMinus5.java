package Scanner;

import java.util.Scanner;

public class SumABMinus5 {
	public static void main(String[] args) {
		/*
		1 1
		2 3
		3 4
		9 8
		5 2
		0 0
		----
		2
		5
		7
		17
		7	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) {
				sc.close();
				break;
			}
			System.out.println(a+b);	
		}
	}
}
