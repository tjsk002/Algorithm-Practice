package Programers;

import java.util.Arrays;

public class kNum {
	public static void main(String[] args) {
		// k번째
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		// ex) 5263 -> 2356 -> 3번째 인덱스 -> 5
		// return [5, 6, 3]
		int[] answer = {};
		int[][] temp = null;
		answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			// 3번 copyOfRange 사용해서 만들어보자
			temp = Arrays.copyOfRange(commands, 1, 2);
			System.out.println(commands[i][0]);
		}
		
		System.out.println(Arrays.deepToString(temp));
	}
}
