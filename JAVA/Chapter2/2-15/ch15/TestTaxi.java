package ch15;

public class TestTaxi {

	public static void main(String[] args) {
		
		Person Ed = new Person();
		Taxi t1 = new Taxi();
		
		Ed.setName("Edward");
		Ed.setMoney(20000);
		
		t1.setTaxiName("�� ������ ���");
		
		Ed.takeTaxi(t1);
		
		Ed.showInfo();
		
		t1.showInfo();

	}

}
