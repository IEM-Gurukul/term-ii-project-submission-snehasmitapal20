package repository;

import java.util.HashMap;
import model.Account;

public class AccountRepository {

    private HashMap<Integer, Account> accounts = new HashMap<>();

    public void saveAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accNo) {
        return accounts.get(accNo);
    }
}
