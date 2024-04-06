package gr.aueb.cf.ch18.service;


import gr.aueb.cf.ch18.dao.IAccountDAO;
import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.dto.UserDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.exceptions.*;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private IAccountDAO accountDAO;

    public AccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account newAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException {
        Account account;
        User user;
        UserDTO userDTO = new UserDTO();

        try {
            account = findFromAccountDTO(accountDTO);
            user = findFromUserDTO(userDTO);
            if (!accountDAO.ibanExists(account.getIban())) {
                throw new AccountAlreadyExistsException();
            }
            return accountDAO.newAccount(account);
        } catch (AccountAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account deposit(String iban, double amount) throws AccountNotFoundException, NegativeAmountException {
        Account account;

        try {
            account = accountDAO.getByIban(iban);

            if (!accountDAO.ibanExists(account.getIban())) {
                throw new AccountNotFoundException();
            }
            if (!accountDAO.isSsnValid(iban, account.getHolder().getSsn())) {
                throw new AccountNotFoundException();
            }
            if (amount < 0) {
                throw new NegativeAmountException();
            }
            return accountDAO.deposit(account,amount);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void withdraw(String iban, String ssn, double amount) throws AccountNotFoundException, NegativeAmountException,
            InsufficientBalanceException, SsnNotValidException {
        if (iban == null || ssn == null) return;

        double currentBalance;
        double newBalance;

        try {
            if (accountDAO.ibanIsNotExist(iban)) {
                throw new AccountNotFoundException();
            }
            if (!accountDAO.isSsnValid(iban, ssn)) {
                throw new SsnNotValidException(ssn);
            }
            if (amount < 0) {
                throw new NegativeAmountException();
            }
            currentBalance = accountDAO.getByIban(iban).getBalance();
            if (currentBalance < amount) {
                throw new InsufficientBalanceException(currentBalance, amount);
            }
            newBalance = currentBalance + amount;
            accountDAO.updateBalance(accountDAO.getByIban(iban), amount);
        } catch (InsufficientBalanceException |
                 AccountNotFoundException |
                 SsnNotValidException |
                 NegativeAmountException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account getAccountByIban(String iban) throws AccountNotFoundException {
        Account account;

        try {
            account = accountDAO.getByIban(iban);
            if (account == null) {
                throw new AccountNotFoundException();
            }
            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Account> getAll() {
        return accountDAO.getAll();
    }

    private User findFromUserDTO(UserDTO userDTO) {
        return new User(userDTO.getFirstname(), userDTO.getLastname(), userDTO.getSsn());
    }

    private Account findFromAccountDTO(AccountDTO accountDTO){
        User user = findFromUserDTO(accountDTO.getUserDTO());
        return new Account(accountDTO.getIban(), user, accountDTO.getBalance());
    }
}
