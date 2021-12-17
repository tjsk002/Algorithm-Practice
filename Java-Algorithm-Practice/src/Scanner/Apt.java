package Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Apt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [][] test = new int[2][3];
//		System.out.println(Arrays.deepToString(test));
		int [][] arrApt = new int[15][15];
		
		for (int i = 0; i < arrApt.length; i++) {
			arrApt[i][1] = 1; // i층의 1호 
			arrApt[0][i] = i; // 0층의 i호
		}
		
		for (int i = 1; i < 15; i++) {
			// 1층부터 14층까지
			for (int j = 2; j < 15; j++) {
				// 2호부터 14호까지
				arrApt[i][j] = arrApt[i][j-1]+arrApt[i-1][j];
			}
		}
		
//		for (int i = 14; i >= 0; i--) {
//			// 1층부터 14층까지
//			for (int j = 1; j < 15; j++) {
//				System.out.printf("%d ", arrApt[i][j]);
//			}
//			System.out.println();
//		}
		
		int num = sc.nextInt(); // 몇개입력할지
		
		for (int i = 0; i < num; i++) {
			int k = sc.nextInt(); // 몇층
			int n = sc.nextInt(); // 몇호
			System.out.println(arrApt[k][n]);
		}
	}
}
