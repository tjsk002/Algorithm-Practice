package Programers;

public class KimHusband {
	public static void main(String[] args) {
		// 김서방 찾기
		String[] seoul = new String[] {"Jane","Kim"};
		String result = "";
		int n = 0;
		StringBuffer sb = new StringBuffer();
		// 김서방은 1에 있다 출력하기
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				n = i;
			}
		}
		result = sb.append("김서방은 ").append(n).append("에 있다").toString();
		System.out.println(sb);
		System.out.println(result);
	}
}
