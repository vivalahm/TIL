package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		char chB=66;//���ڷ� �Է��ص� �ڵ����� ���ڵ���
		System.out.println(chB); //���ڵ��� B���� ���
		System.out.println((int)chB);//���ڷ� �ٽ� ���ڵ�
		
		//char chMB=-66; ������ ���� �� �� ����.
		
		int chC= 67;
		System.out.println(chC);
		System.out.println((char)chC);
		
		char chS= '6';
		System.out.println(chS);
		System.out.println((int)chS);
		
		char chH='��';
		System.out.println(chH);
		System.out.println((int)chH);
		
		char chU='\uD55C';
		System.out.println(chU);

	}

}
