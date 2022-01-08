형 변환과 메모리


Customer vc = new VIPCustomer(); 에서 vc가 가리키는 것은?


VIPCustomer() 생성자에 의해 VIPCustomer 클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만, 
변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임

![image](https://user-images.githubusercontent.com/48741014/148633350-bce4c43f-c5b3-4fb4-9b32-b1488d419878.png)

![image2](https://user-images.githubusercontent.com/48741014/148633362-7e5cd099-1c35-46df-aed0-8fbcdd648036.png)

형 변환과 오버라이딩 메서드 호출

vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임

자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상메서드의 원리)
자바의 모든 메서드는 가상 메서드(virtual method) 임

* 다형성을 위해 상위클래스 타입으로 하위클래스의 인스턴스들을 생성해서 상위클래스의 메서드를 오버라이딩하여 하나의 메서드를 상위클래스 타입으로 통합하여 처리해 줄 수 있다.
* 위처럼 상위클래스 변수에 하위클래스 인스턴스를 생성한 경우에 상위클래스의 멤버변수와 메서드만을 사용가능하므로 하위클래스에 새롭게 정의한 맴버변수나 메서드는 다시 다운캐스팅을 해야한다.
