package gr.aueb.cf.ch12.account.bankapp.model;

import gr.aueb.cf.ch12.account.bankapp.exceptions.SsnNotValidException;

/**
 * This class extends the class {@link Account} and allows {@link User} to
 * {@link #withdraw(double, String)} amount that are greater from their account's balance.
 *
 * @author stavr
 * @since 1.0
 * @version 2.0
 */
public class OverdraftAccount extends Account {

    /**
     * Initializes a new {@link  OverdraftAccount}
     * with default values.
     */
    public OverdraftAccount() {

    }

    /**
     * Initializes an Overdraft Account
     *
     * @param iban
     *              users iban.
     * @param holder
     *              user.
     * @param balance
     *              account's balance.
     */
    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    /**
     * Overrides the method withdraw to allow the withdrawals even if the balance
     * is insufficient. It firstly checks if the ssn is valid.
     *
     * @param amount
     *              the amount to be withdrawn.
     * @param ssn
     *              user's ssn.
     * @throws SsnNotValidException
     *              if ssn isn't valid.
     */
    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);
        } catch (SsnNotValidException e) {
            System.err.println("Error");
            throw e;
        }
    }
}
