package ch09;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1234, "LEE");
		studentLee.setmathSubject("국어", 80);
		studentLee.setKoreaSubject("수학", 70);
		studentLee.totalScore();
		
		Student studentKim = new Student(1235, "KIM");
		studentKim.setmathSubject("국어", 90);
		studentKim.setKoreaSubject("수학", 40);
		studentKim.totalScore();
	}

}
