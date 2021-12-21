package Scanner;
import java.util.Scanner;
import java.util.Arrays;
public class RecursionStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] arr= new char[N][N];
        int n = 3;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			}
			System.out.println("**");
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("*");
			}
			System.out.println("\n");
		}
	}
	
}
