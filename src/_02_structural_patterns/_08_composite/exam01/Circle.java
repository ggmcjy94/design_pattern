package _02_structural_patterns._08_composite.exam01;

public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}
