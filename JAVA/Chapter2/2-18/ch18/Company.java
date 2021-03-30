package ch18;

public class Company {
	//유일한 인스턴스는 내부에서 만듬
	//private 타입으로 클래스 변수를 통해 인스턴스 생성
	private static Company instance = new Company();

	private Company() {} // 생성자를 안넣어주면  디폴트로 Public 생성자를 생성한다. 
	//그것을 방지하고자 컴퍼니 기본생성자를 private로 선언한다.
	//외부에서 Company를 마음대로 new하지 못하도록 막음
	
	
	//일반 메서드는 불러오는 곳에서 인스턴스를 생성하고 호출하는 것이므로
	//이 메서드는 Static 메서드 즉 클래스 메서드로 선언하고 유일한 인스턴스 값을 반환한다.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
	
}
