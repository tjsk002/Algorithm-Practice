package Scanner;

import java.util.Scanner;

public class SumCycle {
	public static void main(String[] args) {
		// 더하기 사이클 beck joon Q
		Scanner sc = new Scanner(System.in);
		int originNum= sc.nextInt(); //주어진 수
//		int NewNum = sc.nextInt(); //새로운 수
		
		int NewNum = ((originNum%10)*10)+((originNum/10)+(originNum%10)%10);
		System.out.println(NewNum);
		
		System.out.println("test");
		System.out.println("test");
	}
}
