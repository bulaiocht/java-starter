package lesson2;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(String.valueOf(random.nextInt(10)+20));
    }
}
