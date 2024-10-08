package creational_pattern.singleton_pattern._05_bill_pugh_singleton_implementaion;

public class Client {

    //Bill Pugh 가 고안한 방식으러 inner static helper class 를 사용하는 방식이다.
    //앞선 방식이 안고 있는 문제점들을 대부분 해결한 방식으로 현재 가장 널리 쓰이는 싱글톤 구현 방법이다.
    //class 내에 private static inner class 를 두어 싱글톤을 갖게 하는 방식이다.
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);


    }
}
