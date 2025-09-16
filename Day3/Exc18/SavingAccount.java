package Day3.Exc18;
import Day3.Exc18.BankAccount;

public class SavingAccount extends BankAccount {
    public SavingAccount() {
        super();
    }
    @Override
    public void deposit(double valueD) {
        this.balance = this.balance + valueD + 1;
    }
    @Override
    public void withdraw(double valueW) {
        this.balance = this.balance - (valueW +2 );
    }
}
