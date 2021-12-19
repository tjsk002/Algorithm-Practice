package Scanner;
public class SelfNumber {
	public static void main(String[] args) {
		/**
		 * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 
		 * 51은 57의 생성자이다. 
		 * 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
		 */
		for (int i = 0; i < 5; i++) {
			int n = d(i);
			System.out.println(n);
		}
		System.out.println("");
	}
	
	
	public static int d (int number) {
		number = 10;
		int sum = number;
		return sum;
	}
}
