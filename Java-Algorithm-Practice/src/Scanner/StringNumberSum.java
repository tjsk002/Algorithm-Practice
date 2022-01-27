package Scanner;

import java.util.Scanner;

public class StringNumberSum {
	public static void main(String[] args) {
		// 123 -> 6
		// 987 -> 24
//		String str = "안녕하세요";
//		String[] arr = str.split("");
//		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = String.valueOf(n).split("");
		// 숫자를 String으로 형변환 먼저해준다
//		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(String result : arr) {
			sum += Integer.parseInt(result);
		}
		System.out.println(sum);
		
	}
}
