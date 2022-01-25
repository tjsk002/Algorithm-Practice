package JavaTest;

public class Main {
	public static void main(String[] args) {
		int[][] a = new int[2][4];
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 4; j++) {
				a[i][j] = i + j;
				System.out.printf("%d", a[i][j]);
			}
			System.out.println("test");
		}
	}
	
}
