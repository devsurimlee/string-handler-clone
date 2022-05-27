## string-handler-clone

## 실행방법
```
git clone https://github.com/devsurimlee/string-handler-clone
./gradlew bootRun
```

## Api Test
#### Swagger: http://localhost:8080/swagger-ui/index.htm

## 기술스택
* Java 8
* Spring Boot 2.6.7
* Swagger 3.0
* JUnit 5
* Jsoup
* Lombok

## API 설명
1. URL 입력시 HTML 코드를 불러온다.
2. 노출유형(exposureType)
   * REMOVE_HTML: 태그를 제거한다.
   * ALL_TEXT: 태그를 제외하지 않음
3. 2에서 영어, 숫자만 필터링한다.
4. 오름차순 정렬
   * 영어: AaBbCc..Zz
   * 숫자: 0-9
5. 교차출력
   * 영어와 숫자를 교차로 출력한다.
   * 영어와 숫자중 하나가 없을 경우 남아있는 문자열을 그대로 출력한다.
6. 출력묶음단위(unitCount)
   * 1이상의 출력묶음단위로 문자열을 나누어 몫과 나머지로 분리한다.
