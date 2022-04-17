# 숫자 야구 게임

## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.

* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.



## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)



## 기능 요구 사항

- **기본적으로 1부터 9까지 서로 다른 수로 이루어진 3가지의 수를 맞추는 게임이다.**
- **같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이라는 힌트를 얻고, 그 힌트를 이용하여 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다**
    - **[예] 상대방(컴퓨터)의 수가 425일 때**
        - **123을 제시한 경우 : 1스트라이크**
        - **456을 제시한 경우 : 1스트라이크 1볼**
        - **789를 제시한 경우 : 낫싱**
- **위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.**
- **이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.**
- **게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.**
- **사용자가 잘못된 값을 입력할 경우 IllegalArgumentException()으로 시작하는 에러 메시지를 출력하고 게임을 종료한다.**



## 기능 요구 사항 세부 정리

- [x] 프로그램 실행 시 인사말과 함께 게임을 시작한다.
- [x] 컴퓨터가 3자리의 야구번호를 생성한다.
    - 1 ~ 9로 이루어진 세자리 숫자를 nextstep.utils.Randoms의 pickNumberInRange를 이용하여 생성한다.
- [x] 플레이어가 야구번호를 Console에 입력한다.
    - 플레이어가 입력한 자리수가 3자리가 아닌 경우 IllegalArgumentException()으로 시작하는 에러 메시지를 출력하고 게임을 종료한다.
    - 플레이어가 입력한 숫자 중 '0'이 포함 된 경우 IllegalArgumentException()으로 시작하는 에러 메시지를 출력하고 게임을 종료한다.
    - 플레이어가 숫자를 입력하지 않았을 경우 IllegalArgumentException()으로 시작하는 에러 메시지를 출력하고 게임을 종료한다.
- [x] 3개의 숫자를 전부 맞추지 못했을 경우 (3스트라이크가 아닐 경우) 힌트와 함께 다시 Console로 입력받을 준비를 한다.
- [x] 3개의 숫자를 전부 맞췄을 경우 (3스트라이크) 게임을 다시 시작하거나 완전히 종료할 수 있는 선택지를 제공한다.



## 프로그래밍 요구 사항

- #### 제약 사항

    - 숫자 야구게임을 실행하는 시작점은 src/main/java 폴더의 baseball.Application의 main()이다.
    - 숫자 야구게임은 JDK 8 버전에서 실행 가능해야 한다.
    - JDK에서 기본 제공하는 Random, Scanner API 대신 nextstep.utils 패키지에서 제공하는 Randoms, Console API를 활용해야한다.
        - Random 값 추출 : camp.nextstep.utils.Randoms의 pickNumberinRange()를 활용한다.
        - 사용자가 입력하는 값은 camp.nextstep.utils.Console의 readLine()을 활용한다.
    - 프로그램 구현을 완료했을 때 src/test/java 폴더의 baseball.ApplicationTest에 있는 2개의 Test Case가 성공해야 한다.
        - ApplicationTest에서 제공하는 2개의 Test Case는 숫자 야구게임 구현을 위한 최소한의 Test Case이다.
        - 필수 요구사항은 아니지만 제공하는 소스 코드를 참고해 숫자 야구게임을 위한 모든 Test Case를 추가해 보는 것도 테스트에 대한 좋은 연습이 될 수 있다.
    - 자바 코드 컨벤션을 지키면서 프로그래밍한다. •https://naver.github.io/hackday-conventions-java/
    -  indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
    - 자바 8에 추가된 stream api를 사용하지 않고 구현해야 한다. 단, 람다는 사용 가능하다.
    - else 예약어를 쓰지 않는다.
        - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
        - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다. •함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.

- #### 단위 테스트

    - 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.
    - 힌트는 MVC 패턴 기반으로 구현한 후 View, Controller를 제외한 Model에 대한 단위 테스트를 추가하는 것에 집중한다.
    - JUnit5와 AssertJ 사용법에 익숙하지 않은 개발자는 첨부한 "학습테스트를 통해 JUnit 학습하기.pdf" 문서를 참고해 사용법을 학습한 후 JUnit5 기반 단위 테스트를 구현한다.
