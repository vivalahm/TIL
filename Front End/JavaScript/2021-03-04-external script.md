## [외부 스크립트](https://ko.javascript.info/hello-world#ref-243)

자바스크립트 코드의 양이 많은 경우엔, 파일로 소분하여 저장할 수 있습니다.

이렇게 분해해 놓은 각 파일은 `src` 속성을 사용해 HTML에 삽입합니다.

```javascript
<script src="/path/to/script.js"></script>
```

여기서 `/path/to/script.js`는 사이트의 루트에서부터 파일이 위치한 절대 경로를 나타냅니다. 현재 페이지에서의 상대 경로를 사용하는 것도 가능합니다. 같은 폴더 내에 있는 파일인 `"script.js"`를 `src="script.js"`로 참조하는 것처럼 말이죠.

물론 아래와 같이 URL 전체를 속성으로 사용할 수도 있습니다.

```javascript
<script src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/4.17.11/lodash.js"></script>
```

복수의 스크립트를 HTML에 삽입하고 싶다면 스크립트 태그를 여러 개 사용하면 됩니다.

```javascript
<script src="/js/script1.js"></script>
<script src="/js/script2.js"></script>
…
```

**주의:**

HTML 안에 직접 스크립트를 작성하는 방식은 대개 스크립트가 아주 간단할 때만 사용합니다. 스크립트가 길어지면 별개의 분리된 파일로 만들어 저장하는 것이 좋습니다.

스크립트를 별도의 파일에 작성하면 브라우저가 스크립트를 다운받아 [캐시(cache)](https://en.wikipedia.org/wiki/Web_cache)에 저장하기 때문에, 성능상의 이점이 있습니다.

여러 페이지에서 동일한 스크립트를 사용하는 경우, 브라우저는 페이지가 바뀔 때마다 스크립트를 새로 다운받지 않고 캐시로부터 스크립트를 가져와 사용합니다. 스크립트 파일을 한 번만 다운받으면 되죠.

이를 통해 트래픽이 절약되고 웹 페이지의 실제 속도가 빨라집니다.

**`src` 속성이 있으면 태그 내부의 코드는 무시됩니다.**

<script> 태그는 src 속성과 내부 코드를 동시에 가지지 못합니다.

다음 코드는 실행되지 않습니다.

```javascript
<script src="file.js">
  alert(1); // src 속성이 사용되었으므로 이 코드는 무시됩니다.
</script>
```

따라서 `<script src="…">`로 외부 파일을 연결할지 아니면 `<script>` 태그 내에 코드를 작성할지를 선택해야 합니다.

위의 예시는 스크립트 두 개로 분리하면 정상적으로 실행됩니다.

```javascript
<script src="file.js"></script>
<script>
  alert(1);
</script>
```

## [요약](https://ko.javascript.info/hello-world#ref-244)

- 웹 페이지에 자바스크립트 코드를 추가하기 위해 `<script>` 태그를 사용합니다.
- `type` 과 `language` 속성은 필수가 아닙니다.
- 외부 스크립트 파일은 `<script src="path/to/script.js"></script>`와 같이 삽입합니다.

브라우저 환경에서의 스크립트, 스크립트와 웹 페이지의 상호작용에 대해서는 배울 것이 훨씬 더 많습니다. 하지만 본 튜토리얼의 이 파트는 자바스크립트라는 언어 자체에 초점을 맞추고 있기 때문에, 브라우저에서만 사용하는 코드에 주의를 뺏기지 않도록 하겠습니다. 브라우저는 온라인상에서 편리하게 자바스크립트를 실행할 수 있게 해주는 수단으로만 사용하도록 하겠습니다.
