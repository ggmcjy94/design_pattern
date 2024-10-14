package _02_structural_patterns._09_decorator.exam01;

public class StrawBerryDecorator extends Decorator{
    public StrawBerryDecorator(Component component) {
        super(component);
    }

    @Override
    public String cakeAdd() {
        return super.cakeAdd() + " + 딸기";
    }
}
