package gr.aueb.cf.ch18.service.exceptions;

public class AccountAlreadyExistsException extends Exception {

    public AccountAlreadyExistsException() {
        System.out.println("Account already exists exception");
    }
}
