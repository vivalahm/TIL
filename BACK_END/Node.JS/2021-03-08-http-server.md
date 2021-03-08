# http-server 설치와 EACCES에러 해결법

### 설치

- npm을 통해 http-server 모듈을 전역(-global) 설치한다.

```
$npm install -g http-server
```

```
http-server -p 8080 ./public
```

을 통해 서버를 작동



### EACCES 에러 해결

해당 에러는 이미 다른 서버에의해 포트가 작동 중이거나 사용중일 때 발생

(나의 경우 톰캣WAS와 포트가 곂쳐서 오류가 발생)

```
http-server -p 8081 ./public
```

로 포트번호를 변경하면 오류해결 가능하다.

### 다른 방법

도커 이미지를 통해 노드 가동 가능

```
docker run -it node
```

(permission 오류가 뜨면 sudo 추가)

run명령어는 node 이미지가 없으면  이미지를 다운 받고 내컴퓨터 내에서 컨테이너 생성

-it옵션은 컨테이너 환경내에서 CLI를 사용하는 옵션



도커파일 내에

```
FROM node:12.18.4

# 이미지 생성 과정에서 실행할 명령어
RUN npm install -g http-server

# 이미지 내에서 명령어를 실행할(현 위치로 잡을)디렉토리 설정
WORKDIR /home/node/app

# 컨테이너 실행시 실행할 명령어
CMD /"http-server", "-p", "8080", "./public"/

# 이미지 생성 명령어{현 파일과 같은 디렉토리에서}
# docker build -t {이미지명}

# 컨테이너 생성 & 실행 명령어
# docker run --name {컨테이너명} -v(pwd):/home/node/app -p 8081:8081 {이미지명}
```

