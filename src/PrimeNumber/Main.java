package PrimeNumber;

public class Main {
	public static void main(String[] args) {
		/*
		 * 입력된 수가 소수인지 판별하시오 13 정답: 13 반복문 for while if
		 */

		int num = 20;
		// 소수 1, 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 소수가아님
		// 소수 = 1과 자시자신만 나누어 떨어지는 경우
		boolean isPrimeNumber = true;
		
		
		//for(int i=2; i <= num/2; i++) = 같음
		for(int i=2; i<=num-1; i++) {
			if(num % i ==0) {
				//나누어떨어지면 primeNumber가 아님
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + "은 소수 입니다.");
		}else {
			System.out.println(num+"은 소수가 아닙니다.");
		}
	}
}
