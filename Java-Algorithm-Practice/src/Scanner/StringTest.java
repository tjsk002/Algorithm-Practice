package Scanner;


public class StringTest {
	public static void main(String[] args) {
		Student stu = new Student("김애플", "여자", 26);
		System.out.println(stu);
	}
}

 class Student {
	private String name; // 이름
	private String gender; // 성별
	private Integer age; //나이
	
	public Student(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + " 성별은 " + gender + " 나이는 " + age + "입니다.";
	}
}

