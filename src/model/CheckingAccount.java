package model;

public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        // Allow overdraft up to -500
        if (balance - amount < -500) {
            System.out.println("Overdraft limit exceeded");
        } else {
            balance -= amount;
        }
    }
}