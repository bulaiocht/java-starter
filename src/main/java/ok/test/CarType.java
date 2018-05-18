package test;

import java.util.Scanner;

public class CarType {

   protected String carT;

    protected void showMenu() {
        System.out.println("What type of car do U want?");
        System.out.println("Enter 1 for sedan");
        System.out.println("Enter 2 for jeep");
        System.out.println("Enter 3 for hatchback");
    }


    protected void cType() {

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        switch (choice) {
            case 1:
                carT = "Sedan";
                System.out.println("Your type is sedan");
                break;
            case 2:
                carT = "Jeep";
                System.out.println("Your type is jeep");
                break;
            case 3:
                carT = "Hatchback";
                System.out.println("Your type is hatchback");
                break;
        }
    }

    public String cType2() {
        return carT;
    }
}
