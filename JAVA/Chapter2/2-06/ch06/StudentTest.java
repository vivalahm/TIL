package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentA= new Student();// 기본생성자를 통해 인스턴스 생성
		Student studentB = new Student(12345, "HM", 3);//생성자를 만들면 기본생성자 제공X
		//만약 기본생성자를 동시에 쓰고 싶으면 기본 생성자를 클래스에 따로 만들면됨
		
		
		studentA.showStudentInfo();
		studentB.showStudentInfo();
	}

}
