package _01_creational_pattern._03_abstract_factory.exam01;

public class DesktopDialog extends MyDialog{
    @Override
    Button createButton() {
        return new DesktopButton();
    }
}
