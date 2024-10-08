package creational_pattern.singleton_pattern._03_lazy_initialization;

public class Client {

    //앞선 두방식과는 달리 나중에 초기화하는 방법
    //global access 한 getInstance() 메소드를 호출할 때에 인스턴스가 없다면 생성
    //이 방식으로 구현할 경우 앞선 두방식에 안고 있던 문제 (사용하지 않았을경우 인스턴스 낭비) 에 대해 어느 정도 해결책이 된다.
    //허나 Lazy-initialization 방식은 multi-thread 환경에서 동기화문제가 발생한다. 예를 들어 인스턴스가 생성되지 않은 시점에서 여러 쓰레드가 동시에 getInstance() 를 호출한다면 예상치 못한 결과를 얻을 수 있을뿐더러 단 하나의 인스턴스를 생성한다는 싱글톤 패턴에 위반하는 문제점이 애기될 수 있다. 그렇게에 이방법으로 구현을 해도 괜찮은 경우는 single-thread 환경이 보장됐을 때이다.
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
