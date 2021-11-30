package Solution;

public class plus {
	public static void main(String[] args) {
		int num = 0;
		int i;
		int j;
		
		for(i=1; i<=3; i++) {
			System.out.println("---i : " + i);
			for(j=1; j<=5; j++) {
				System.out.println("j : " + j);
				num = i*j;
			}
		}
		System.out.println("*******num : " + num);
		
	}
}
