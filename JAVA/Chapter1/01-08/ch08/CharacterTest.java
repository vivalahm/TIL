package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		char chB=66;//숫자로 입력해도 자동으로 디코딩됨
		System.out.println(chB); //디코딩된 B변수 출력
		System.out.println((int)chB);//숫자로 다시 인코딩
		
		//char chMB=-66; 음수는 대입 할 수 없다.
		
		int chC= 67;
		System.out.println(chC);
		System.out.println((char)chC);
		
		char chS= '6';
		System.out.println(chS);
		System.out.println((int)chS);
		
		char chH='현';
		System.out.println(chH);
		System.out.println((int)chH);
		
		char chU='\uD55C';
		System.out.println(chU);

	}

}
