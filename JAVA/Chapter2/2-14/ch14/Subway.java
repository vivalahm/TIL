package ch14;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {

		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "라인 지하철의 승객 수는" + passengerCount + "명이고 수입은" + money + "원 입니다.");
	}
}
