# Spring Framework - FrameWork, IoC,DI

Frame(틀or뼈대)Work(일하다)는 말그대로 틀안에서 일하는 것을 말한다.

즉, 프레임워크는 소프트웨어를 개발하기위한 뼈대 역활을 한다.

프레임워크의 특징은 상호협력하는 클래스와 인터페이스의 집합으로 응용 프르그램이 수동적으로 프레임워크에 의해 사용된다.

Spring framework는 자바 엔터프라이즈 에디션에서 비즈니스 로직에만 집중할 수 있도록 객체생성 및 관리등 부수적인 역활을 대신해준다.

지금까지 프로그래머는 Class라는 설계도를 통해 Object를 생성해왔다. 

object는 일반적으로 실체화되는것을 말한다.

이러한 Object를 생성하여 instance를 만든다.

만약 우리가 각각의 다른 두개의 함수에서 A라는 이름의 동일한 참조변수를 통해 인스턴스를 생성한다 가정하면

힙영역에는 하나의 인스턴스가아닌 두개의 인스턴스가 생성된다. 즉, 같은 이름을 가진 참조 변수A가 두개가 각각의 인스턴스를 가지는 것이다. 이 경우 우리는 인스턴스가 함수에 의존했다고 볼 수 있다.

이러한 문제를 해결하기위해 스프링의 제어의 역전 (Inversion of Control)이란 개념을 사용한다.

스프링 프레임워크가 객체를 관리하는 것으로 @Component 어노테이션을 통해 클래스를 스캔해 IOC컨테이너가 객체를 생성하고 관리 할수 있다.

```Java
@Component 
public class TestBean{ }
```





그러면 스프링은 IOC Container가 기존의 의존성을 관리해준다. 

힙에 생성된 인스턴스를 각 필요한 영역에 주입하는 걸 DI(Dependency Injection)의존성 주입이 한다.

이때 @Component로 등록된 빈을 자동 주입하기 위해 @AutoWired 어노테이션을 사용한다.

```Java
@Component
public class TestBean {
	
	@Autowired
	private DataBean data;
}

@Component
public class DataBean { }
```

@Autowired는 같은 타입의 빈을 자동 주입하며 필드에 붙이면 해당 필드의 setter가 자동으로 생성된다.



![img](https://blog.kakaocdn.net/dn/rxwfP/btrveMcW60y/YeV2cPRQZ1KuNq4GHeJA10/img.jpg)