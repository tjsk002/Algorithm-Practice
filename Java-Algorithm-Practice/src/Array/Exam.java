package Array;

public class Exam {

	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0, n = 10;

		while (i <= 7) {
			a[i++] = n % 2;
			// 계산하고 그 값을 a[0]에 넣어준다
			// 그리고 i가 증감이 된다
			//System.out.println("a= " + a[i] + ", i= " + i + ", n= " + n);
			// System.out.println("a= " + a[i++]);
			n /= 2;
			//System.out.println("---"+"a= " + a[i] + ", i= " + i + ", n= " + n);
			//System.out.print(a[i-1]);
			System.out.print(i+"모르겠네");
			
		}
		System.out.println();
		
		for (i = 7; i >= 0; i--) {
			System.out.printf("%d", a[i]);
			//System.out.println(a[i]);
		}

	}

}
