import java.util.Scanner;

abstract class Bank {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected String status;

    public Bank(String accountNumber, String accountHolderName, double balance, String status) {
        this.accountNumber = accountNumber;
        this.accountHolderName =accountHolderName;
        this.balance = balance;
        this.status =status;
    }

    public abstract void debit(double amount);
    public abstract void credit(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends Bank {
    public SavingAccount(String accountNumber, String accountHolderName, double balance, String accountStatus) {
        super(accountNumber, accountHolderName, balance, accountStatus);
        
  