package Programers;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisionNumber {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		int[] arr = {10, 5, 9, 7};
		int divisor = 4;
		int[] answer = {-1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }

		if(list.isEmpty()) {
			answer = new int[] {-1};
		}
		
		answer = new int[list.size()];
		// 2개의 원소
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		// String[] test = list.toArray(new String[0]);
		
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}
}
