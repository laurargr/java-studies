package Day3.Exc18;
import Day3.Exc18.BankAccount;

public class ChekingAccount extends BankAccount {
    public ChekingAccount() {
        super();
    }

    @Override
    public void deposit(double valueD) {
        this.balance = this.balance + valueD;
        System.out.println(" using your saving account you could gain 1 euro ");
    }
    @Override
    public void withdraw(double valueW) {
        this.balance = this.balance - (valueW + 1.5);
    }

}
