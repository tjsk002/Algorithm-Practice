package Scanner;

import java.util.Scanner;

public class MaxNumberth {
	public static void main(String[] args) {
		// 최대값을 구하고 몇번째에 있는지 구하시오
		
		Scanner sc = new Scanner(System.in);
		// 9개 정수 입력할 배열
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int count = 0; // 비교하기 위해
		int max = 0; // 최대값
		int index = 0; // 배열에 있는 index
		
		// 입력한 배열의 원소를 i에 저장하기
		for (int i : arr) {
			count++;
			if(i > max) {
				max = i;
				index = count;
			}
		}
		System.out.println(max + " " + index);
	}
}
