package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetExample {
    public static void main(String[] args) {
        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(int1);
        integerSet.add(int2);
        integerSet.add(int3);
        integerSet.add(int4);
        integerSet.add(int5);


        System.out.println(integerSet.add(9));

        System.out.println(integerSet);

        Set<String> countryHashSet = new LinkedHashSet<>();
        countryHashSet.add("США");
        countryHashSet.add("Кот-Д'Ивуар");
        countryHashSet.add("Франция");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар");

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()
                    + ", ");
        }
    }
}
