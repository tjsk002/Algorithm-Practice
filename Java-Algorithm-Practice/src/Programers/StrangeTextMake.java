package Programers;

public class StrangeTextMake {
	public static void main(String[] args) {
		// 이상한 문자 만들기
		String s = "try hello world";
		String result = "";
		// TrY HeLlO WoRlD
		String[] str = s.split("");
//		[t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
//		System.out.println(Arrays.toString(str));
		
		// str -> [try, hello, world]
		// str[0] = "try".toUpperCase() -> "TRY"
		// str[0] = "try" ==> str[0].setCharAt(0, str[0].getCharAt(0).toUpperCase());
		int idx = 0;
		for (int i = 0; i < str.length; i++) {
			if(("").equals(str[i])) {
				idx = 0;
			}else {
				if(idx%2 == 0) {
					// 짝수일때
					idx++;
					str[i] = str[i].toUpperCase();
				}else {
					idx++;
					str[i] = str[i].toLowerCase();
					
				}
				result += str[i];
			}
			
		}
		System.out.println(result);
//		System.out.println(Arrays.deepToString(str));
	}
}
