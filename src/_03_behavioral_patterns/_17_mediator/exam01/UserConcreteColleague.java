package _03_behavioral_patterns._17_mediator.exam01;

public class UserConcreteColleague extends Colleague{

    public UserConcreteColleague(String name) {
        super(name, ColleagueType.USER);
    }

    @Override
    public void receive(Colleague colleague) {
        if (ColleagueType.SYSTEM == colleague.getType()) {
            System.out.print(" [SYSTEM] ");
        } else if (ColleagueType.USER == colleague.getType()) {
            System.out.print("[" + colleague.getName() + "] ");
        }
        System.out.println(colleague.getMessage());
    }
}
