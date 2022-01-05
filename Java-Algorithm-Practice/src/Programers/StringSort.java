package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSort {
	public static void main(String[] args) {
		// 문자열 내 마음대로 정렬하기
		String[] strings = { "sun", "bed", "car" };
		int n = 1; // u e a
		ArrayList<String> list = new ArrayList<String>();
		// return ["car", "bed", "sun"]
		
		for (int i = 0; i < strings.length; i++) {
			// 3
			list.add(strings[i].charAt(n) + strings[i]);
			// [usun, ebed, acar]
		}
		System.out.println(list.toString());
		Collections.sort(list);
		// 정리 해주고
		String[] answer = new String[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			// size -> 원소의 갯수
			answer[i] = list.get(i).substring(1, list.get(i).length());
			System.out.println(answer[i]);
		}
	}
}
