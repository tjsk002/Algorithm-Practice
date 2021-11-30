package Scanner;

import java.util.Scanner;

public class OXquiz {
	public static void main(String[] args) {
		/*
		5
		OOXXOXXOOO
		OOXXOOXXOO
		OXOXOXOXOXOXOX
		OOOOOOOOOO
		OOOOXOOOOXOOOOX
		10
		9
		7
		55
		30
		*/
		
		
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0; // ´©Àû
			int sum = 0; // ÇÕ
			
			for (int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		
	}
}
