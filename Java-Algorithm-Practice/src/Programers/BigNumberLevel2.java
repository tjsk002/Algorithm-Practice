package Programers;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumberLevel2 {
	public static void main(String[] args) {
		// 가장 큰 수를 구하기
		int[] num = {6, 10, 2};
		String answer = "";
		
		// 문자 배열로 전환
		String[] str = new String[num.length];
		for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(num[i]);
			// [6, 10, 2]
			
		}
		
		//comparator 인터페이스로 정렬 기준을 설정
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return ((o2+o1).compareTo(o1+o2));
			}
		});
		
		for(String s : str) {
			answer += s;
			System.out.println(answer);
		}
		if(str[0].equals(0)) {
			// 데이터가 0인 경우
			answer = "0";
		}
	}
}
