package _01_creational_pattern._03_abstract_factory.exam01;

public class Client {

    public static void main(String[] args) {
        MyDialog dialog = new MobileDialog();
        DesktopDialog desktopDialog = new DesktopDialog();

        Button button = dialog.createButton();
        Button desktopDialogButton = desktopDialog.createButton();
        button.onClick();
        desktopDialogButton.onClick();
    }
}
