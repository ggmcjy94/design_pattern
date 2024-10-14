package _02_structural_patterns._09_decorator.exam01;

public class BaseComponent implements Component{


    @Override
    public String coffeeAdd() {
        return "에스프레소";
    }

    @Override
    public String cakeAdd() {
        return "케이크";
    }
}
