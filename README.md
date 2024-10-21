# iterator_pattern
이터레이터패턴

**1.개요**

- 이터레이터란 반복하다라는 의미로 어떠한 객체의 집합을 순서대로 명령을 처리할 수 있게 해주는 디자인 패턴이다.
- 대부분의 프로그래밍 언어에서 콜렉션 자료구조에 사용이 가능하며 간단하면서도 실제로도 굉장히 많이 쓰고있는 패턴이다.
- for 문의 i++에서 i를 하나씩 증가시키면서 콜렉션 요소 전체를 처음부터 차례대로 검색할 때, 사용되는 증가 변수인 i의 기능을 추상화해서 일반화한 것을 디자인 패턴화 시킨 것이 이터레이터 패턴이다.

**2.사용시점**

- 객체들의 그룹을 유지하는 타입이 있고 이를 반복문에서 사용하고 싶을 때 iterator pattern을 사용한다.
- 내부 구현을 노출 시키지 않고 집약(집합) 객체(배열과 같은)에 접근하고 싶은 경우
- 집약 객체에 다양한 탐색 경로가 필요한 경우 (iterator 인터페이스 상속 구조) 역방향 탐색, 특정 인덱스 탐색 등
- 서로 다른 집합 객체 구조에 대해서도 동일한 방법으로 접근하고 싶은 경우 ArrayList, LinkedList와 같은 다른 자료 구조에서도 동일한 방법

**3.장단점**

**#장점**

- 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있다.
- 일관된 인터페이스를 사용해 여러 형태의 집합 구조를 순회할 수 있다.

**#단점**

- 클래스가 늘어나고 복잡도가 증가한다.

**4.사용라이브러리**

- 자바: java.util.Enumeration과 java.util.Iterator, Java StAX (Streaming API for XML)의 Iterator 기반 API - XmlEventReader, XmlEventWriter
- 스프링: CompositeIterator
