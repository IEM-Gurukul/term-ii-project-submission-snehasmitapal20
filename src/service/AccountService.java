package service;

import model.*;
import repository.AccountRepository;

public class AccountService {

    private AccountRepository repo = new AccountRepository();

    public void createAccount(int accNo, String type) {
        Account acc;

        if (type.equalsIgnoreCase("savings")) {
            acc = new SavingsAccount(accNo);
        } else {
            acc = new CheckingAccount(accNo);
        }

        repo.saveAccount(acc);
        System.out.println("Account created successfully");
    }

    public void deposit(int accNo, double amount) {
        Account acc = repo.getAccount(accNo);

        if (acc == null) {
            System.out.println("Account not found");
            return;
        }

        acc.deposit(amount);
    }

    public void withdraw(int accNo, double amount) {
        Account acc = repo.getAccount(accNo);

        if (acc == null) {
            System.out.println("Account not found");
            return;
        }

        acc.withdraw(amount);
    }

    public void transfer(int from, int to, double amount) {
        Account sender = repo.getAccount(from);
        Account receiver = repo.getAccount(to);

        if (sender == null || receiver == null) {
            System.out.println("Invalid accounts");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        sender.withdraw(amount);
        receiver.deposit(amount);
    }

    public void checkBalance(int accNo) {
        Account acc = repo.getAccount(accNo);

        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }
}
