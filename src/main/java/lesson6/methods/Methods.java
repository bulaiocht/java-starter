package lesson6.methods;

/**
 * Created by Hillel Teacher on 22.04.2018.
 */
public class Methods {

    public static void main(String[] args) {

        println("Hello, guys!");

    }

    static boolean isNegative(int number){
        return number <= 0;
    }

    static int println(String message){
        return message.length();
    }

    static boolean iDoNothing(){

        int d = 12;

        return d > 0;
    }


    static String brewCoffee(int money, String type){
        return "your coffee: " + type+ " is ready. Thank you for your " + money + "$";
    }
}
