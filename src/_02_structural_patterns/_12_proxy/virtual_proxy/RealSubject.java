package _02_structural_patterns._12_proxy.virtual_proxy;

public class RealSubject implements ProxyInterface{
    @Override
    public void printStatement() {
        System.out.println("Proxy Check");
    }
}
