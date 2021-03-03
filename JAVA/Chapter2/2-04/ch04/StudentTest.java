package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); // {데이터 타입} {변수 이름} = {생성자}
		//즉 학생 하나를 생성해라는 의미
		//이렇게 생성되는 객체를 우리는 인스턴스라고 부른다.
		//클래스가 있으면 클래스를 기반으로 여러개의 인스턴스가 생성된다.
		studentLee.studentID = 12345;
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		// 학생 한명의 인스턴스(객체)를 생성
		
		studentLee.showStudentInfo();
		
		studentLee.setStudentName("리");
		System.out.println(studentLee.getStudentName());
		
		Student studentChoi = new Student();
		
		studentChoi.studentName = "최치원";
		studentChoi.studentID = 12346;
		studentChoi.address = "부산";
		
		studentChoi.showStudentInfo();

	}

}
