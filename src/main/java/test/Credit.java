package test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Credit {

    static BigDecimal monthCreditPayment;

    public static BigDecimal creditForYear(Double totalSum) {
        Double tmp = (totalSum / 12) + (totalSum * 0.02);
        BigDecimal monthPayment = new BigDecimal(tmp);
        monthPayment = monthPayment.setScale(2, BigDecimal.ROUND_HALF_UP);
        return monthPayment;
    }

    public static BigDecimal creditForFiveYears(Double totalSum) {
        Double tmp = (totalSum / 60) + (totalSum * 0.02);
        BigDecimal monthPayment = new BigDecimal(tmp);
        monthPayment = monthPayment.setScale(2, BigDecimal.ROUND_HALF_UP);
        return monthPayment;
    }

    public static BigDecimal creditForTenYears(Double totalSum) {
        Double tmp = (totalSum / 120) + (totalSum * 0.02);
        BigDecimal monthPayment = new BigDecimal(tmp);
        monthPayment = monthPayment.setScale(2, BigDecimal.ROUND_HALF_UP);
        return monthPayment;
    }
    protected static void showMenu() {
        System.out.println("You can issue three types of loans: ");
        System.out.println("Enter 1 - a loan for a year");
        System.out.println("Enter 2 - a loan for 5 years");
        System.out.println("Enter 3 - a loan for 10 years");
    }

    protected static void typeOfCredit(Double totalSum) {

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You've issued a loan for a year");
                monthCreditPayment = creditForYear(totalSum);
                break;
            case 2:
                System.out.println("You've issued a loan for 5 years");
                monthCreditPayment = creditForFiveYears(totalSum);
                break;
            case 3:
                System.out.println("You've issued a loan for 10 years");
                monthCreditPayment = creditForTenYears(totalSum);
                break;
        }
    }
}


