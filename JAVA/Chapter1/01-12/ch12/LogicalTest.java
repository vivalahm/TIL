package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ( (i = i+2) < 10 );
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//�ܶ� ȸ�� �򰡿� ���� && ���� ������ ���� X �׷��� i���� �״����

		 int num2 = 10; 
		 int i2 = 2;
		 
		 boolean value2 = ((num2 += 10) > 10) || ( (i2 = i2+2) < 10 );
			
			System.out.println(value2);
			System.out.println(num1);
			System.out.println(i);
	}

}
