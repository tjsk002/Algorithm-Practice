package Programers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TwoNumSum {
	public static void main(String[] args) {
		// 두개 뽑아서 더하기
		int[] nums = { 2, 1, 3, 4, 1 };
//		int[] result = {2,3,4,5,6,7};

		int[] answer;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			// nums.length = 5
//			System.out.println(i);
			System.out.println();
			for (int j = i + 1; j < nums.length; j++) {
				set.add(nums[i] + nums[j]);
//				System.out.println(set);
			}
		}
		
//		answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
//		System.out.println(Arrays.toString(answer));
		
		
	}
}
