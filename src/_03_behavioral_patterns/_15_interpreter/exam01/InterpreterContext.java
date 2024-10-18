package _03_behavioral_patterns._15_interpreter.exam01;

public class InterpreterContext {

    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return  Integer.toHexString(i);
    }
}
