package Uppercase;

public class Main {
	public static void main(String[] args) {
		/*
		 * 대문자는 소문자로, 소문자는 대문자로 변환하시오
		 * helloWorLD
		 * -> HELLOWORld
		 * 
		 * 배열, for, if
		 * */
		
		String input = "helloWorLD";
		char []arr;
		//아스키 코드? 
		arr = input.toCharArray();
		System.out.println("입력한 문자 : " + input);
		for(int i=0; i<arr.length; i++) {
			//대문자냐 소문자냐 구분먼저?
			//소문자 a부터 z까지 / A - Z
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + 'A' - 'a');
				
			}else if(arr[i] >= 'A' && arr[i] <= 'Z'){
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}
		}
		System.out.println(arr);
		
	}
}
