package ch08;

import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("주문 접수 번호를 입력하세요:");
		long orderID = scanner.nextLong(); 
		System.out.println("주문 핸드폰 번호를 입력하세요:");
		String phoneNumber = scanner.next();
		System.out.println("주문 집 주소를 입력하세요:");
		String orderAddress = scanner.next();
		System.out.println("주문 날짜를 입력하세요:");
		String orderDate = scanner.next();
		System.out.println("주문 시간를 입력하세요:");
		String orderTime = scanner.next();
		System.out.println("주문 가격를 입력하세요:");
		String orderPrice = scanner.next();
		System.out.println("메뉴 번호를 입력하세요:");
		String orderMenuNumber = scanner.next();
	
		
		Order firstOrder = new Order(orderID, phoneNumber, orderAddress, orderDate, orderTime, orderPrice, orderMenuNumber);
		
		firstOrder.showOrder();

	}

}
