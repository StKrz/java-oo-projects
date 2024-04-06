package gr.aueb.cf.ch18.dao;



import gr.aueb.cf.ch18.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private List<Account> accounts = new ArrayList<>();

    @Override
    public Account newAccount(Account account) {
        accounts.add(account);
        return account;
    }

    @Override
    public Account deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return account;
    }

    @Override
    public Account withdraw(Account account, double amount) {
        account.setBalance(account.getBalance() - amount);
        return account;
    }

    @Override
    public Account getByIban(String iban) {
        Optional<Account> account = accounts.stream()
                .filter(acc -> acc.getIban().equals(iban))
                .findFirst();
        return account.orElse(null);
    }

    @Override
    public List<Account> getAll() {
        return accounts;
    }

    @Override
    public boolean ibanExists(String iban) {
        if (accounts == null) {
            return false;
        }
        return accounts.stream().
                anyMatch(acc -> acc.getIban().equals(iban));
    }

    @Override
    public void updateBalance(Account account, double newBalance) {
        int index = 0;

        index = accounts.indexOf(account);
        account.setBalance(newBalance);
        accounts.set(index, account);
    }

    @Override
    public boolean ibanIsNotExist(String iban) {
        return accounts.stream()
                .noneMatch(account -> account.getIban().equals(iban));

    }

    @Override
    public boolean isSsnValid(String iban, String ssn) {
        return getByIban(iban).getHolder().getSsn().equals(ssn);
    }
}
