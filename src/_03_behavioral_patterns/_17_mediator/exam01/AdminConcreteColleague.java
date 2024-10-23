package _03_behavioral_patterns._17_mediator.exam01;

public class AdminConcreteColleague extends Colleague{

    public AdminConcreteColleague(String name) {
        super(name, ColleagueType.ADMIN);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("Admin can't receive messages");
    }
}
