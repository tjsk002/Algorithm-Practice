package Programers;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntegerSum {
	public static List<Integer> plusOne(List<Integer> digits) {
		final int n = digits.size();
		List<Integer> answer = new ArrayList<>(digits);
		boolean isDone = false;
		for (int i = n - 1; i >= 0; --i) {
			if (digits.get(i) == 9) {
				answer.set(i, 0);
			} else {
				answer.set(i, digits.get(i) + 1);
				isDone = true;
				break;
			}
		}
		if (!isDone) {
			answer.add(0,  1);
		}
		return answer;
	}
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(9);
		array.add(9);
		array.add(9);

		System.out.println(plusOne(array));
	}
}
