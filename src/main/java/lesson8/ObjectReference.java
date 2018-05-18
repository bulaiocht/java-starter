package main.java.lesson8;

import java.util.Arrays;

public class ObjectReference {

    public static void main(String[] args) {

//        int a = 8;
//
//        int b = 9;
//
//        int c = a;
//
//        c += 3;
//
//        System.out.println(c);
//
//        System.out.println(a);
//        int [] first = {1,2,3,4,5};
//
//        int [] second;
//
//        second = first;
//
//        int length = first.length;
//
//        for (int i = 0; i < second.length; i++) {
//            second[i] = 0;
//        }.

        int [] first = {2,2,2,2};

        int [] second = {1,1,1,1};

//        int [] temp = first;
//
//        first = second;
//
//        second = temp;

        int [] third = new int[first.length];

        System.arraycopy(first, 0, third, 0, first.length);

        System.out.println(Arrays.toString(first));

        System.out.println(Arrays.toString(third));

//        int a = 0;
//
//        int b = 1;
//
//        manipulate(a, b);
//
//        System.out.println(a);
//
//        System.out.println(b);

    }

    static void swapArrays(int [] first, int [] second){

        int [] temp = first;

        first = second;

        second = temp;

    }

    static void manipulate(int a, int b){

        a++;
        b++;

    }

}
