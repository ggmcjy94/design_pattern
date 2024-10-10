package _02_structural_patterns._06_adapter.exam01;

public class Client {
    public static void main(String[] args) {
        LinuxCalculator linuxCalculator = new LinuxCalculator();
        double execute = linuxCalculator.execute(1, 2);

        WindowCalculator windowCalculator = new WindowCalculator();
        double execute1 = windowCalculator.execute(3, 4);

        LinuxCalculator calculatorAdapter = new CalculatorAdapter(windowCalculator);
        double execute2 = calculatorAdapter.execute(5, 6);




    }
}
