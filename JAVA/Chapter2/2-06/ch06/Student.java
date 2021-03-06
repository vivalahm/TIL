package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} // 기본생성자 
	
	public Student(int studentNumber, String studentName, int grade) {//생성자 생성 생성자 오버로딩
		this.studentNumber = studentNumber;//this는 해당클래스의 맴버변수에 접근할때 사용하고 그냥 변수명은 매게변수를 뜻함
		this.studentName = studentName;
		this.grade = grade;
		//변수 이름이 다를 경우 this를 사용하지 않아도 됨 하지만, 변수이름을 같게 하는 이유는
		//같게 하는게 찾기 쉽고 가독성도 높일수 있다.
		
		System.out.println("새로운 학생 생성됨");
	}
	
	public void showStudentInfo() {
		
		
	System.out.println( studentName + " 학생의 학번은 \'" + studentNumber + "\' 이고, " +  grade + "학년입니다.");
		
	}

}
