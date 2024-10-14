# flyweight_pattern
플라이웨이트패턴

**1.개요**
- 플라이웨이트 패턴은 동일하거나 유사한 객체들 사이에 가능한 많은 데이터를 서로 공유하여 사용하도록 하여 메모리 사용량을 최소화하는 소프트웨어 디자인 패턴이다.
- 종종 오브젝트의 일부 상태 정보는 공유될 수 있는데 플라이웨이트 패턴에서는 이와 같은 상태 정보를 외부 자료 구조에 저장하여 플라이웨이트 오브젝트가 잠깐 동안 사용할 수
  있도록 전달한다.

**2.사용이유**

- 공통적으로 많이 사용하는 클래스가 있고 무수이 많은 개수가 사용 되고 있을 때 클라이언트에서 매번 새로운 인스턴스를 생성하면 메모리 낭비가 심한 경우가 발생하는 경우에 적용하면 유리하다.

**3.장단점**

**#장점**

- 많은 객체를 만들때 성능을 향상 시킨다.
- 많은 객체를 만들때 메모리를 줄일수 있다.

**#단점**

- 특정 인스턴스를 다르게 처리하는게 힘들다.

**4.사용라이브러리**

**- 자바**
- Integer.valueOf(int)
- 캐시를 제공한다.
- https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf-int-