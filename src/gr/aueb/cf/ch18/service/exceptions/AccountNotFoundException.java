package gr.aueb.cf.ch18.service.exceptions;

public class AccountNotFoundException extends Exception {

    private static final long serialVersionUID = 12321312L;

    public AccountNotFoundException() {
        System.out.println("Account not found.");
    }
}
