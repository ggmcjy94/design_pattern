package _01_creational_pattern._03_abstract_factory.exam01;

public class MobileDialog extends MyDialog{
    @Override
    Button createButton() {
        return new MobileButton();
    }
}
