package Day3.Exc18;

public class BankAccount {
    protected double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double valueD) {
        this.balance = valueD + balance;
    }
    public void withdraw(double valueW) {
        this.balance = this.balance - valueW;
    }

    public void showBalance () {
        System.out.println(this.balance);
    }
}
