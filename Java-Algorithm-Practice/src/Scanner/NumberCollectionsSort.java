package Scanner;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NumberCollectionsSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> num = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			num.add(sc.nextInt());
		}
		Collections.sort(num);

		for (int result : num) {
			System.out.println(result);
		}
	}
}
