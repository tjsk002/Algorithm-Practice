package Scanner;
import java.util.Scanner;

public class WordStudy {
	public static void main(String[] args) {
		// 백준 단어 공부 1157번 문제
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26]; // 알파벳 개수
		int max = 0; // 알파벳 누적
		char result = ' '; // 다른 알파벳의 누적이 같다면 '?' 출력

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0; // 초기설정 0
		}
		
		String str = sc.next().toUpperCase(); // 단어입력, 대문자로 변경

		for (int i = 0; i < str.length(); i++) {
			// 입력한 단어의 개수만큼 반복
			char ch = str.charAt(i);
			arr[ch - 65]++;
			
			if (max < arr[ch - 65]) {
				// arr[7]
				max = arr[ch - 65];
				// max = arr[7] == H
				result = str.charAt(i);
				System.out.println("**" + max);
			} else if (max == arr[str.charAt(i) - 65]) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
