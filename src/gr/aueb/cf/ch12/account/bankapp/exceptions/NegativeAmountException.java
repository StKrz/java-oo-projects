package gr.aueb.cf.ch12.account.bankapp.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 15467L;

    public NegativeAmountException() {
        super("Amount insufficient");
    }

    public NegativeAmountException(double amount) {
        super("Amount " + amount + " is not sufficient");
    }
}
