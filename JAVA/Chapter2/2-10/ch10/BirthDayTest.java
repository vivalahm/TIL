package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2021);
		day.setMonth(03);
		day.setDay(17);
		//day.Month = 100; ���� ��������� public �̶�� �̷��� �̷��� ����� ������ �߻� ��ų�� �ִ�.
		//���� ��������� private�� �ΰ� �޼��带 Ȱ���ؼ� ���ǿ� ���� ������ �Է����� ����� ������ �����Ѵ�.
		day.showDate();

	}

}
