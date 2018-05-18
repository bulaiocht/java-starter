package lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArrayLesson {

    public static void main(String[] args) {
        //        int [] intArray = new int[4];
//
//        intArray[0] = 0;
//        intArray[1] = 1;
//        intArray[2] = 2;
//        intArray[3] = 3;

//        for (int i = 0; i < intArray.length; i++){
//            System.out.print("|" + intArray[i]);
//        }
//        System.out.println();
//
//        for (int element : intArray) {
//            System.out.print("|" + element);
//        }

//        System.out.println();

//
//        int [] intArray2 = {1,5,8,6,3,7,15,2,9,13};
//
//        long [] longArray;
//
//        byte [] bytes;
//
//        short [] shorts;
//
//        String [] strings;
//
//        ArrayLesson [] lessons;
//
//        int [][] matrix;
//
//        int number = intArray2[0];

//        System.out.println(number);


        int  [] array = new int [10];

        for (int i = 0; i <= array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int [] randomArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101);
        }

        //int result = isInArray(randomArray, 50);
        //System.out.println(Arrays.toString(randomArray));
        //System.out.println(result);
        //evenReWriter(randomArray);
        System.out.println(Arrays.toString(randomArray));

        //swapElements(randomArray, 5, 2);

        //System.out.println(Arrays.toString(randomArray));

        bubbleSort(randomArray);

        Arrays.sort(randomArray);

        System.out.println(Arrays.toString(randomArray));

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

    static int isInArray(int [] array, int number){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return i;
            }
        }

        return -1;
    }

    static void evenReWriter(int [] array){

        for (int i = 0; i < array.length; i++) {

            if (array[i]%2 != 0){
                int temp = array[i];
                ++temp;
                array[i] = temp;
            }
        }

    }




}
