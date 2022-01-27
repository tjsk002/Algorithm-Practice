package Programers;

public class ArrayAvg {
	public static void main(String[] args) {
		// Æò±Õ ±¸ÇÏ±â
		int[] arr = {1,2,3,4};
	
		double sum = 0;
		double answer = 0;
		// 2.5
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			sum += arr[i];
		}
		answer = sum/arr.length;
		System.out.println(answer);
		
	}
}
