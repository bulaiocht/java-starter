package sorting;

import java.util.Random;

public class ObjectReferenceExample {
    public static void main(String[] args) {

        int [] first = {5, 5, 5, 5, 5};

        int [] second = {6, 6, 6, 6, 6};

        int [] tricky;

        tricky = first;

        printArray(first);

        printArray(second);

        printArray(tricky);

        int bound = 2;

        randomFill(tricky, bound);

        printArray(tricky);
        printArray(first);
    }

    private static void randomFill(int [] array, int bound){

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }

    }

    private static void printArray(int [] array){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length ; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) builder.append(",");
        }
        builder.append("]");
        System.out.println(builder.toString());
    }

}
