package Scanner;
import java.util.Scanner;
public class NumberSumCnt {
	public static void main(String[] args) {
		// 숫자의 합
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		// ex. 5 54321
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 처음입력받는 숫자
		String a = sc.next(); // 입력받은 숫자를 String으로 변환
		
		int sum=0;
		for(int i=0; i<n; i++) {
			// n의 개수 만큼, charAt - '0'
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
