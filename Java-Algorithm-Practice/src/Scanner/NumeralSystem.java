package Scanner;

import java.util.Scanner;

public class NumeralSystem {
	public static void main(String[] args) {
		// numeral system -> Áø¹ı
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		while(n > 0) {
			str = n%2 + str;
			n /= 2;
		}
		System.out.println(str);
	}
}
