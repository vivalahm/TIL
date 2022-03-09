### **리스코프 치환 원칙 (Liskov Substitution Principle)**



위키피디아에서는 리스코프 치환 원칙을 다음과 같이 정의하고 있습니다.

> 컴퓨터 프로그램에서 자료형 S가 자료형 T의 하위형이라면 필요한 프로그램의 속성의 변경 없이 자료형 T의 객체를 자료형 S의 객체로 교체(치환)할 수 있어야 한다는 원칙이다.

다만 이렇게 이해하면 어려우니, **자식 클래스와 부모 클래스 간의 행위에는 일관성이 있어야 한다**는 의미로 이해해도 좋습니다.

예를 들어, 다음과 같은 직사각형 클래스가 있는 상태입니다.

```
class Rect {
  _width: number = 0;
  _height: number = 0;

  get height() {
    return this._height;
  }

  set height(_height) {
    this._height = _height;
  }

  get width() {
    return this._width;
  }

  set width(_width) {
    this._width = _width;
  }

  getArea() {
    return this._height * this._width || 0;
  }
}
```

정사각형은 직사각형의 범주에 들어가니, `Rect` 클래스를 상속받아 새로운 정사각형 클래스를 정의해 보겠습니다.
다만 정사각형은 네 변의 길이가 같으므로 한 변의 길이만 활용하며, 넓이 역시 한 변의 제곱으로 구할 수 있습니다.

```
class Square extends Rect {
  // Override
  getArea() {
    return this._width * this._width || 0;
  }
}
```

바로 여기서 문제가 발생하는데요, `getArea()` 는 부모 클래스에서는 (높이 * 너비)를 계산해 넓이를 구했지만, 정사각형 클래스에서 재정의한 `getArea()`는 (너비 * 너비)를 통해 넓이를 구함으로써 **행위의 일관성을 잃어버린** 상태입니다.

 

따라서 리스코프 치환 법칙을 유지하기 위해서는 **자식 클래스에서 부모 클래스의 기능을 재정의하는 행위를 지양**해야 하며, 불가피한 경우라면 추상 클래스나 인터페이스를 활용해 추상 메서드를 상속받아 구현해야 합니다.

### **인터페이스 분리 원칙 (Interface Segregation Principle)**



인터페이스 분리 원칙은 클라이언트에 특화되도록 인터페이스를 분리해야 한다는 원칙입니다.

인터페이스를 적절히 분리하면 한 모듈에 발생한 에러가 다른 모듈들에 영향을 미치는 문제도 막을 수 있고, 특정 인터페이스만 비정상적으로 비대해지는 문제 역시 미연에 방지할 수 있습니다.

 

한번 `Phone` 클래스를 예시로 알아보겠습니다.

```
class Phone {
  constructor() {
    try {
      this.camera();
    } catch (err) {
      console.log(err);
    }
    try {
      this.browser();
    } catch (err) {
      console.log(err);
    }
    try {
      this.music();
    } catch (err) {
      console.log(err);
    }
  }

  camera() {
    throw new Error("카메라 고장!");
  }
  browser() {
    console.log("브라우저 실행");
  }
  music() {
    console.log("음악 플레이어 실행");
  }
}

const phone = new Phone();
```

이렇게 인터페이스를 분리하지 않으면 카메라나 다른 모듈에 기능이 추가될수록 `Phone` 모듈은 지나치게 비대해지고, 결과적으로 유연성을 잃게 됩니다.

```
class Phone {
  constructor() {
    const browser = new Browser();
    const camera = new Camera();
    const music = new Music();
  }
}

class Browser {
  constructor() {
    try {
      console.log("브라우저 실행");
    } catch (err) {
      console.log(err);
    }
  }
}

class Music {
  constructor() {
    try {
      console.log("음악 플레이어 실행");
    } catch (err) {
      console.log(err);
    }
  }
}

class Camera {
  constructor() {
    try {
      throw new Error("카메라 고장!");
    } catch (err) {
      console.log(err);
    }
  }
}

const phone = new Phone();
```

대신 각 모듈을 독립된 인터페이스로 분리하면 어느 한 모듈이 비대해질 염려도 없고, 특정 모듈에 장애가 발생할 시 디버깅에도 유리하다는 장점이 있습니다.