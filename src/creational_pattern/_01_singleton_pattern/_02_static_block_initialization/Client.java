package creational_pattern._01_singleton_pattern._02_static_block_initialization;

public class Client {

    //Eager initialization 과 유사하지만 static block을 통해서 Exception Handling 에 대한 옵션을 제공함
    //예외에 대한 처리를 할 수 있지만 eager initialization 과 마찬가지로 클래스 로딩 단계에서 인스턴스를 생성하기 때문에 큰 리소스를 다루는 경우에는 적합하지 않게 된다.
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
