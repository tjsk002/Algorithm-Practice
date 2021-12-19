import java.util.Scanner;
class AvgOverTest{
    public static void main(String[] args){
        /*
		 5 5 50 50 70 80 100 
         7 100 95 90 80 70 60 50 
         3 70 90 80 
         3 70 90 81 
         9 100 99 98 97 96 95 94 93 91
		 * 40.000% 57.143% 33.333% 66.667% 55.556%
		 */
        Scanner sc = new Scanner(System.in);
        int firstN = sc.nextInt(); // 첫번째 입력하는 값 숫자
        int arr[];
        
        for(int i=0; i<firstN; i++){
            int n = sc.nextInt(); // 학생 수
            arr = new int[n];
            double sum = 0; // 학생 점수 합계
            
            for(int j=0; j<arr.length; j++){
                int studentAvg = sc.nextInt(); // 학생성적 입력
                arr[j] = studentAvg;
                sum += arr[j]; // 350
            }
            
            double avg = sum/n; // 350/5 -> 70.0
            double cnt = 0; // 평균 점수 넘는 인원 수
            
            for(int j=0; j<n; j++){
                if(arr[j] > avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (cnt/n)*100);
        }
        sc.close();
    }
}