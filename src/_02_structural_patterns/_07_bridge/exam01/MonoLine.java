package _02_structural_patterns._07_bridge.exam01;

public class MonoLine extends Brush{

    private String name;

    public MonoLine(Color color , String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String draw() {
        return this.name + " " + super.color.fill();
    }
}
