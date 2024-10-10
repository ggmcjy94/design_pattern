package _01_creational_pattern._01_singleton_pattern._01_eager_initialization;

public class Client {

    //가장 간단한 형태의 구현 방법이다. 이는 싱글톤 클래스의 인스턴스를 클래스 로딩 간계에서 생성하는 방법이다.
    //어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 자칫 낭비가 발생할 수 있음
    //이 방법을 사용할 때는 싱글톤 클래스가 다소 적은 리소스를 다룰 때여야 함
    //File System, Database Connection 등 큰 리소스들을 다루는 싱그톤을 구현할 때는 위와 같은 방식보다는 getinstatnce() 메소드가 호출될 때까지 싱글톤 인스턴스를 생성하지 않는 것이 더 좋다.
    //그리고 이방식은 exception handleing도 제공하지 않음
    public static void main(String[] args) {

        // 같은 객체
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(Singleton.getInstance());

        //다른 객체
        Singleton instance2 = new Singleton();
        System.out.println(instance2);
    }
}
