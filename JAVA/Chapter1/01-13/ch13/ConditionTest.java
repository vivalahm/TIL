package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요.\n");
		
		Scanner scanner = new Scanner(System.in);//System.in은 표준입력(콘솔)에서 입력받음
		System.out.print("입력1: ");
		int x = scanner.nextInt();
		System.out.print("입력2: ");
		int y = scanner.nextInt();
		
		max = (x > y)? x : y;// 참이면 앞에항이 거짓이면 두번째 항 입력
		
		System.out.println("큰 수:" + max);
		
		

	}

}
