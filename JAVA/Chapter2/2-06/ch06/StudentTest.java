package ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentA= new Student();// �⺻�����ڸ� ���� �ν��Ͻ� ����
		Student studentB = new Student(12345, "HM", 3);//�����ڸ� ����� �⺻������ ����X
		//���� �⺻�����ڸ� ���ÿ� ���� ������ �⺻ �����ڸ� Ŭ������ ���� ������
		
		
		studentA.showStudentInfo();
		studentB.showStudentInfo();
	}

}
