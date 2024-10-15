package _03_behavioral_patterns._13_chain_of_responsibilities.exam01;

public interface WithdrawChain {
    void setNextChain(WithdrawChain withNextChain);
    void withdraw(Currency currency);
}
