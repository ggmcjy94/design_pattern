package _03_behavioral_patterns._14_command.exam01;

public class ComputerOffCommand implements Command{

    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}
