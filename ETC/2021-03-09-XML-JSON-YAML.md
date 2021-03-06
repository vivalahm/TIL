# xml, json, yaml

## XML , Json

- 목록과 표를 한줄의 코드로 표현하는 방식
- 정보를 주는 쪽과 받는 쪽 사이에 잘 설계되어 합의된 형식
- 클라이언트와 서버간의 request 즉, 복잡한 표나 배열 등을 한줄의 코드로 전달하는 방식
- 데이터를 주고 받을 때, 웹 서비스 설정 파일을 작성할 때 모바일 앱 UI를 설계할 때 등등 많은 곳에서 xml과 json을 사용 가능

### xml

- 태그라는 형식을 사용
- xml의 각 태그들은 그 자체 단일로 있거나 시작과 끝 태그가 있다.
- xml 최상단에는 버전과 인코딩 정보가 들어감
- 태그안에 곂곂이 태그를 입력 가능
- xml Minifier를 이용해서 공백과 tap을 삭제하여 한줄로 표현가능 이렇게 해도 데이터를 파싱하는데는 문제 없음.(여는 태그와 닫는 태그를 사용해서 정보의 구조를 명확히 구분하기 떄문에)
- xml Formatter를 이용해서 반대로 한 줄로 바뀐 xml 데이터를 minifing 하기 전인 개발자가 보기 좋은 형태로 인덴팅을 해줌
-  단점은 자동완성기능이 없이는 텍스트를 두번씩 쳐야하고 태그의 여닫이에도 신경써야한다.
- 사용처 마다 요구되는 구조와 형태를 잘 갖췄는지를 스크마(xsd문서)를 통해 검증가능 (안전성을 요구)

### Json

- 자바스크립트의 객체 표기법 => xml 보다 간격한 형태로 구조화된 정보로 표시
- 마찬가지로 json Minifier를 통해 공백과 탭을 제거 가능
- 최근 xml을 대체해 나가는 중
- 단 문법 오류에 취약함 (','하나 혹은 ']'하나르 빼먹으면 오류뜸)
- 단 xml은 열고 닫는 태그가 있어서 오타가 있는 닫는 태그 쪽은 컴퓨터가 자동으로 파싱가능
- 가벼움을 요구하는 곳에 활용됨

## yaml

- 데이터를 한줄로 실어 보내는 것이 아니라 사람이 보기좋게 작성하는데 목적을 둠
- 파이썬처럼 yaml을 작성 할때는 줄바꿈과 태그가 필수 요소 (어기면 정보가 파괴기 때문에)
- Json to yaml을 통해 json 텍스트를 yaml 텍스트로 (인덴팅)변경가능
- 상속을 사용해서 여러 데이터를 효율적으로 작성가능
- 사람의 편의를 우선시 하기 때문에 도커 컴포즈나 스프링의 설정 파일에 많이 사용됨



* 프로그래밍을 하다 보면 이러한 3형식을 자주 접하게 되고 때로 적합한 것을 선택해 사용해야함.
