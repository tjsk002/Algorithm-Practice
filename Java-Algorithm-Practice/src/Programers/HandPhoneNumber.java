package Programers;

public class HandPhoneNumber {
	public static void main(String[] args) {
		// charAt 사용해서 풀어보기
		String phone_number = "01033334444";
		String answer = "";
		// 다른 방법 정규식
		String phoneNum = "0212341223";
		String result = "";
		
		long longTest = 1;
//		int intTest = 1L;
		result = phoneNum.replaceAll(".(?=.{4})", "*");
		
		System.out.println("정규식으로 풀기 = " + result);
		// return -> *******4444
		for (int i = 0; i < phone_number.length(); i++) {
			if(i<phone_number.length()-4) {
				answer += "*";
			}else {
				answer += phone_number.charAt(i);
			}
		}
		System.out.println("charAt()으로 풀기 = " + answer);
	}
}
