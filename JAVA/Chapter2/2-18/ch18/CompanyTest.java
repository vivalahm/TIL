package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		//참조변수를 통해 인스턴스를 만들지 않고 static 메서드를 통해 인스턴스를 반환 받아 사용한다. 
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		//참조 변수의 주소값을 살펴보면 따로 생성자를 생성한것이 아니므로 주소값이 같은것을 알수 있다.
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
	}

}
