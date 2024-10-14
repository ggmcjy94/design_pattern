package _02_structural_patterns._10_facade.exam01;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
