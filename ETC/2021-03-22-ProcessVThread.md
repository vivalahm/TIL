# 웹 프로세스(Process) 방식 VS 스레드(Thread) 방식



### 프로세스(Process)

- 사전적 의미: 컴퓨터에서 연속적으로 실행되고 있는 프로그램
- 부연 설명: 컴퓨터에 설치되어 있는 게임이나 문서작성프로그램 등 프로램이 메모리상에 시행 되는 작업
- 과거의 OS는 한번에 한가지 작업 밖에 수행 못했다.
- 최근의 OS들은 한번에 여러가지 작업을 할 수 있고 여러개의 프로세스를 동시에 실행하는 것을 멀티 태스킹이라함
- 멀티태스킹이 되는 대표적인 OS는 윈도우, 유닉스 , 그리고 리눅스
- 웹서버는 여러사람이 동시에 사용하는 것이니 당연히 멀티태스킹이 필요
- 프로세스는 메모리 영역을 독립적으로 할당받아 실행. 따라서 각 프로세스는 서로 영향을 미치지 않음
- Ex) 아파치 프로세스가 5개 실행되고 있는데 그중 1개가 문제가 생겨 중단된다고 해도 나머지 4개는 영향을 받지 않고 계속 실행된다.

### 스레드(Thread)

- 사전적 의미: 프로세스 내에서 실행되는 여러 흐름의 단위
- 스레드는 프로세스내에서 동작하는 여러 실행 흐름
- 프로세스는 기본적으로 1개의 스레드를 갖고 있고 1개 이상의 스레드를 가질 수 있으며, 이를 멀티스테드라고 한다.
- 스레드는 메모리에서 Stack만 따로 할당을 받고 나머지 부분을 메모리영역을 공유하므로 동시에 여러 작업을 하더라도 반응속도가 빠르고 메모리 사용이 적다
- 단점은 같은 프로세스내의 여러 스레드 중 1개가 문제가 생겼을 때 그 프로세스 내의 모든 스레드가 영향을 받는다.

## 웹서버

### Apache

- 아파치는 예전 부터 지금까지 가장많이 사용되고 있는 프로그램

- 아파치는 3가지 MPM(Multi-Processing Module)을 가짐 prefork, worker, event

- 1. Prefork mpm : 1개의 메인프로세스에 최대 1024개의 자식 프로세스를 생성하여 요청을 처리함. 1개의 프로세스에 1개의 스레드만 있어 안정적이나 메모리를 많이 사용함.
     prefork 방식을 사용하는 경우는 사용하는 아파치 모듈이 스레드에 안전하지 않은(Non Thread Safe)경우에 사용함  대표적인 것이 PHP.  
     PHP는 스레드에 안전하지 않기 떄문에 아파치 모듈에서 스레드로 사용할 수 없고 각각의 프로세스에서 사용하게 됨.
  2. Worker mpm : 프로세스당 여러개의 스레드를 연결
     메모리 사용량이 적어 동시접속이 많은 경우 사용함.
  3. Event mpm : 2.4 버전부터 사용할 수 있으며 worker mpm을 더욱 개선한 것.

  worker mpm, event mpm에서는 non thread safe인 PHP를 아파치 모듈로 포함할 수 없고 PHP-fpm을 사용해야함

### Nginx

- 아파치의 Prefork Mpm이 너무 무거워 많은 동시 접속자수를 처리하기에는 한계가 있어 LightHttp등 웹서버를 경량화하기 위한 노력이 있었고 많은 인기가 있었다.
- 그러나 nginx가 나오면서 가벼운 웹서버로서는 nginx가 최고의 인가를 구가하게 됨
- nginx는 event-driven 방식의 경량 웹서버
- nginx의 event-driven 방식은 아파치의 event mpm과는 다름
  메모리를 훨씬 적게 사용하면서 동시접속에 효율적

 
