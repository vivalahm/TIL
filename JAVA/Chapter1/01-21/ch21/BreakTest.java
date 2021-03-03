package ch21;

public class BreakTest {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		for(num=1; ; num++) {
			sum += num;
			if(sum>=100) break;
		}
		System.out.println("100을 넘어가는 값: "+sum);
		System.out.println("총 "+num+"번째");

	}

}
