package test;


import java.util.Scanner;

public class Warranty {



    public static void readWarrentyBMW(){

        BMW orderBMW = new BMW();

        System.out.println("\nDo you want to read Warranty: Yes/No ?");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {
            case "Yes":
                orderBMW.warranty();
                break;
            case "No":
                break;
        }
    }
    public static void readWarrentyNissan(){

        Nissan orderNissan = new Nissan();
        System.out.println("\nDo you want to read Warranty: Yes/No ?");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {
            case "Yes":
                orderNissan.warranty();
                break;
            case "No":
                break;
        }
    }
    public static void readWarrentyTesla(){

        TESLA orderTesla = new TESLA();

        System.out.println("\nDo you want to read Warranty: Yes/No ?");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {
            case "Yes":
                orderTesla.warranty();
                break;
            case "No":
                break;
        }
    }
}
