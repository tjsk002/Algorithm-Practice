package Programers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

public class TwoSum {
	
	public static List<Integer> twoSum(List<Integer> nums, int target) {
		final int length = nums.size();
		Map<Integer, Set<Integer>> mp = new HashMap<Integer, Set<Integer>>();
		
		for (int i = 0; i < length; ++i) {
			final int num = nums.get(i);
			// num = 2 7 11 15
			final int key = target - num;
			// key = 9-2 / 9-7 / 9-11 / 9-15
			// key = 7,2,-2,-6
			Set<Integer> newVal = mp.getOrDefault(key, new HashSet<Integer>());
			
			newVal.add(i);
			System.out.println(String.format("key: %s, newVal: %s", key, newVal));
			mp.put(key, newVal);
		}
		
		for (int i = 0; i < length; ++i) {
			final int key = nums.get(i);
			final int oldKey = target - key;
			mp.get(oldKey).remove(i);
			// contains test
			if (mp.containsKey(key) && !mp.get(key).isEmpty()) {
				List<Integer> answer = new ArrayList<>();
				answer.add(i);
			    int partner = mp.get(key)
				.stream()
				.findFirst()
				.orElse(-1);
			    answer.add(partner);
			    Collections.sort(answer);
				return answer;
			}
		}
		
		return null;
	}
	/**
	 * 
	 *  Given nums = [2, 7, 11, 15], target = 9,

		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> nums = Arrays.stream(new int [] {2, 7, 11, 15})
				.mapToObj(Integer::valueOf)
				.collect(Collectors.toList());
		
		int target = 9;
		System.out.println(twoSum(nums, target));
		
	}
}
