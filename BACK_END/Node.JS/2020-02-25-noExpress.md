웹서버의 기본 규칙

사용자는 요청하고, 서버는 응답한다.

사용자는 크롬 등 웹브라우저를 통해 URL를 접속 =>form전송 Request

페이지를 사용자에게 소스를 전송 Response(텍스트, 이미지)

웹서버는 간단하게 사용자의 요청을 받아  응답하는 소스를 제공해주면된다.

### 내장 모듈을 활용해서 웹서버를 띄우기

```javascript
//express를 안쓰고 웹서버 띄우기 
const http = require('http');//node js 모듈 불러옴 http 내장 모듈 불러옴

http.createServer((request, response)=>{ //리퀘스트와 리스폰스를 인자로 받아서 리스폰스 작성
    response.writeHead(200,{'Content-Type':'text/plain'});// 사용자는 내가 작성한 텍스트 화면만 보게됨
    //http응답중 200번응답
    response.write('Hello Server');//텍스트 리스폰스 문구 출력
    response.end();
}).listen(3000);
//안의 함수를 작성하는데 포트가 3000번인 걸로 서버를 띄워달라
//핵심은 내가 작성한 리스폰스 응답 객체만 사용자가 볼수있다.

```

## http 상태코드

| 상태코드 | 설명                       |
| -------- | -------------------------- |
| 1xx      | 조건부응답                 |
| 2xx      | 응답성공                   |
| 3xx      | 리다이렉션                 |
| 4xx      | 요청오류(ex 404 Not Found) |
| 5xx      | 서버오류                   |

내가 지정한 리스폰스를 사용자들이 응답받아서 화면에 보여짐
