package _02_structural_patterns._08_composite.exam01;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle());
        drawing.add(new Triangle());
        drawing.draw("Red");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());

    }
}
