package ch18;

public class Company {
	//������ �ν��Ͻ��� ���ο��� ����
	//private Ÿ������ Ŭ���� ������ ���� �ν��Ͻ� ����
	private static Company instance = new Company();

	private Company() {} // �����ڸ� �ȳ־��ָ�  ����Ʈ�� Public �����ڸ� �����Ѵ�. 
	//�װ��� �����ϰ��� ���۴� �⺻�����ڸ� private�� �����Ѵ�.
	//�ܺο��� Company�� ������� new���� ���ϵ��� ����
	
	
	//�Ϲ� �޼���� �ҷ����� ������ �ν��Ͻ��� �����ϰ� ȣ���ϴ� ���̹Ƿ�
	//�� �޼���� Static �޼��� �� Ŭ���� �޼���� �����ϰ� ������ �ν��Ͻ� ���� ��ȯ�Ѵ�.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
	
}
