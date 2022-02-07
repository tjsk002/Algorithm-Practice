package Programers;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		//Comparator ex
		
		//17살 2반 & 18살 1번
		Student a = new Student(17, 2);
		Student b = new Student(18, 1);
		Student c = new Student(19, 2);
		
		/*
		 * Comparable은 "자기 자신과 매개변수 객체를 비교"하는 것이고, 
		 * Comparator는 "두 매개변수 객체를 비교"한다는 것
		 */

		// b랑 c만 비교한다
		int isBig = a.compare(b, c);
		
		if(isBig > 0) {
			// 0보다 클 때
			System.out.println("b가 더 크다");
		}else if(isBig == 0) {
			System.out.println("같다");
		}else {
			System.out.println("c가 더 크다");
		}
	}

}
class Student implements Comparator<Student>{
	int age; //나이
	int classNum; //반 
		
	Student(int age, int classNum){
		this.age = age;
		this.classNum = classNum;
	}
	
	
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.age > o2.age) {
//			return 1;
//		}else if(o1.age == o2.age) {
//			return 0;
//		}else {
//			return -1;
//		}
//	}
	
	public int compare(Student o1, Student o2) {
		return o1.classNum - o2.classNum;
	}
	
}
