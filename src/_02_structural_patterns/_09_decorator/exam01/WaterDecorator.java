package _02_structural_patterns._09_decorator.exam01;

public class WaterDecorator extends Decorator{


    public WaterDecorator(Component component) {
        super(component);
    }

    @Override
    public String coffeeAdd() {
        return super.coffeeAdd() + " + 물";
    }
}
