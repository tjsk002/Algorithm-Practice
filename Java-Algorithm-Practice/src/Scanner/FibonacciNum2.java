package Scanner;

public class FibonacciNum2 {
	
	public static int Fibbonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int cur = 1; // n==2
		int before = 1;
		n -= 2;
		
		while (n != 0) {
			--n;
			int nextCur = cur + before;
			before = cur;
			cur = nextCur;
		}
		
		return cur;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Fibbonacci(i));
		}
		
	}
}
