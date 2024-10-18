package _03_behavioral_patterns._15_interpreter.exam01;

public class IntToHexExpression implements Expression{

    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }


    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
