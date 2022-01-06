package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SameNumberHate {
	public static void main(String[] args) {
		// 같은 숫자는 싫어
		/**
		 * 중복 제거를 이용한 HashSet을 사용해볼까한다
		 */
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = {};
		// [1,3,0,1]
		// 같이 연속된 숫자일때만 제거를 해줘야한다
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		String[] goodsList = { "notebook", "TV", "monitor", "keyboard", "mouse", "TV", "monitor", "keyboard" };
		ArrayList<String> arrayList = new ArrayList<>();

		for (String item : goodsList) {
			if (!arrayList.contains(item))
				arrayList.add(item);
		}

		System.out.println("arrayList = " + arrayList);

//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//			System.out.println(set.toString());
//		}
		int num = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				num = arr[i];
				// arr[i]가 -1이 아니라면 num에 arr[i]저장
				list.add(arr[i]);
			}
		}

		
		for (int i : arr) {
			if (!list.contains(i)) {
				// list안에 i가 포함 되어있는지 확인하기
				list.add(i);
			}
		}
		System.out.println("list = " + list.toString());
		Integer[] temp = list.toArray(new Integer[list.size()]);
		
		result = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
		System.out.println("***"+Arrays.toString(result));
	}
}
