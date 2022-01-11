package Programers;

import java.util.Arrays;

public class StrangeTextMake2 {
	public static void main(String[] args) {
		// 다른 방법으로 풀기
		String s = "try hello world";
		String result = "";
		// TrY HeLlO WoRlD
		String[] str = s.split("");
		// [t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
		// asList
		System.out.println(Arrays.asList(str).indexOf("h"));
		
		for (int i = 0; i < str.length; i++) {
		}
	}
}
