package ok.lesson11;

import lesson11.inheritance.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample {

    public static void main(String[] args) {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(int1);
        integerSet.add(int2);
        integerSet.add(int3);
        integerSet.add(int4);
        integerSet.add(int5);

        System.out.println(integerSet);

        System.out.println(integerSet.add(9));

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Ivan");
        student1.setSecondName("Ivanovich");
        student1.setAge(20);

        student2.setName("Oleg");
        student2.setSecondName("Olegovich");
        student2.setAge(25);

        student3.setName("Maksim");
        student3.setSecondName("Maksimovich");
        student3.setAge(18);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

        for (Student student: students) {
            System.out.println(student.getName() + " " + student.getSecondName() +
                    " " + student.getAge());
        }

        HashSet<String>countryHashSet = new HashSet<>();
        countryHashSet.add("США");
        countryHashSet.add("Кот-Д'Ивуар");
        countryHashSet.add("Франция");
        countryHashSet.add("Гондурас");
        countryHashSet.add("Кот-Д'Ивуар");


//          while (countryHashSet.iterator().hasNext())
//              System.out.println(countryHashSet.iterator().next());

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()
                    + ", ");
        }
    }
}
