package gr.aueb.cf.ch12.account.bankapp.model;

import gr.aueb.cf.ch12.account.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch12.account.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.ch12.account.bankapp.exceptions.SsnNotValidException;

public class Account extends IdentifiableEntity {
    private  String iban;
    private User holder;
    private  double balance;

    public Account() {

    }

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(Account account) {
        iban = account.getIban();
        holder = account.getHolder();
        balance = account.getBalance();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    /*
     * Public API
     */
    public void deposit(double amount) throws NegativeAmountException{
        try {
            if (amount < 0) {
                throw new NegativeAmountException();
            }
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println("Negative Amount Exception");
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;
        } catch (InsufficientBalanceException | SsnNotValidException e) {
            System.err.println("Error");
            throw e;
        }
    }

    protected boolean isSsnValid(String ssn) {
        if (ssn == null || getHolder().getSsn() == null) return false;
        return getHolder().getSsn().equals(ssn);
    }
}
