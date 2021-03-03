# 04. 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다

## 학생 클래스를 정의 하고 이를 사용해 보자

- 학생 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현한다

```java
public class Student {
	
	public int studentID;
	public String studentName;  
	public String address;
			
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
```

- 학생 클래스를 사용하기 위한 메인함수가 포함된 테스트 클래스를 생성한다.

- 학생 클래스를 생성하여 생성된 객체(인스턴스)에 각각 다른 이름과 주소를 대입한다

- 클래스 변수(참조 변수)는 생성된 곳의 메모리 위치를 나타냄

  

```java
public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //studentLee를 참조 변수라고도 부름
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
```

- 학생 클래스가 있으면  학생 클래스를 기반으로 여러 개의 인스턴스가 생성된다.
- 인스턴스가 생성후 인스턴스의 메소드와 멤버 변수를 활용해 값을 세팅한다.


## 다음 강의
[05. 인스턴스 생성과 힙 메모리](https://gitlab.com/easyspubjava/javacoursework/-/blob/master/Chapter2/2-05/README.md)
