package gr.aueb.cf.ch18.service;


import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.service.exceptions.*;

import java.util.List;

public interface IAccountService {
    Account newAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException;
    Account deposit(String iban , double amount) throws AccountNotFoundException, NegativeAmountException;
    void withdraw(String iban, String ssn, double amount)
            throws AccountNotFoundException, NegativeAmountException,
            InsufficientBalanceException, SsnNotValidException;

    Account getAccountByIban(String iban) throws AccountNotFoundException;

    List<Account> getAll();
}
