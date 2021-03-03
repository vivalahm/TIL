package ch19;

public class ForTest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i<10; i++, count++) {//문장이 하나 이상 들어갈 수 있다. 초기화 식도 여러개 쓸수 있다.
			sum+=count;
			//count ++
		}
		
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while(num<=10) {
			total+=num;
			num++;
			
		}
		System.out.println(total);

	}

}
