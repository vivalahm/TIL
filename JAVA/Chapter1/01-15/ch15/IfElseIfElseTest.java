package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("��, ����л� �Դϴ�.");
		}else{
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		System.out.println("������ "+ charge + "���Դϴ�.");

	}

}
