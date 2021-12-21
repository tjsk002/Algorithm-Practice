package Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class NumberSort {
	public static void main(String[] args) {
		// 수 정렬하기
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int result : arr) {
			System.out.println(result);
		}
	}
}
