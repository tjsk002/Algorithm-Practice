package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws IOException{
		/*
		 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다.
		세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
		일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
		그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 
		수학점수는 50/70*100이 되어 71.43점이 된다.
		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double arr[] = new double[Integer.parseInt(br.readLine())]; // 자리 3개 만들어줌
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0; // 덧셈 누적
		Arrays.sort(arr);
		
		// (40/80)*100 + (80/80)*100 + (60/80)*100 
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i]/arr[arr.length-1])*100;
		}
		System.out.println(sum/arr.length);
	}
}
