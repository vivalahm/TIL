package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("�̸� ����", 1);// �ٸ�  �����ڸ� ȣ���ϴ� this
		name="Lee";
	}
	
	public Person(String name, int age) {
		this.name = name;//�ڽ��� �ν��Ͻ� �ּҸ� ��Ÿ���� This
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		System.out.println(person);
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
