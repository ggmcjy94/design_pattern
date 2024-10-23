package _03_behavioral_patterns._17_mediator.exam01;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueUser1 = new UserConcreteColleague("User1");
        Colleague colleagueUser2 = new UserConcreteColleague("User2");
        Colleague colleagueSystem = new SystemConcreteColleague("System");
        Colleague colleagueAdmin = new AdminConcreteColleague("Admin");
        colleagueUser1.setMediator(mediator);
        colleagueUser2.setMediator(mediator);
        colleagueSystem.setMediator(mediator);
        colleagueAdmin.setMediator(mediator);
        mediator.addColleague(colleagueUser1);
        mediator.addColleague(colleagueUser2);
        mediator.addColleague(colleagueSystem);
        mediator.addColleague(colleagueAdmin);
        colleagueUser1.setMessage("안녕하세요. User1이 보낸 메시지 입니다.");
        colleagueUser1.send();
        colleagueUser2.setMessage("안녕하세요. User2가 보낸 메시지 입니다.");
        colleagueUser2.send();
        colleagueSystem.setMessage("잠시 후 20분 뒤에 점검이 있습니다.");
        colleagueSystem.send();
    }
}
