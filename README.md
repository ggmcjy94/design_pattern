# chain_of_responsibility_pattern
책임연쇄패턴

**1.개요**

- 클라이언트로부터의 요청을 처리할 수 있는 처리객체를 집합(Chain)으로 만들어 부여함으로 결합을 느슨하게 하기위해 만들어진 디자인 패턴이다.
- 일반적으로 요청을 처리할 수 있는 객체를 찾을 때 까지 집합 안에서 요청을 전달합니다.
- 실제로 굉장히 많이 쓰이는 패턴중 하나이다.

**2.사용이유**

- 요청의 발신자와 수신자를 분리하는 경우
- 요청을 처리할 수 있는 객체가 여러개일 때 그 중 하나에 요청을 보내려는 경우
- 코드에서 처리객체(handler)를 명시적으로 지정하고 싶지 않은 경우
- 책임 연쇄 패턴은 요청을 처리할 수 있는 객체가 여러 개이고 처리객체가 특성적이지 않을 경우 권장되는 패턴이다.


**3.장단점**

**#장점**

- 결합도를 낮추며, 요청의 발신자와 수신자를 분리시킬 수 있다.
- 클라이언트는 처리객체의 집합 내부의 구조를 알 필요가 없다.
- 집합 내의 처리 순서를 변경하거나 처리객체를 추가 또는 삭제할 수 있어 유연성이 향상된다.
- 새로운 요청에 대한 처리객체 생성이 매우 편리해진다.

**#단점**

- 충분한 디버깅을 거치지 않았을 경우 집합 내부에서 사이클이 발생할 수 있다.
- 디버깅 및 테스트가 쉽지않다.


**4.사용라이브러리**

**- 자바:** 서블릿 필터<br>
**- 스프링:** 스프링 시큐리티 필터
 


