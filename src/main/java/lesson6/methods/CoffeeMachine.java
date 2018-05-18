package lesson6.methods;

import java.util.Scanner;

/**
 * Created by Hillel Teacher on 22.04.2018.
 */
public class CoffeeMachine {

    public static void main(String[] args) {
        System.out.println(brewCoffee());

        //recursiveMethod(12);

        OurNewType ourNewType = giveNewType();
        ourNewType.helloFromNewType();

    }

    static String brewCoffee(){

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please choose the coffee type");

            while (scanner.hasNext()) {
                String type = scanner.next();
                if (checkCoffeeType(type)) {
                    System.out.println("Success!");
                    scanner.close();
                    break;
                }
            }
            break;
        }
        return "Here is your coffee. Bye!";
    }

    static boolean checkCoffeeType(String type){

        boolean isPresent = false;

        switch (type){
            case "Americano":
                isPresent = true;
                break;
            case "Latte":
                isPresent = true;
                break;
            case "Espresso":
                isPresent = true;
                break;
            default:
                System.out.println("No such type");
                break;
        }
        return isPresent;
    }

    static void recursiveMethod(int number){
        if (number >= 0){
            System.out.println(number);
            recursiveMethod(--number);
        }
    }

    static OurNewType giveNewType(){
        return new OurNewType();
    }

}

class OurNewType {

    public void helloFromNewType(){
        System.out.println("Hello from new type");
    }

}
