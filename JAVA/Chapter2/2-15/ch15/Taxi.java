package ch15;

public class Taxi {
	private String taxiName;
	private int money;
	
	public String getTaxiName() {
		return taxiName;
	}
	public void setTaxiName(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(taxiName + "택시 수입은 " + money + "원 입니다.");
	}
	

}
