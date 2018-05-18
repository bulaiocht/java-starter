package ok.lesson11;

import java.util.*;


public class LinkedListExample {

    public static void main(String[] args) {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        List<Integer> integerList = new LinkedList<>();
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);

        System.out.println(integerList);
        integerList.add(1);

        System.out.println(integerList);

        Iterator iterator = integerList.iterator();

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        if (iterator.hasNext())
        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println();
        ListIterator listIterator = integerList.listIterator();

        while (listIterator.hasNext())
            System.out.print(listIterator.next());
        System.out.println();

        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous());
    }
}
