package Programers;

import javax.xml.bind.ParseConversionEvent;

public class Sum {
	public static void main(String[] args) {
		int n = 123;
		int answer = 0; 
		String str = "";
		
		str = Integer.toString(n);
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
		System.out.println(answer);
	}
}
