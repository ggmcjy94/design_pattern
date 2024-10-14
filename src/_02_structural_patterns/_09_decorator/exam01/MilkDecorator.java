package _02_structural_patterns._09_decorator.exam01;

public class MilkDecorator extends Decorator{

    public MilkDecorator(Component component) {
        super(component);
    }

    @Override
    public String coffeeAdd() {
        return super.coffeeAdd() + " + 우유";
    }
}
