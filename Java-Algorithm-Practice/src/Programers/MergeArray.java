package Programers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeArray {
	
	public static void merge(List<Integer> nums, int m, List<Integer> nums2, int n) {
		int mergedLastIndex = m + n - 1;
		int numsLastIndex = m - 1;
		int nums2LastIndex = n - 1;
		
		while (nums2LastIndex >= 0 && numsLastIndex >= 0) {
			if (nums.get(numsLastIndex) > nums2.get(nums2LastIndex)) {
				nums.set(mergedLastIndex, nums.get(numsLastIndex));
				--numsLastIndex;
			} else {
				nums.set(mergedLastIndex, nums2.get(nums2LastIndex));
				--nums2LastIndex;
			}
			
			--mergedLastIndex;
			System.out.println(nums);
		}
		
		while (numsLastIndex > 0) {
			nums.set(mergedLastIndex,  nums.get(numsLastIndex));
			mergedLastIndex--;
			numsLastIndex--;
		}
		
		while (nums2LastIndex > 0) {
			nums.set(mergedLastIndex,  nums2.get(nums2LastIndex));
			mergedLastIndex--;
			nums2LastIndex--;
		}
	}
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.stream(new int[] {1, 5, 10, 15, -1, -1, -1, -1})
				.mapToObj(Integer::valueOf)
				.collect(Collectors.toList());
		
		List<Integer> nums2 =Arrays.stream(new int[] {3, 6, 9, 11})
				.mapToObj(Integer::valueOf)
				.collect(Collectors.toList()); 
		
		merge(nums, nums.size() - nums2.size(), nums2, nums2.size());
		System.out.println(nums);
	}
}
