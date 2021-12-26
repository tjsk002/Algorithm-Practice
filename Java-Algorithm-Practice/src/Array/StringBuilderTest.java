package Array;

import java.util.Scanner;

public class StringBuilderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		sb.append("hello");
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}
