package _03_behavioral_patterns._13_chain_of_responsibilities.exam01;

public class Withdraw50000Won implements WithdrawChain{

    private WithdrawChain withNextChain;


    @Override
    public void setNextChain(WithdrawChain withNextChain) {
        this.withNextChain = withNextChain;
    }

    @Override
    public void withdraw(Currency currency) {
        if (currency.getAmount() >= 50000) {
            int num = currency.getAmount()/50000;
            int remain = currency.getAmount() % 50000;
            System.out.println("5만원 " + num + "장이 인출되었습니다.");
            if (remain != 0) this.withNextChain.withdraw(new Currency(remain));
        } else {
            this.withNextChain.withdraw(currency);
        }
    }
}
