package gr.aueb.cf.ch12.account.bankapp.exceptions;

public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 1L;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance" + balance + " for amount " + amount);
    }
}
