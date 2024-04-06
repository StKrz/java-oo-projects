package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.Account;
import java.util.List;

public interface IAccountDAO {

    Account newAccount(Account account);
    Account deposit(Account account, double amount);
    Account withdraw(Account account, double amount);
    Account getByIban(String iban);
    List<Account> getAll();
    boolean ibanExists(String iban);
    void updateBalance(Account account, double newBalance);
    boolean ibanIsNotExist(String iban);
    boolean isSsnValid(String iban, String ssn);
}