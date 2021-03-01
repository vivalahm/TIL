package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dnum = 1;
		float fnum=3.14f;// 3.14는 기본으로 더블형 리터벌
		//float형임을 나타낸는 F를 리터럴에 넣어줘야함.

		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//부동 소수점 방식의 오류
		
		//지수와 가수로 나타내는 부동 소수점 방식에서
		//지수부가 0을 표현할 수 없기 때문에 약간의 오차 발생\
		for(int i = 0; i<10000 ; i++) {
			dnum =dnum + 0.1;
		}
		
		System.out.println(dnum);
		
	}

}
