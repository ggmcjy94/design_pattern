package _02_structural_patterns._07_bridge.exam01;

public class Client{


    public static void main(String[] args) {
        Brush blueBrush = new HBPencil(new Blue(), "HBPencil");
        Brush redBrush = new MonoLine(new Red(), "MonoLine");

        String draw = blueBrush.draw();
        String draw1 = redBrush.draw();

        System.out.println(draw);
        System.out.println(draw1);


    }
}
