package Array;

public class SelfNumberOther {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			if (n < 10001) {
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if (check[i] == false) {
//				System.out.println(i);
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	public static int d(int n) {
		int cnt = n;
		while (n != 0) {
			cnt = cnt + (n % 10);
			n /= 10;
		}
		return cnt;
	}
}
