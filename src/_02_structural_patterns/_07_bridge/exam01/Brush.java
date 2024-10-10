package _02_structural_patterns._07_bridge.exam01;

public abstract class Brush {

    protected Color color;

    protected Brush(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
