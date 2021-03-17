package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1);// 다른  생성자를 호출하는 this
		name="Lee";
	}
	
	public Person(String name, int age) {
		this.name = name;//자신의 인스턴스 주소를 나타내는 This
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
