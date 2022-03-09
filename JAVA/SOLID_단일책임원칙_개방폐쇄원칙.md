SOLID 원칙은 작은 모듈을 만들거나 큰 아키텍처를 기획할 때 모두 유용하게 사용되는 원칙입니다.

 

이 원칙은 객체지향 프로그래밍에만 적용할 수 있는 이론이 아니라, 소프트웨어를 설계할 때 이 원칙을 지켜가며 설계하면 소프트웨어의 유연성과 재사용성을 높일 수 있을 것이라 기대됩니다.

### **SOLID 란?**



- S : Single Responsive Principle (단일 책임 원칙)
- O : Open Closed Principle (개방 - 폐쇄 원칙)
- L : Liskov Substitution Principle (리스코프 치환 원칙)
- I : Interface Segregation Principle (인터페이스 분리 원칙)
- D : Dependency Inversion Principle (의존성 역전 원칙)

### **단일 책임 원칙 (Single Responsive Principle)**





![img](https://blog.kakaocdn.net/dn/vV2A4/btrdFmCqjDY/0QnKtLJnnGjy9KYOHuEmQ0/img.jpg)책임의 아이콘



단일 책임 원칙에 대한 가장 큰 오해는 **한 모듈이 하나의 동작을 해야 한다고 생각하는 것** 인데요, 이름 때문에 헷갈릴수도 있지만 이와는 엄밀히 다른 내용입니다.

 

단일 책임 원칙의 정의는 **한 모듈은 한 사용자(액터)를 위해 작동해야(= 책임져야) 한다**는 것으로, 다음 코드를 예로 들어보겠습니다.

```
function Employee(name, pos, hours) {
    this.name = name;
    this.pos = pos;
    this.hours = hours;

    // 재정팀이 사용할 급여 계산 메서드
    this.calculatePay = function() {
        ...
    }

    // 인사팀이 사용할 근무시간 계산 메서드
    this.calculateWorkHours = function() {
        ...
    }

    // 시스템이 사용할 데이터 갱신 메서드
    this.updateData = function() {
        ...
    }
}
```

`Employee` 모듈을 설계하고, 모듈에서 사용할 여러 메서드들을 한번에 정의한 모습입니다.

그런데, 과연 이게 좋은 설계일까요?

 

모듈에서 사용하는 함수들을 살펴보면 `calculatePay` 는 관리자(Ex. 재정팀)에 의해 사용될 것이고, `calculateWorkHours` 와 `updateData` 는 각각 다른 사용자를 위해 설계된 함수이므로 이는 단일 책임 원칙에 어긋난다고 할 수 있습니다.

 

따라서, 단일 책임 원칙을 만족시키기 위해 위 모듈에 다음과 같이 리팩토링을 시도할 수 있습니다.

```
function EmployeeData(name, pos, hours) {
    this.name = name;
    this.pos = pos;
    this.hours = hours;
}

// 재정팀이 사용할 기능을 PayCalculator 모듈로 분리한다.
function PayCalculator(employeeData) {
    this.data = employeeData;

    this.calculatePay = function() {
        ...
    }
}

// 인사팀이 사용할 기능을 WorkHourCalculator 모듈로 분리한다.
function WorkHourCalculator(employeeData) {
    this.data = employeeData;

    this.calculateWorkHour = function() {
        ...
    }
}

// 시스템이 사용할 기능을 SystemDataUpdator 모듈로 분리한다.
function SystemDataUpdator(employeeData) {
    this.data = employeeData;

    this.updateData = function() {
        ...
    }
}
```

이제 각 모듈들은 저마다 다른 사용자를 위해 동작하므로, 단일 책임 원칙을 충족했다고 볼 수 있으며 유연한 설계가 가능해집니다.

### **개방-폐쇄 원칙 (Open - Closed Principle)**



개방 - 폐쇄 원칙의 정의는 **"소프트웨어는 확장에는 개방되어 있고, 수정에는 폐쇄적이어야 한다"** 는 내용입니다.

 

이는 코드의 리팩토링과 관련된 원칙으로, 즉 **"새로운 기능을 추가할 때 기존 코드(함수)를 변경하는 대신, 해당 기능을 위한 코드(함수)를 새로 추가하라"** 는 의미로도 해석할 수 있습니다.

 

역시 코드로 알아보겠습니다.

```
// 접근 권한을 가진 역할군들
let accessibles = ['CEO', 'CTO', 'CFO', 'STAFF'];

function isAccessible(employee) {
    if(accessibles.includes(employee.role) {
        // 해당 직원이 접근 권한을 가질 경우
        return true;
    } else {
        // 접근 권한이 없을 경우
        return false;
    }
}
```

먼저 `isAccessible` 함수는 `accessibles` 배열을 사용하지만 이를 함수 내부가 아닌 함수 외부에서 관리하고 있습니다.

만약 `accessibles` 배열에 새로운 역할군을 추가해야 한다면 어떻게 할까요?

```
// 배열을 직접 수정하는 대신, 역할군 추가를 위한 함수를 생성한다.
// let accessibles = ['CEO', 'CSO', 'CTO', 'CFO', 'STAFF'];
let accessibles = ['CEO', 'CTO', 'CFO', 'STAFF'];

// 역할군 추가를 위해 생성한 함수
function addAccessibles(role) {
    accessibles.push(role);
}

function isAccessible(employee) {
    if(accessibles.includes(employee.role) {
        // 해당 직원이 접근 권한을 가질 경우
        return true;
    } else {
        // 접근 권한이 없을 경우
        return false;
    }
}
```

이렇게 `accessibles` 배열을 직접 수정하는 대신, `addAccesibles` 라는 함수를 새로 만들어 역할군을 새로 추가할 수 있도록 한 모습입니다.