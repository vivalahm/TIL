package ch09;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student (int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	
	public void setmathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}
	
	public void totalScore() {
		int total = korea.score + math.score;
		System.out.println( studentName +"ÇÐ»ýÀÇ ÃÑÃ·Àº " + total + "ÀÔ´Ï´Ù.");
	}
	

}
