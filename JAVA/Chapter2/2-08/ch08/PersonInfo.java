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
		System.out.println("키가 "+ height + "이고 몸무게가 " + weight + "킬로인 " + sex + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}

}
