package _02_structural_patterns._07_bridge.exam01;

public class HBPencil extends Brush{

    private String name;

    protected HBPencil(Color color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String draw() {
        return this.name + " " + super.color.fill();
    }
}
