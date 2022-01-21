package Programers;


public class StrangeTextMake {
	public static void main(String[] args) {
		// 이상한 문자 만들기
		String s = "try hello world";
		String s1 = "try hello  world";
		String answer = "";
		// TrY HeLlO WoRlD
		String[] str = s1.split("");
//		[t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
		
		int idx = 0;
		for (int i = 0; i < str.length; i++) {
			if(idx % 2 == 0) {
				// 짝수일경우
			}else if(idx == 0) {
				
			}
		}
//		System.out.println(answer);
	}
		
}
