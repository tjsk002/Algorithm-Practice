package Scanner;
import java.util.Scanner;
import java.math.BigInteger;
public class BigIntegerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		BigInteger num3 = sc.nextBigInteger();
		java.math.BigInteger num1 = sc.nextBigInteger();
		java.math.BigInteger num2 = sc.nextBigInteger();
		
		System.out.println(num1.add(num2));
		
	}
}
