package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dnum = 1;
		float fnum=3.14f;// 3.14�� �⺻���� ������ ���͹�
		//float������ ��Ÿ���� F�� ���ͷ��� �־������.

		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//�ε� �Ҽ��� ����� ����
		
		//������ ������ ��Ÿ���� �ε� �Ҽ��� ��Ŀ���
		//�����ΰ� 0�� ǥ���� �� ���� ������ �ణ�� ���� �߻�\
		for(int i = 0; i<10000 ; i++) {
			dnum =dnum + 0.1;
		}
		
		System.out.println(dnum);
		
	}

}
