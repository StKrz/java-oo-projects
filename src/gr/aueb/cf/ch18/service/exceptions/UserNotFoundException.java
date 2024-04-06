package gr.aueb.cf.ch18.service.exceptions;

public class UserNotFoundException extends Exception {

    private static final long serialVersionUID = 21312321L;

    public void UserNotFoundException() {
        System.out.println("User not found");
    }
}
