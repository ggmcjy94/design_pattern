package _01_creational_pattern._01_singleton_pattern._04_thread_safe_singleton;

public class Client {

    //Lazy-initialization을 해결하기 위한 방법으로 getInstance() 메소드에 synchronized를 걸어두는 방식이다.
    //synchronized 키워드는 임계 영역을 형성해 해당 영역에 오직 하나의 쓰레드만 접근 가능하게 해준다.
    //getInstance() 메소드 내에 진입하는 쓰레드가 하나로 보장받기 때문에 멀티 쓰레드 환경에서도 정상 동작하게 된다.
    //그러나 synchronized 키워드 자체에 대한 비용이 크기 때문에 싱글톤 인스턴스 호출이 잦은 어플리케이션에서는 성능이 떨어지게 된다. 그래서 고안된 방식이 double checked locking 이고 이는 getInstance() 메소드 수준에 lock을 걸지 않고 instance 가 null일 경우에만 synchronized 가 동작되는 방식이다.
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton singleton = Singleton.doubleCheckedLockingSingleton();
        System.out.println(singleton);
    }
}
