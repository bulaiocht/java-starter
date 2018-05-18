package main.java.lesson8;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Hillel Teacher on 4/29/2018.
 */
public class Algorithms {
    public static void main(String[] args) {

//        int [] randomArray = {7,4,13,25,6,8};
//
////        fillWithRandom(randomArray, 51);
//
//        printArray(randomArray);
//
//        //bubbleSort(randomArray);
//
//        insertionSort(randomArray);
//        printArray(randomArray);
//
//        int find = 13;
//
//        int result = linearSearch(randomArray, find);
//
//        System.out.println("Linear: " + result);
//
//        int binaryResult = binarySearch(randomArray, 13);
//
//        System.out.println("Binary: " + result);
//        hw();

        int [] array = new int[10];

        fillWithRandom(array, 31);

        int even = findEven(array);

        System.out.println("\n Number of even elements: " + even);
    }

    private static int binarySearch(int[] array, int number) {

        int start = 0;
        int end = array.length - 1;

        while (start<=end){
            int middle = (start + end)/2;
            if (number == array[middle]) {
                return middle;
            } else if (number > array[middle]){
                start = middle + 1;
            } else {
                end = middle -1;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] array, int find) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) return i;
        }
        return -1;
    }


    private static void insertionSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int count = i;
            while (count > 0){

                if(array[count]<array[count-1]){
                    swapElements(array, count, count-1);
                } else break;

                count--;
            }
        }
    }

    private static void bubbleSort(int[] randomArray) {

        int counter = 0;

        int n = randomArray.length;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n-i; j++) {

                if (randomArray[j-1] > randomArray[j]){
                    swapElements(randomArray, j-1, j);
                }
                counter++;
            }

            counter++;
        }
    }

    static void swapElements(int[] randomArray, int to, int from) {
        int temp = randomArray[to];
        randomArray[to] = randomArray[from];
        randomArray[from] = temp;
    }

    static void fillWithRandom(int [] array, int bound){

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }

    }

    static void printArray(int [] array){
        System.out.println(Arrays.toString(array));
    }

    static void hw(){

        int a[] = {5,1,7,10,6,90,54,27,55,88,93};
        int even = 0;

        System.out.println( "Even numbers:" );

        for ( int i = 0; i <a.length; i++ )
        {
            if ( a[i] % 2 != 0 )

            {
                ++even;
                System.out.print( " " + a[i] );
            }
        }
    }

    static int findEven(int [] array){

        int even = 0;

        System.out.println( "Even numbers:" );

        for ( int i = 0; i <array.length; i++ )
        {
            if ( array[i] % 2 == 0 ) {
                ++even;
                System.out.print( " " + array[i] );
            }
        }

        return even;
    }
}
