package gr.aueb.cf.ch12.account.bankapp.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = 1L;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + " not valid");
    }
}
