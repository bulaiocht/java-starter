package ok.test;

import java.util.Scanner;

public class ColorOfCar {
    protected String carColor;

    void showMenu() {
        System.out.println("Choose a color of the car: ");
        System.out.println("Enter 1 for: White");
        System.out.println("Enter 2 for: Black");
        System.out.println("Enter 3 for: Red");
        System.out.println("Enter 4 for: Green");
        System.out.println("Enter 5 for: Yellow");
    }

    void carColor1() {

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();

        switch (choice) {
                case 1:
                    carColor = "White";
                    System.out.println("You chose the white color");
                    break;
                case 2:
                    carColor = "Black";
                    System.out.println("You chose the black color");
                    break;
                case 3:
                    carColor = "Red";
                    System.out.println("You chose the red color");
                    break;
                case 4:
                    carColor = "Green";
                    System.out.println("You chose the green color");
                    break;
                case 5:
                    carColor = "Yellow";
                    System.out.println("You chose the yellow color");
                    break;
            }
    }

    public String carColor2(){
        return carColor;
    }
}
