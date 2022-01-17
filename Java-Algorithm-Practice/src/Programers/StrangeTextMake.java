package Programers;


public class StrangeTextMake {
	public static void main(String[] args) {
		// 이상한 문자 만들기
		String s = "try hello world";
		String s1 = "try hello  world";
		String answer = "";
		// TrY HeLlO WoRlD
		String[] str = s1.split("");
//		System.out.println(Arrays.toString(str));
//		[t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
//		System.out.println(Arrays.toString(str));
		// str -> [try, hello, world]
		// str[0] = "try".toUpperCase() -> "TRY"
		// str[0] = "try" ==> str[0].setCharAt(0, str[0].getCharAt(0).toUpperCase());
		
		int idx = 0;
//		for (String res : str) {
//			idx = res.contains(" ") ? 0 : 1;
//			// res " " 가 맞으면 0 아니라면 1
//			System.out.print(idx);
//			answer += idx%2 == 0 ? s1.toLowerCase() : s1.toUpperCase();
//		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(idx);
			if(str[i].equals(" ")) {
				// 아무것도 없으면 0
				idx = 0;
				answer += " ";
			}else if(idx % 2 == 0) {
				System.out.println("*");
				answer += str[i].toUpperCase();
				idx++;
				System.out.println(answer);
			}else  {
				System.out.println("#");
				answer += str[i].toLowerCase();
				idx++;
				System.out.println(answer);
			}
		}
//		System.out.println(answer);
	}
		
}
