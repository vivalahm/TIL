package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		System.out.println("�Է� ���� �� ���� ū ���� ����ϼ���.\n");
		
		Scanner scanner = new Scanner(System.in);//System.in�� ǥ���Է�(�ܼ�)���� �Է¹���
		System.out.print("�Է�1: ");
		int x = scanner.nextInt();
		System.out.print("�Է�2: ");
		int y = scanner.nextInt();
		
		max = (x > y)? x : y;// ���̸� �տ����� �����̸� �ι�° �� �Է�
		
		System.out.println("ū ��:" + max);
		
		

	}

}
