package Programers;

public class NewId {
	/**
	 * 
1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	 * @param c
	 * @return
	 */
	static boolean isValid(char c) {
		if(Character.isLetterOrDigit(c)) {
			return true;
			// 문자인경우 파악하기
			
		}
		if(c == '-' || c == '_' || c == '.') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// 신규 아이디 추천
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		StringBuilder result = new StringBuilder();
		System.out.println(new_id);
		boolean lastDot = false;
		// 마지막 . 도트 확인
		// String으로 마지막에 변환해주면 된다
		// result = bat.y.abcdefghi
		new_id = new_id.toLowerCase();
		
		for(char ch : new_id.toCharArray()) {
			if(isValid(ch) == false) {
				continue;
			}
			// char 문자가 아니라면
			if(ch == '.') {
				// 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
				if(result.length() == 0 || lastDot) {
					// 첫 문자열에 . 이라면, 혹은 마지막 .이라고 하면
					continue;
				}
				lastDot = true;	
			}else {
				lastDot = false;
			}
			result.append(ch);
		}
		
		System.out.println(result.toString());
	}
}
