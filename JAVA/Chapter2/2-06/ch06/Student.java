package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} // �⺻������ 
	
	public Student(int studentNumber, String studentName, int grade) {//������ ���� ������ �����ε�
		this.studentNumber = studentNumber;//this�� �ش�Ŭ������ �ɹ������� �����Ҷ� ����ϰ� �׳� �������� �ŰԺ����� ����
		this.studentName = studentName;
		this.grade = grade;
		//���� �̸��� �ٸ� ��� this�� ������� �ʾƵ� �� ������, �����̸��� ���� �ϴ� ������
		//���� �ϴ°� ã�� ���� �������� ���ϼ� �ִ�.
		
		System.out.println("���ο� �л� ������");
	}
	
	public void showStudentInfo() {
		
		
	System.out.println( studentName + " �л��� �й��� \'" + studentNumber + "\' �̰�, " +  grade + "�г��Դϴ�.");
		
	}

}
