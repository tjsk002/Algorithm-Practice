package Scanner;
import java.util.Scanner;

public class ASCIIcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int result = (int)ch;
		System.out.println(result);
	}
}
