package ch17;

public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum=0;
		
		while ( num <= 10){
			sum += num;
			num++;
			
		}
		if(sum != 0) {
			System.out.println("���� "+sum+" �Դϴ�.");
			System.out.println("�� "+ num +" ����.");
		}
	}

}
