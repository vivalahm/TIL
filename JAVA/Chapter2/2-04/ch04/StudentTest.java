package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); // {������ Ÿ��} {���� �̸�} = {������}
		//�� �л� �ϳ��� �����ض�� �ǹ�
		//�̷��� �����Ǵ� ��ü�� �츮�� �ν��Ͻ���� �θ���.
		//Ŭ������ ������ Ŭ������ ������� �������� �ν��Ͻ��� �����ȴ�.
		studentLee.studentID = 12345;
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		// �л� �Ѹ��� �ν��Ͻ�(��ü)�� ����
		
		studentLee.showStudentInfo();
		
		studentLee.setStudentName("��");
		System.out.println(studentLee.getStudentName());
		
		Student studentChoi = new Student();
		
		studentChoi.studentName = "��ġ��";
		studentChoi.studentID = 12346;
		studentChoi.address = "�λ�";
		
		studentChoi.showStudentInfo();

	}

}
