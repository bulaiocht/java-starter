package test;

import java.util.Scanner;

public class EngineCap {

   protected String engCap;

    void showMenu() {
        System.out.println("Choose capacity of engine: ");
        System.out.println("Enter 1 for: 1.6l");
        System.out.println("Enter 2 for: 2.0l");
        System.out.println("Enter 3 for: 3.0l");
        System.out.println("Enter 4 for: 125kW");
    }

    void eCap() {

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();

        switch (choice) {
            case 1:
                engCap = "1.6l";
                System.out.println("Well Done!!! Your capacity is 1.6l");
                break;
            case 2:
                engCap = "2.0l";
                System.out.println("Well Done!!! Your capacity is 2.0l");
                break;
            case 3:
                engCap = "3.0l";
                System.out.println("Well Done!!! Your capacity is 3.0l");
                break;
            case 4:
                engCap = "125kW";
                System.out.println("Well Done!!! Your capacity is 125kW");
                break;
        }
    }

    public String eCapReturn(){
        return engCap;
    }
}
