package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2021);
		day.setMonth(03);
		day.setDay(17);
		//day.Month = 100; 만약 멤버변수가 public 이라면 이렇게 이렇게 사용의 오용을 발생 시킬수 있다.
		//따라서 멤버변수를 private로 두고 메서드를 활용해서 조건에 따른 변수값 입력으로 사용의 오용을 방지한다.
		day.showDate();

	}

}
