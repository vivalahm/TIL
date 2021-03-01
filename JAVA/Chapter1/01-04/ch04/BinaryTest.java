package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int bNum = 0B1010; //0B는 Binary 2진수이다. 
		int oNum = 012; //0은 8진수이다. 
		int xNum = 0XA; //0X은 16진수이다.
		//b와 x는 소문자로 써도됨
		
		System.out.println("10진수:"+num);
		System.out.println("2진수:"+bNum);
		System.out.println("8진수:"+oNum);
		System.out.println("16진수:"+xNum);

	}

}
