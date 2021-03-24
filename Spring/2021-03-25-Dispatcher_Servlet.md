# Dispatcher-Servlet(디스패쳐 서블릿) 이란?

## 1. Dispatcher-Servlet의 개념

- Dispatcher-Servlet에서 dispatch는 보내다라는 사전적 뜻을 가지고 있다

- Servlet Container에서 HTTP 프로토콜을 통해 들어오는 모든 요청을 프레젠테이션 계층의 제일 앞에 둬서 중앙 집중식으로 처리해주는 프론트 컨트롤러(Front Controller)

- **설명**

  클라이언트로 부터 어떠한 요청이 오면 Tomcat(톰캣)과 같은 서블릿 컨테이너가 요청을 받는데, 이때 제일 앞에서 서버로 들어오는 모든 요청을 처리하는 *프론트 컨트롤러를 Spring에서 정의하였고, 이를 Dispatcher-Servlet이라고 한다. 그래서 공통처리 작업을 Dispatcher 서블릿이 처리한 후, 적절한 세부 컨트롤러로 작업을 위임해준다.
  
  물론 Dispatcher-Servlet이 처리하는 URL 패턴을 지정해주어야 하는데 일반적으로 /*.do와 같이 /로 시작하며.do로 끝나는 URL패턴에 대해서 처리하라고 지정해준다.

### Front Controller(프론트 컨트롤러)란?

- Front Controller는 주로 서블릿 컨테이너의 제일 앞에서 서버로 들어오는 클라이언트의 모든 요청을 받아서 처리해주는 컨트롤러인데, MVC 구조에서 함께 사용되는 패턴이다.

## 2. Dispatcher-Servlet의 장점

- Spring MVC는 Dispatcher Servlet이 등장함에 따라 web.xml의 역활을 상당히 축소시켜주었다. 기존에는  모든 서블렛에 대해 URL 매핑을 활용하기 위해서 web.xml에 모두 등록해주어야 했지만, Dispatcher Servlet이 해당 어플리케이션으로 들어오는 모든 요청을 핸들링해주면서 작업을 상당히 편리하게 할 수 있게 되었다. 그리고 이 서블릿을 이용한다면 @MVC 역시 사용할 수 있게 되어 좋다. 결과적으로 Dispatcher Servlet의 기능 처리를 아래의 그림과 같다.

  

![img](https://user-images.githubusercontent.com/48741014/112344057-13b74f00-8d07-11eb-819f-210c81a91dc7.png)

- 물론 Dispatcher Servlet이 요청을 Controller로 넘겨주는 방식은 효율적으로 보인다. 하지만 모든 요청을 처리하다보니 이미지나 HTML 파일을 불러오는 요청마저 전부 Controller로 넘겨 버린다. 게다가 JSP파일 안의 JavaScript나 StyleCSS 파일들에 대한 요청들 까지도 모두 디스패처 서블릿이 가로채는 까닭에 자원을 불러오지 못하는 상황도 발생하곤 했다. 이에 대한 해결책은 두가지가 있다. 

- 첫번째는 클라이언트 요청을 2가지로 분리하여 구분하는 것

  1. /apps의 URL로 접근하면 Dispatcher Servlet이 담당한다.
  2. /resources의 URL로 접근하면 Dispatcher Servlet이 컨트롤 할 수 없으므로 담당하지 않는다.

  이러한 방식은 괜찮지만 상당히 코드가 지저분해지며, 모든 요청에 대해서 URL을 붙여주기 때문에 직관적인 설계가 될 수 없다. 

- 두번째 방법은 모든 요청을 컨트롤러에 등록하는 것인데, 상당히 무식한 방법이다.
  Spring은 이러한 문제들을 해결함과 동시에 편리한 방법을 제공해주는데, 그것은 바로 <mvc:resources />를 이용한 방법인데, 이것은 만약 Dispatcher Servlet에서 해당 요청에 대한 컨트롤러를 찾을 수 없는 경우에, 2차적으로 설정된 경로에서 요청을 탐색하여 자원을 찾아내는 것이다. 이렇게 영역을 분리하면 효율적인 리소스 관리를 지원할 뿐 아니라 추후에 확장을 용이하게 해준다는 장점이 있다.

