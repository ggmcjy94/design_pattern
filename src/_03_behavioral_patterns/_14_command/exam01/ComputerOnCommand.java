package _03_behavioral_patterns._14_command.exam01;

public class ComputerOnCommand implements Command{

    private Computer computer;


    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.turnOn();
    }
}
