package Day3.Exc14;

public class Account {
    private int accountNumber;
    private int balance;
    private String accountHolder;

    public Account () {
        this.balance = 0;
        this.accountNumber = 000;
        this.accountHolder = "Unknown";
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setbalance(int balance) {
        this.balance = balance;
    }
    public int getbalance() {
        return balance;
    }
    public void setHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getHolder() {
        return accountHolder;
    }
    public int deposit (int adDeposit) {
        balance = balance + adDeposit;
        return balance;
    }
    public int withdraw (int reduceBalance) {
        balance = balance - reduceBalance;
        return balance;
    }

}
