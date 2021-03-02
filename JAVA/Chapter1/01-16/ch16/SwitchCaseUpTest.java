package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		System.out.print("���� �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch (month) {
    	case 1, 3, 5, 7, 8, 10,12 -> {
    		System.out.println("�� ���� 31���Դϴ�."); 
    		yield 31;
    	}
    	case 4,6,9,11 -> {
    		System.out.println("�� ���� 30���Դϴ�."); 
    		yield 30;
    	}
    	case 2 ->{
    		System.out.println("�� ���� 28���Դϴ�.");
    		yield 28;
    	}
    	default->{
    		System.out.println("�������� �ʴ� �� �Դϴ�."); 
    		yield 0;
    	}
	};//int day�� ������ ���� �ǹ���.
	System.out.println(month + "���� " + day + "���Դϴ�.");
	}

}
