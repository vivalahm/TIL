package ch08;

public class PersonInfo {
	
	public int height;
	public int weight;
	public String sex;
	public String name;
	public int age;

	
	public PersonInfo() {}
	
	public PersonInfo(int height, int weight, String sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("Ű�� "+ height + "�̰� �����԰� " + weight + "ų���� " + sex + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
	}

}
