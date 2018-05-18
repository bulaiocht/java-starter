package lesson2;

import java.util.Scanner;

public class WhileAndFor {

    public static void main(String[] args) {

       int i = 0;

        String firstString = "First";
        String secondString = "Second";
        String thirdString = "Third";
        String fourthString = "Fourth";
        String fifthString = "Fifth";

        while (i < 5){
            if (i == 0) {
                System.out.println(firstString + " Test.txt and i = " + i);
            }else if (i == 1){
                System.out.println(secondString + " Test.txt and i = " + i);
            }else if (i == 2){
                System.out.println(thirdString + " Test.txt and i = " + i);
            }else if (i == 3){
                System.out.println(fourthString + " Test.txt and i = " + i);
            }else {
                System.out.println(fifthString + " Test.txt and i = " + i);
            }
                i++;
        }

        // Initialize Scanner object
        Scanner scan = new Scanner("Anna Mills/Female/18");
        // initialize the string delimiter
        scan.useDelimiter("/");
        // Printing the tokenized Strings
        while(scan.hasNext())
            System.out.println(scan.next());

        // closing the scanner stream
        scan.close();


        int qwerty = 0;

        do {
            System.out.println("Do WhileAndFor Test.txt");
            qwerty++;
        } while (qwerty < 5);


        int q = 0;

        String win = "You Win!";

        while (q < 5) {
            System.out.println("This is While Lottery");

            if (q > 2 && q < 4) {
                System.out.println(win);
                break;
            } else {
                System.out.println("Try another day!");
            }
            q++;
        }

        int winnerNumber = 0;
        int winnerRate = 3;
        String winner = "You Win!";

        do {

            System.out.println("This is Do While Lottery");

                if (winnerNumber > winnerRate && winnerNumber < winnerRate + 2) {
                    System.out.println(winner);
                    break;
                }

            winnerNumber++;
        } while (winnerNumber < 10);


        for (int j = 0; j < 3; j++) {
            System.out.println("This is " + j);
        }

        int k;

        for (k = 5; k > 0 ; k--) {
            System.out.println("This is new " + k);
        }

        System.out.println(k);


        String str = "Java";
        System.out.println(str);

        for (int j = 1; j < str.length(); j++) {
            System.out.print("_");
        }
    }
}
