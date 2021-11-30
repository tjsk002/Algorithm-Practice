package Equals;

public class Main {
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		
		System.out.println(a==b); // 100 == 100
		System.out.println(a==c); // 100 != 101
		System.out.println(a.equals(c)); 
		// 주소값을 타고 간 실제값 비교 100 != 101 이지만 hello == hello
	
	}
}
