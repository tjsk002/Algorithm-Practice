package Programers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PhoneCketMon {
	public static void main(String[] args) {
		// 폰켓몬 /n
		int[] nums = {3,3,3,2,2,2}; // 폰켄몬
		int answer = 0;
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		answer = Math.min(set.size(), nums.length >> 1);
		//answer =  Math.min(set.size(), nums.length/2);
		System.out.println("answer = " + answer);
	}
}
