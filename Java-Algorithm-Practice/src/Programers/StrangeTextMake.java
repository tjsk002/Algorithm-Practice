package Programers;

public class StrangeTextMake {
	public static void main(String[] args) {
		// 이상한 문자 만들기
		String s = "try hello world";
		String answer = "";
		// TrY HeLlO WoRlD
		String[] str = s.split("");
//		[t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
//		System.out.println(Arrays.toString(str));

		// str -> [try, hello, world]
		// str[0] = "try".toUpperCase() -> "TRY"
		// str[0] = "try" ==> str[0].setCharAt(0, str[0].getCharAt(0).toUpperCase());
		
		int idx = 0;
		for (int i = 0; i < str.length; i++) {
			if (("").equals(str[i])) {
				idx = 0;
				answer += " ";
				System.out.println("22");
			} else if (idx % 2 == 0) {
				// 짝수일때
				idx++;
				answer += str[i].toUpperCase();
			} else {
				System.out.println();
			}

		}
	}
//		System.out.println(Arrays.deepToString(str));
}
