package Programers;

import java.util.Arrays;

public class ArraysSum {
	public static void main(String[] args) {
		// Çà·ÄÀÇ µ¡¼À
//		int[][] arr1 = new int[2][2];
		int[][] arr1 = new int[][]{{1,2},{2,3}};
		int[][] arr2 = new int[][]{{3,4},{5,6}};
//		int[][] answer = new int[2][2];
		int[][] answer = new int[arr1.length][arr1[0].length];
//		System.out.println(arr1.length);
//		System.out.println(arr1[0].length);
		System.out.println(Arrays.deepToString(answer));
//		System.out.println(Arrays.deepToString(arr1));
//		System.out.println(Arrays.deepToString(arr2));
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
//				System.out.println(Arrays.deepToString(answer));
			}
		}
		System.out.println(Arrays.deepToString(answer));
	}
}
