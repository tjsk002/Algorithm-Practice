package Programers;

import java.util.Arrays;

public class DidntPlayer {
	public static void main(String[] args) {
		// 완주하지 못한 선수
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String result = ""; //leo
		Arrays.sort(participant);
		Arrays.sort(completion);
//		System.out.println(Arrays.toString(participant));
//		System.out.println(Arrays.toString(completion));
		int i =0;
		for(i = 0; i<completion.length; i++) {
			// 2
			
			if(participant[i].equals(completion[i])) {
				// false
				continue;
				
			}else {
				System.out.println(participant[i]);
			}
		}
		System.out.println(participant[i]);
	}
}
