package _02_structural_patterns._09_decorator.exam01;

public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String coffeeAdd() {
        return component.coffeeAdd();
    }

    @Override
    public String cakeAdd() {
        return component.cakeAdd();
    }
}
