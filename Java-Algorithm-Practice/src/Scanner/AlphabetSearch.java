package Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSearch {
	public static void main(String[] args) {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
		// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		// baekjoon
		// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		Scanner sc = new Scanner(System.in);
		// next()한 단어 nextLine() 한 문장
		
		int[] arr = new int[26];
		// 기본값을 -1로 초기화 시켜준다 a-z까지 26개 배열 생성
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		String str = sc.nextLine(); // baekjoon
		
//		System.out.println(str.length());
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("###" + ch);
//			System.out.println(ch);
			if(arr[ch - 'a'] == -1) {
				// 첫번째 알파벳만 있으면
				arr[ch - 'a'] = i;
			}
		}
		
		
		for(int result : arr) {
			System.out.print(result + " ");
		}
//		
		
//		System.out.println(Arrays.toString(arr));
	}
}
