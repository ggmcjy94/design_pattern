package _02_structural_patterns._09_decorator.exam01;

public class Client {

    public static void main(String[] args) {
        Component espresso = new BaseComponent();
        System.out.println("에스프레소 : " + espresso.coffeeAdd());

        Component americano = new WaterDecorator(new BaseComponent());
        System.out.println("아메리카노 : " + americano.coffeeAdd());

        Component latte = new MilkDecorator(new WaterDecorator(new BaseComponent()));
        System.out.println("라떼 : " + latte.coffeeAdd());

        Component strawBerryCake = new StrawBerryDecorator(new BaseComponent());
        System.out.println("딸기케이크 : " + strawBerryCake.cakeAdd());

        Component chocoCake = new ChocoDecorator(new StrawBerryDecorator(new BaseComponent()));
        System.out.println("초코케이크 : " + chocoCake.cakeAdd());
    }
}
