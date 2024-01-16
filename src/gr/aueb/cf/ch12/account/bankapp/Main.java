package gr.aueb.cf.ch12.account.bankapp;

import gr.aueb.cf.ch12.account.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch12.account.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.ch12.account.bankapp.exceptions.SsnNotValidException;
import gr.aueb.cf.ch12.account.bankapp.model.Account;
import gr.aueb.cf.ch12.account.bankapp.model.JointAccount;
import gr.aueb.cf.ch12.account.bankapp.model.OverdraftAccount;
import gr.aueb.cf.ch12.account.bankapp.model.User;

public class Main {

    public static void main(String[] args) throws NegativeAmountException {
        User user1 = new User("Stavros", "Krz", "123-31-3183");
        User user2 = new User("Nik", "Papas", "232-21-3128");

        Account account1 = new Account("GR1234567890", user1, 1000);
        Account account2 = new Account("GR0987654321", user2, 5000);

        try {
            account1.deposit(300);
            System.out.println(account1);

            account1.withdraw(500, "123-31-3183");
            System.out.println(account1);

            account2.deposit(1000);
            System.out.println(account2);

            account2.withdraw(50, "232-21-3128");
            System.out.println(account2);

            OverdraftAccount overdraftAccount1 = new OverdraftAccount("GR1234567890", user1, 1000);
            overdraftAccount1.withdraw(5000,"123-31-3183");
            System.out.println(overdraftAccount1);

            OverdraftAccount overdraftAccount2 = new OverdraftAccount("GR0987654321", user2, 1000);
            overdraftAccount2.withdraw(6000,"232-21-3128");
            System.out.println(overdraftAccount2);

            JointAccount jointAccount1 = new JointAccount(account1, user2);
            System.out.println(jointAccount1);

        } catch (NegativeAmountException | SsnNotValidException | InsufficientBalanceException e) {
            System.err.println("Error.Please Try again!");
        }
    }
}
