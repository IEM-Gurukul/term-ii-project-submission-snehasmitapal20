package model;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Savings: Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}
