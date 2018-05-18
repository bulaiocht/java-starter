package main.java.lesson5;

import java.util.Scanner;

/**
 * Created by Hillel Teacher on 21.04.2018.
 */
public class ConsoleReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int input = scanner.nextInt();
            System.out.println("your input is: " + input);
            if (input%2 == 0){
                System.out.println("you've typed even number. Bye!");
                scanner.close();
                break;
            }
        }
    }
}
