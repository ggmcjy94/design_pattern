package _03_behavioral_patterns._17_mediator.exam01;

public class SystemConcreteColleague extends Colleague{

    public SystemConcreteColleague(String name) {
        super(name, ColleagueType.SYSTEM);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("System can't receive messages");
    }
}
