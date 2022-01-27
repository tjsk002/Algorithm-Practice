package Programers;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {
	public static boolean isHappy(int n) {
		final Set<Integer> visit = new HashSet<>();

		do {
			visit.add(n);
			int next = 0;
			while (n > 0) {
				int mod = n%10;
				next += mod * mod;
				n /= 10;
			}
			n = next;
		} while(n != 1 && !visit.contains(n));
		
		return n == 1;
	}
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
