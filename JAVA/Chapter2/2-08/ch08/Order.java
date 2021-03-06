package ch08;

public class Order {
	public long orderID;
	public String phoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String orderMenuNumber;
	
	public Order() {}
	
	public Order(long orderId, String phoneNumber, String orderAddress, String orderDate, String orderTime, String orderPrice, String orderMenuNumber) {
		this.orderID = orderId;
		this.phoneNumber = phoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenuNumber = orderMenuNumber; 
	}
	
	public void showOrder() {
		System.out.println("주문 접수 번호: " + orderID + "\n주문 핸드폰 번호: " + phoneNumber + "\n주문 집 주소: " + orderAddress + "\n주문 날짜: " + orderDate + "\n주문 시간: " + orderTime + "\n주문 가격: " + orderPrice + "\n메뉴 번호: " + orderMenuNumber);
		
	}

}
