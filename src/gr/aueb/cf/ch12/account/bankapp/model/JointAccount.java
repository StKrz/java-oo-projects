package gr.aueb.cf.ch12.account.bankapp.model;

import gr.aueb.cf.ch12.account.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch12.account.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.ch12.account.bankapp.exceptions.SsnNotValidException;

/**
 * This class extends the class {@link IdentifiableEntity} to check user's id.
 * It allows an {@link Account} to have a {@link #secondHolder}.
 *
 * @author stavr
 * @since 1.0
 * @version 2.0
 */
public class JointAccount extends IdentifiableEntity {
    private Account account;
    private User secondHolder;

    /**
     * Initializes a new {@link  JointAccount}
     * with default values.
     */
    public JointAccount() {

    }

    /**
     * Initializes an Overdraft Account
     *
     * @param account
     *              users account.
     * @param secondHolder
     *              represents the second holder-user of the account.
     */
    public JointAccount(Account account, User secondHolder) {
        this.account = account;
        this.secondHolder = secondHolder;
    }

    public JointAccount(Account account1, User user1, User user2) {
        super();
    }

    /**
     * Gets the account.
     *
     * @return the value of account.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the account.
     *
     * @param account
     *              the value of account.
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Gets the second holder.
     *
     * @return the value of secondHolder.
     */
    public User getSecondHolder() {
        return secondHolder;
    }

    /**
     * Sets the secondHolder.
     *
     * @param secondHolder
     *              the value of second holder.
     */
    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    /**
     * Overrides the method toString.
     * Returns the state of {@link JointAccount} instance
     * as a {@link String}.
     *
     * @return
     *      a string representing a {@link JointAccount}
     *      instance.
     */
    @Override
    public String toString() {
        return "JoinAccount{" +
                "account=" + account +
                ", secondHolder=" + secondHolder +
                '}';
    }

    /**
     * It allows account's holders to deposit an amount of money
     * to the account.
     *
     * @param amount
     *              the amount of money to be deposited.
     * @throws NegativeAmountException
     *              throws exception if the amount is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        account.deposit(amount);
    }

    /**
     * It allows account's holders to withdraw an amount of money
     * from the account.
     *
     * @param amount
     *              the amount of money to be withdrawn.
     * @param ssn
     *              holder's ssn.
     * @throws InsufficientBalanceException
     *              throws exception when the balance is insufficient.
     * @throws SsnNotValidException
     *              throws exception when the ssn is not valid.
     */
    public void  withdraw(double amount, String ssn)
            throws InsufficientBalanceException, SsnNotValidException {
        if (secondHolder.getSsn().equals(ssn)) {;
            account.setHolder(secondHolder);
        }
        account.withdraw(amount, ssn);
    }
}

