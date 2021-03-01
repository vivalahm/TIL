package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX_NUM =100;
		final int MIN_NUM;
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		//MIN_NUM = 200; 상수라 초기화 되면 변경 불가.
		System.out.println(MIN_NUM);

	}

}
