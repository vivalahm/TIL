## [use strict](https://ko.javascript.info/strict-mode#ref-1179)

지시자 `"use strict"`, 혹은 `'use strict'`는 단순한 문자열처럼 생겼습니다. 하지만 이 지시자가 스크립트 최상단에 오면 스크립트 전체가 “모던한” 방식으로 동작합니다.

예시:

```javascript
"use strict";

// 이 코드는 모던한 방식으로 실행됩니다.
...
```

명령어를 그룹화하는 방식인 함수에 대해선 곧 학습하도록 하겠습니다. 함수에 대해 학습하기 전에, `"use strict"`는 스크립트 최상단이 아닌 함수 본문 맨 앞에 올 수도 있다는 점을 알아두시기 바랍니다. 이렇게 하면 오직 해당 함수만 엄격 모드로 실행됩니다. 엄격 모드는 대개 스크립트 전체에 적용하지만 말이죠.

**"use strict"는 반드시 최상단에 위치시키세요.**

`"use strict"`는 스크립트 최상단에 있어야 한다는 점을 잊지 마세요. 그렇지 않으면 엄격 모드가 활성화되지 않을 수도 있습니다.

다음 코드에서는 엄격 모드가 활성화되지 않습니다.

```javascript
alert("some code");
// 하단에 위치한 "use strict"는 스크립트 상단에 위치하지 않으므로 무시됩니다.

"use strict";

// 엄격 모드가 활성화되지 않습니다.
```

`"use strict"`의 위에는 주석만 사용할 수 있습니다.

**`use strict`를 취소할 방법은 없습니다.**

자바스크립트 엔진을 이전 방식으로 되돌리는 `"no use strict"`같은 지시자는 존재하지 않습니다.

일단 엄격 모드가 적용되면 돌이킬 방법은 없습니다.

## ['use strict’를 꼭 사용해야 하나요](https://ko.javascript.info/strict-mode#ref-1181)

"당연히 사용해야 하는 거 아니야?"라는 생각이 드시겠지만, 꼭 그렇지만은 않습니다.

누군가는 스크립트 맨 윗줄엔 `"use strict"`를 넣는 게 좋다고 권유할 수 있습니다. 그런데 그거 아세요?

모던 자바스크립트는 '클래스’와 '모듈’이라 불리는 진일보한 구조를 제공합니다(클래스와 모듈에 대해선 당연히 뒤에서 학습할 예정입니다). 이 둘을 사용하면 `use strict`가 자동으로 적용되죠. 따라서 이 둘을 사용하고 있다면 스크립트에 `"use strict"`를 붙일 필요가 없습니다.

결론은 이렇습니다. **코드를 클래스와 모듈을 사용해 구성한다면 `"use strict"`를 생략해도 됩니다. 그런데 아직은 이 둘을 배우지 않았으니 `"use strict"`를 귀한 손님처럼 모시도록 하겠습니다.**

지금까지는 `use strict`의 일반적인 특징에 대해 알아보았습니다.

다음 챕터부터는 자바스크립트 언어가 제공하는 기능들을 하나씩 학습하면서 이 기능들이 엄격 모드와 비 엄격 모드에서 어떤 차이점을 보이는지 알아보겠습니다. 희소식을 알려드리자면 두 모드에서 차이를 보이는 기능이 많지 않다는 점과 엄격 모드를 사용하면 개발자의 삶의 질이 조금 더 높아진다는 점입니다.

그리고 특별한 언급이 없는 한 이 튜토리얼에 등장하는 모든 예시엔 엄격 모드를 적용할 예정입니다.
