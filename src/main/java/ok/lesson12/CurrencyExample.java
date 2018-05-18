package ok.lesson12;

import java.util.Currency;
import java.util.Locale;


public class CurrencyExample {

    public static void main(String[] args) {

        Currency currency = Currency.getInstance(Locale.US);

//        System.out.println("The currency of United States is " +
//                currency.getCurrencyCode());

        CurrencyAccount ac = new CurrencyAccount (Locale.UK, 15000);

        ac.status();
        ac.withdraw(1000);
        ac.status();
        ac.deposit(5000);
        ac.status();
        ac.withdraw(100000);

    }
}
