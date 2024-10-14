package _02_structural_patterns._10_facade.exam01;

public class Client {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawSquare();
        shapeFacade.drawRectangle();
    }
}
