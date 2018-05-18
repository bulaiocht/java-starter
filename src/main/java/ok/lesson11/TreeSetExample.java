package lesson11;

import java.util.*;

/**
 * Created by admin on 12.11.2016.
 */
public class TreeSetExample {
    public static void main(String[] args) {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;
        Integer int6 = 9;

        List<Integer> list = new ArrayList<>();
        list.add(int1);
        list.add(int2);
        list.add(int3);
        list.add(int4);
        list.add(int5);
        list.add(int6);

        Set<Integer> integerSet = new TreeSet<>(list);
//
//        integerSet.add(int1);
//        integerSet.add(int2);
//        integerSet.add(int3);
//        integerSet.add(int4);
//        integerSet.add(int5);
//
//        System.out.println(integerSet.add(9));

        System.out.println(integerSet);


        Random random = new Random();
        SortedSet<Integer> numberSet = new TreeSet<>();

        Integer randomInt = null;
        for(int i = 0; i < 30; i++) {
            randomInt = random.nextInt(10);
            System.out.print(randomInt);
            numberSet.add(randomInt);
        }
        System.out.println();

        System.out.println(numberSet.toString());

        System.out.println(numberSet.first());

        System.out.println(numberSet.last());

       System.out.println(numberSet.subSet(0,5));

        System.out.println(numberSet.tailSet(5));

        numberSet.clear();

        System.out.println(numberSet);

    }

}
