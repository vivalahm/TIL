package ch10;

public class TypeConsversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(�ڵ�)������ �� ��ȯ
		
		byte bnum = 10;
		int iNum =bnum;
		
		int iNumA=20;
		float fnum = iNumA;
		
		System.out.println(iNum);
		System.out.println(fnum);
		
		//����� �� ��ȯ
		
		int iNumR=255;
		byte bNumR=(byte)iNumR;
		
		System.out.println(bNumR);
		
		float fNumR =1.2f;
		int iNumFR=(int) fNumR;
		
		System.out.println(iNumFR);
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
	
		

	}

}
