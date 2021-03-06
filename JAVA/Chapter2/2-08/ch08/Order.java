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
		System.out.println("�ֹ� ���� ��ȣ: " + orderID + "\n�ֹ� �ڵ��� ��ȣ: " + phoneNumber + "\n�ֹ� �� �ּ�: " + orderAddress + "\n�ֹ� ��¥: " + orderDate + "\n�ֹ� �ð�: " + orderTime + "\n�ֹ� ����: " + orderPrice + "\n�޴� ��ȣ: " + orderMenuNumber);
		
	}

}
