package gr.aueb.cf.ch18.dto;

public class DepositDTO {
    private String iban;
    private UserDTO userDTO;
    private double balance;

    public DepositDTO() {
    }

    public DepositDTO(String iban, UserDTO userDTO, double balance) {
        this.iban = iban;
        this.userDTO = userDTO;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
