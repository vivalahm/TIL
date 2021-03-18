package ch15;

public class Person {
	
	private String name;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		if(money >10000) {
			money -= 10000;
			taxi.take(10000);
		}
		else {
			System.out.println("��������");
			
		}
		
	}
	
	public void showInfo() {
		System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	
	
	

}
