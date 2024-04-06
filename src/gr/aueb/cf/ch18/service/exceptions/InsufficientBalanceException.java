package gr.aueb.cf.ch18.service.exceptions;

public class InsufficientBalanceException extends Exception {

    private static final long serialVersionUID = 131231L;

    public InsufficientBalanceException(double balance, double amount) {
        System.out.println("Insufficient balance: " + balance + " for amount " + amount);
    }
}
