# Smart Contract Audit (스마트 컨트랙트 보안 감사)의 중요성

## [스마트 컨트랙트(Smart Contract )](http://wiki.hash.kr/index.php/%EC%8A%A4%EB%A7%88%ED%8A%B8_%EA%B3%84%EC%95%BD) 개념

### 개념

- 거래 당사자가 스스로 계약상의 조건을 설정 및 체크하여 해당 조건 달성 시 제 3자의 인위적 개입 없이 거래가 자동적으로 실행되어 계약이 이루어지도록 하는 프로토콜
- 1994년 [Nick Szabo](http://wiki.hash.kr/index.php/%EB%8B%89_%EC%9E%AC%EB%B3%B4)에 의해 소개된 스마트 컨트랙트는 [튜링-완전(Turing-complete)](http://wiki.hash.kr/index.php/%ED%8A%9C%EB%A7%81%EC%99%84%EC%A0%84) 블록체인 플롯폼인 이더리움 등장으로 구현 가능하게 됨 (Solidity 언어로 작성) 

### 특성

- 거래 내역 분산 보존 => 조건 달성 시 참가자들이 거래내역의 사본 분산 소유 및 보존
- 합의 과정의 효율화 => 참가자들간의 규칙 설정 및 실행 용이성 제공, 합의사항 도출 촉진
- 별도 중개기간 불필요 => 중재 기간 없이도 거래 당사자간 직접 조건 달성 상태 확인 가능
- 계약이행 상태의 확인 => 거래 조건과 내용에 따라 참가자에게 계약 이행 결과 통보
- 계약의 공증 => 스크립트 코드가 삽입되어 거래 실행 시 계약이 자동 공증됨

## 스마트 컨트랙트 (Smart Contract) 관련 해킹 사례

### 더 다오(The DAO) 해킹 사건 

- 2016년 6월, 이더리움의 스마트 컨트랙트 기능으로 개발된 더 다오 프로젝트에서 크라우드 세일로 판매한 다오 토큰을 이더로 환급하는 프로그램의 재귀 호출 버그(Recursive calling vulnerability)를 이용하여 다오 토큰을 이더로 무한 환급하는 방법으로 360만 이더 (약 500 억 원)를 탈취함

### 패리티 지갑(Parity Wallet)의 이더 탈취 해킹 사건 

- 2017 년 7월에 이더리움 플랫폼에서 동작하는 클라이언트인 패리티 지갑(Parity Wallet)에서 다중서명 (Multi-Signature)지갑의 취약점을 이용해 해당 계약의 소유자를 해커의 주소로 변경하는 방법으로 3개의 [ICO](http://wiki.hash.kr/index.php/ICO) 프로젝트(Edgeless 카지노, Aeternity, Swarm City)에서 153,037 이더 (약 3,200 만 달러)를 도난 당함

### 패리티의 이더 동결(Freeze) 해킹 사건

- 2017년 7월 문제가 된 취약점을 고치기 위해 다중 서명 지갑에 대한 라이브러리를 수정하였으나 초기화를 하지 않아 7월 20일 이후 배포된 관련 계약들이 모두 무효화됨

### 스마트 매쉬(Smart Mesh) 해킹 사건

- 2018년 스마트매쉬(SMT) 스마트 컨트랙트의 Overflow 버그로 인해 총 발행량 31억개를 초과한 [ERC -20](http://wiki.hash.kr/index.php/ERC-20) 토큰 1경개가 [후오비](http://wiki.hash.kr/index.php/%ED%9B%84%EC%98%A4%EB%B9%84)에 입금

## 스마트 컨트랙트 감사(Smart Contract audit)의 중요성

![img](https://mblogthumb-phinf.pstatic.net/MjAxOTA4MDNfMTkz/MDAxNTY0ODQxNDc5ODIw.EFqHxnj8IfshfLzj1MQOlOYudGL8QaK9dVrHXzs-azAg.w8KEcd7-2zpU8QI74fjlB0R36QknELfDcyhu6tuweDQg.JPEG.santalsm/117_%EA%B4%80%EB%A6%AC_2%EA%B5%90%EC%8B%9C_05_02.jpg?type=w2)

- 스마트 계약 코드를 배포하기 전에 코드를 검증을 통해 보안 취약점 존재 여부와 악성 코드 감영 여부를 사전에 확인 하는 Smart Contract Audit과 같은 활동이 필수적임

## 스마트 컨트랙트 감사(Smart Contract audit)의 개념 및 감사기법

### 스마트 컨트랙트 감사(Smart Contract audit) 개념

![img](https://mblogthumb-phinf.pstatic.net/MjAxOTA4MDNfMjI5/MDAxNTY0ODQxNDk5OTI5.SV42FD_hYqjXogx8VDFCl9q-PVsbwFqqKJC5620uJ3og.9jmIR5bKEiUCOnAI7sRpzJEde4ZZTyusfZq06ZvWGRcg.JPEG.santalsm/117_%EA%B4%80%EB%A6%AC_2%EA%B5%90%EC%8B%9C_05_03.jpg?type=w2)

- 정의 => 스마트 컨트랙트가 가진 코드 결함 및 보안 취약점을 찾아내어 개선방향을 제시하고 기능이 백서의 내용과 일치하게 구현되어 있는지 검증하는 활동

- 목적 => 1. 의도치 않은 보안 결함, 비효율적인 코드실행 개선 2. 개발자의 의도적인 부정행위 적발 3. 사용자가 블록체인을 안심하고 사용할 수 있는 환경 조성

- Smart Contract를 배포 전 소스코드 결함 및 [보안 취약점](http://wiki.hash.kr/index.php/%EC%B7%A8%EC%95%BD%EC%A0%90)을 검사하고 의도대로 잘 짜여져 있는지 검증

## 스마트 컨트랙트 감사(Smart Contract) 점검 대상 및 검사 기법

### 점검 대상 

1. 아키텍쳐
   -  Smart Contract에 대한 전반적인 아키텍처 검증
2. 코드결함
   - [Reentrancy](http://blog.naver.com/PostView.nhn?blogId=complusblog&logNo=220985740336) , Overflow and Underflow, Front-Running 등 검사
3. 보안 취약점
   - 공개적으로 알려진 보안 취약점 점검
4. 기능 검토
   - 스마트 컨트랙트 기능이 백서의 내용과 일치하는지 검증   

  ###  검사 기법

1. Code Design Patterns : 스마트 컨트랙트 아키텍처를 검토하고 재 사용하는 제 3자 Smart Contract 및 Library 를 체계적으로 안전하게 사용하는지 검토
2. Statics Analysis : [Oyente](https://m.blog.naver.com/ldw0811/221667853092), Manticore, Mythril 또는 Solgraph와 같은 보안 감사 도구를 사용하여 코드 결함, 백도어 및 악의적인 코드를 탐지 하는 자동화된 코드 검사
3. Unit Testing : 컨트랙트에서 각 기능에 대해 작성된 맞춤 유닛 테스트를 수행하여 각 기능이 예상대로 작동 하는지 확인
4. Manual Analysis : 경쟁조건(Race Conditions), 거래 주문 의존성과 같은 잠재적인 문제점을 발견하고 각 기능에 대한 라인 단위 코드 검사 수행
5. Bug Bounties : 스마트 컨트랙트가 실제 배포되기 전에 테스트 네트워크에 배포하여 전문가의 테스트를 통해 검증(버그 발견 보상금 지급)

- Smart Contract Audit 각 항목들에 대한 감사 후 발견된 문제점에 대해 Risk Rating 수행 
- Risk Rating : High > Medium > Low > Informational > Undetermined 으로 등급화

## 스마트 컨트랙트 감사(Smart Contract Audit) 프로세스 

![img](https://mblogthumb-phinf.pstatic.net/MjAxOTA4MDNfMjYw/MDAxNTY0ODQxNTIzNDY4.xf7gdD77Alo0CFpJ0SF-AaRQ5wr67tJLHGzGcSzmQ_Ig.uOwEExc9SNRUQS4-tYFtABKysBToRUTs8nl7BmS3UyIg.JPEG.santalsm/117_%EA%B4%80%EB%A6%AC_2%EA%B5%90%EC%8B%9C_05_04.jpg?type=w2)

1. 착수 (Preparation) : 보안 감사를 원하는 Smart Contract 소스코드, 백서등 자료를 받아 검토하고 감사 범위, 기법/도구, 일정 등 계획 수립 => 산출물 : 감사 계획서, 백서, 소스코드
2. 감사(Audit) : 오옌테(Oyente), 미스릴(Mythril) 등 오픈소스 보안 감사 도구 등을 이용한 자동화 및 전문가를 통한 수동 감사 수행 , 발견된 문제점을 Review 하고 개선 해결책 제시 => 산출물 : 점검 결과서
3.  보고(Report) : 감사보고서를 작성하여 검토한 후 감사 결과를 고객에게 통보, 시정사항에 대한 보완조치를 수행할 경우 수정사항을 반영해 감사보고서 개정 => 산출물 : 감사 보고서

- 국내.외 스마트 컨트랙트 감사 전문 보안 회사들이 다양 형태의 감사 서비스를 제공하고 있다.
