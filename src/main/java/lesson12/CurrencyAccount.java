package lesson12;

import java.util.Currency;
import java.util.Locale;

public class CurrencyAccount {

    private Locale locale;
    private int amount;
    private Currency c;

    /**
     *
     * @param locale
     * @param amount
     */
    public CurrencyAccount(Locale locale, int amount) {
        this.locale = locale;
        this.amount = amount;
        this.c = Currency.getInstance(locale);
    }

    public int getAmount() {
        return amount;
    }

    public Locale getLocale() {
        return this.locale;
    }

    /**
     * outputs amount sum status of account
     */
    public void status() {
        System.out.println(amount + " " + c.getCurrencyCode()+" in the account");
    }

    /**
     * inserts new deposit sum
     * @param deposit
     */
    public void deposit(int deposit) {
        amount += deposit;
        System.out.println(deposit + " " + c.getCurrencyCode()+" deposited");
        System.out.println("Total amount now is: " + amount + " " + c.getCurrencyCode());
    }

    /**
     * withdraw some sum from account
     * @param w
     */
    public void withdraw(int w) {
        if (w <= amount) {
            amount -= w;
            System.out.println(w + " " + c.getCurrencyCode()+" withdrawed");
            System.out.println("Total amount now is: " + amount + " " + c.getCurrencyCode());
        } else {
            System.out.println("You can't withdraw  "+ w +" "+ c.getCurrencyCode()+"!");
            System.out.println("Your total amount is: " + amount + " " + c.getCurrencyCode());
        }
    }
}
