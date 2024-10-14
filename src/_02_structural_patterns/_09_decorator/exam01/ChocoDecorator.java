package _02_structural_patterns._09_decorator.exam01;

public class ChocoDecorator extends Decorator{

    public ChocoDecorator(Component component) {
        super(component);
    }

    @Override
    public String cakeAdd() {
        return super.cakeAdd() + " + 초코";
    }
}
