package Scanner;
import java.util.Scanner;

public class WordStudy2 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = 1;
		while (t-- > 0) {
			solve();
		}
	}

	private static void solve() {
		final int ALPHABET_LENGTH = 26;
		String string = scanner.next().toUpperCase();
		int[] arr = new int[ALPHABET_LENGTH];
		for (int i = 0; i < string.length(); ++i) {
			++arr[string.charAt(i) - 'A'];
		}
		int max = 0;
		char maxChar = '?';
		for (int i = 0; i < ALPHABET_LENGTH; ++i) {
			if (arr[i] > max) {
				max = arr[i];
				maxChar = (char) ('A' + i);
			} else if (arr[i] == max) {
				maxChar = '?';
			}
		}
		System.out.println(maxChar);
	}
}
