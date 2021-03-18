import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		
		//이름, 학번
		Student stu1 = new Student("김애플", "20131841");
		Student stu2 = new Student("반하나", "20131842");
		Student stu3 = new Student("오렌지", "20131843");
		
		//arraylist 저장
		ArrayList<Student> list = new ArrayList<Student>();
		
		//추가
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		//for each문
		for(Student stu : list) {
			//첫번째 참조변수... 반복할때마다 1,2,3
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----계속 검색을 하고싶으시다면y, 종료하고싶으시면 n----");
			String result = sc.next();
			if(result.equals("y")) {
				System.out.println("학생이름을 입력해주세요");
				boolean flag = false;
				//초기화
				
				//학생의 이름이 있는경우
				String name = sc.next();
				for(Student stu : list) {
					//이름이 있다면 
					if(stu.getName().equals(name)) {
						System.out.println(stu.getName()+ "학생의 학번은: "+stu.getNo());
						flag= true;
						//이름이 있다면 출력
					}
				} 
				//flag가 false
				if(!flag) {
					System.out.println("없는 학생입니다");
				}
				
			}else if(result.equals("n")) {
				System.out.println("종료되었습니다");
				break;
			}else {
				System.out.println("잘못눌렀습니다. 다시 입력해주세요");
				String result2 = sc.next();
			}
			
		}
		
		
		
	}
}
