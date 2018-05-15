package arrays;

import java.util.Arrays;

public class ArrayWalker {
    public static void main(String[] args) {

        int [] array = {10, 8, 16, 32, 4, 15, 7};

        int size = array.length;

        int [] array2 = new int [size];

        System.arraycopy(array, 0, array2, 0, size);

        System.out.println("Array one: " + Arrays.toString(array));
        System.out.println("Array two: " + Arrays.toString(array2));

    }
}
