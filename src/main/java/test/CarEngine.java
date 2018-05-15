package test;
import java.util.Scanner;


public class CarEngine {

    protected String engType;

    void showMenuFuel() {
        System.out.println("OK! What type of engine: ");
        System.out.println("Enter 1 for Diesel");
        System.out.println("Enter 2 for Gasoline");
        System.out.println("Enter 3 for Electrical");
    }


    void eTypeFuel() {

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        switch (choice) {
            case 1:
                engType = "Diesel engine";
                System.out.println("Your engine type is diesel");
                break;
            case 2:
                engType = "Gas engine";
                System.out.println("Your engine type is petrol");
                break;
            case 3:
                engType = "Electrical engine";
                System.out.println("Your engine type is electric");
        }
    }

    public String eTypeFuelReturn(){
        return engType;
    }
}
