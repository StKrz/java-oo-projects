package gr.aueb.cf.ch18.service.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 15467L;

    public NegativeAmountException() {
        super("Amount Insufficient");
    }

    public NegativeAmountException(double amount) {
        super("Amount " + amount + " is not sufficient");
    }
}
