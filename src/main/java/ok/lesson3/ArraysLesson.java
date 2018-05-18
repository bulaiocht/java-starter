package ok.lesson3;


public class ArraysLesson {

    public static void main(String[] args) {

        //Create array
        int x [] = new int[5];
        x[0] = 3;
        x[1] = 6;
        x[2] = 10;
        x[3] = 12;
        x[4] = 5;


        //Running over array
        System.out.print("Output all elements of our array : ");

        for (int i = 0; i < x.length ; i++) {
            System.out.print("[" + x[i] + "]");
        }

        System.out.println();

       //Running over array in opposite order
        System.out.print("Output all elements of our array in opposite order: ");
        for (int i = x.length - 1; i >= 0 ; i--) {
            System.out.print("[" + x[i] + "]");
        }

        System.out.println();

       //Output All even numbers
        System.out.print("Output All even numbers : ");
        for (int i = 0; i < x.length ; i++) {
            if (x[i] % 2 == 0){
                System.out.print("[" + x[i] + "]");
            }
        }

        System.out.println();

        //Output sum of all elements of our array
        System.out.print("Output sum of all elements of our array: ");
        int sum = 0;
        for (int i = 0; i <x.length ; i++) {
           // sum = sum + x[i];
            sum += x[i];
        }
        System.out.println(sum);


        //Create new array
       int x2 [] = new int[5];
        x2[0] = 3;
        x2[1] = 6;
        x2[2] = 9;
        x2[3] = 12;
        x2[4] = 90;

        System.out.println();

        //Output the sum of first and last element of array
        System.out.print("Output the sum of first and last element of array: ");

        int sumFirstAndLast = 0;

        //How to inprove this code?
        for (int i = 0; i < x2.length; i++) {
            sumFirstAndLast = x2[0] + x2[x2.length - 1];
        }

        System.out.print(sumFirstAndLast);

        System.out.println();

//
//        // Alternative way to create an array
//        int mass [] = {4, 0, 7, 1, 3};
//
//       // Arrays length
//        System.out.println("Arrays length is " + mass.length);
//
//       // Running over array
//        System.out.print("Running over array : " );
//        for (int i = 0; i < mass.length ; i++) {
//            System.out.print(mass[i] + " ");
//        }
//
//        System.out.println();



        // Alternative way to create an array
        int mass [] = {4, 0, 7, 1, 3};


        //Reverse array
        for (int i = 0; i < mass.length / 2; i++) {

            int tmp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = tmp;

        }

        System.out.print("Result: ");

        for (int i = 0; i <mass.length ; i++) {
            System.out.print("[" + mass[i]+ "] ");
        }

        System.out.println();

        // Change first and last elements of array

            int tmp = mass[0];
            mass[0] = mass[mass.length - 1];
            mass[mass.length - 1] = tmp;

        System.out.print ("Result: ");
        for (int i = 0; i <mass.length ; i++) {
            System.out.print("[" + mass[i]+ "] ");
        }

        System.out.println();

        //Create new array with elements from first array + 3 new elements

       // Create place for new array
        int newTestArray [] = new int[mass.length + 3];
            newTestArray [0] = 2;
            newTestArray [1] = 3;
            newTestArray [2] = 34;
            newTestArray [3] = 76;
            newTestArray [4] = 12;

        for (int i = 0; i < newTestArray .length ; i++) {
            System.out.print(" [ " + newTestArray [i] + " ] ");
        }

        // Write elements from ok array into new array
        for (int i = 0; i < mass.length ; i++) {
            newTestArray [i] = mass[i];
        }
        System.out.println();

        //Output result
        System.out.print("Result of ok elements in new array: ");

        for (int i = 0; i <newTestArray .length ; i++) {
            System.out.print(" [ " + newTestArray [i] + " ] ");
        }
        System.out.println();


        //Write new elements into last fields
        for (int i = mass.length; i < newTestArray .length; i++) {
            if(newTestArray [i] == 0){
                newTestArray [i] = i + 2;
            }
        }

        //Output final result of new array
        System.out.print("Final result of new array: ");
        for (int i = 0; i <newTestArray.length ; i++) {
            System.out.print(" [ " + newTestArray[i] + " ] ");
        }

        int [] arr = new int[10];

        System.out.println();

        //Write of random numbers from 0 to 10 into array
        System.out.println("Array of random numbers: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random() * 11);
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }
}
