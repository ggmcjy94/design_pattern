package _03_behavioral_patterns._15_interpreter.exam01;

public class IntToBinaryExpression implements Expression{

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }
}
