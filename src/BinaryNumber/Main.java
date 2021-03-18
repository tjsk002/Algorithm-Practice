package BinaryNumber;

public class Main {
	public static void main(String[] args) {
		/*
		 * 10진수를 2진수로 변환
		 * 19 -> 10011
		 * 
		 * 배열 반복문 while for
		 * */
		
		int inputNum = 19;
		int bin[] = new int[100];
		
		/* 
		 * 19/2  9...1
		 *  9/2  4...1
		 *  4/2  2...0
		 *  2/2  1...0
		 *  1/2  0...1
		 *  
		 *  010011 -> 19
		 */
		
		int i = 0;
		//나머지 몫을 저장, i -> index 라고 생각하면 됨
		int mok = inputNum;
		
		//반복하는거니까 반복문
		while(mok > 0) {
			//index에 1이 들어가게 된다(처음값)
			//나머지만 저장되는 것 = 2진수
			bin[i] = mok%2;
			mok /= 2;
			
			i++;
			
		}
		System.out.print("--" + bin[i]);
		i--;
		System.out.print(" 2진수 변환 후 : ");
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
	}
}
	