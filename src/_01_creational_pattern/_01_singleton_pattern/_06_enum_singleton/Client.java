package _01_creational_pattern._01_singleton_pattern._06_enum_singleton;

public class Client {
    //앞선 싱글톤 방식들은 완전히 안전할 수 없다 왜냐하면 java의 reflection 을 통해서 싱글톤을 파괴할 수 있기 때문이다, 그래서 나온 싱글톤 방식이 enum으로 싱글톤을 구현한 방법이다.
    //그러나 이 방법 또한 eager-initialization, static block initialization과 같이 사용하지 않았을 경우의 메모리 문제를 해결하지 못한 것과 유연성이 떨어진다는 면에서의 한계를 지니고 있다.
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance);
        System.out.println(instance1);
    }
}
