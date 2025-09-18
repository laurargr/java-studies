package Day2.Exc7;

public class Account {
    public int accountNumber;
    public int balance;

    public Account(int accountNumbert, int balancet) {
        if (balancet <= 0) {
            System.out.println("please set a value to balance");
            return;
        }
        if (accountNumbert <= 0) {
            System.out.println("please set a value to account");
            return;
        }
        this.accountNumber = accountNumbert;
        this.balance = balancet;
    }

}
