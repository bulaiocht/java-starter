package ok.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListExample {

    public static void main(String[] args) {

        String str1 = "First";
        String str2 = "Second";
        String str3 = "Third";
        String str4 = "Forth";
        String str5 = "Fifth";

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        List<String> stringList = new ArrayList<>();
        stringList.add(str1);
        stringList.add(str5);
        stringList.add(str3);
        stringList.add(str2);
        stringList.add(str4);
        stringList.add(str5);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        for (int i = 0; i <stringList.size() ; i++) {
            System.out.println(stringList.get(i));
        }


        for (String string: stringList) {
            System.out.println(string);
        }

        System.out.println();

        System.out.println(stringList.get(2));

        System.out.println(stringList.size());

        stringList.remove(1);

        System.out.println(stringList);

        stringList.add(stringList.size(), "Zero");

        System.out.println(stringList);

        stringList.set(3, "Hello");

        System.out.println(stringList);

       System.out.println(integerList);

        integerList.set(4, null);

        System.out.println(integerList);

       ///////////////////////////////////

        List<Integer> newInt = new ArrayList<>();

        newInt.add(60);
        newInt.add(100);

        integerList.addAll(1 ,newInt);
        System.out.println(integerList);

        student1.setName("Ivan");
        student1.setSecondName("Ivanovich");
        student1.setAge(20);

        student2.setName("Oleg");
        student2.setSecondName("Olegovich");
        student2.setAge(25);

        student3.setName("Maksim");
        student3.setSecondName("Maksimovich");
        student3.setAge(18);

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSecondName() +
                    " " + student.getAge());
        }

        Integer x = 3;
        Integer x1 = 8;
        Integer x2 = 19;
        Integer x3 = 4;
        Integer y = -5;
        Integer y1 = -17;
        Integer y2 = -9;
        Integer y3 = -11;

        List<Integer> listInt = new ArrayList<>();
        listInt.add(x);
        listInt.add(x1);
        listInt.add(x2);
        listInt.add(x3);
        listInt.add(y);
        listInt.add(y1);
        listInt.add(y2);
        listInt.add(y3);

       System.out.println(listInt);


        TreeSet <Integer> treeSet = new TreeSet<>();

        System.out.println(treeSet);

        List listX = new ArrayList();
        listX.add(5);
        listX.add("qwerty");
        listX.add(6);
        System.out.println(listX);























//////////////////////////////////////////

    /*    for(int i = listInt.size()-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
        /*        if (listInt.get(i) > listInt.get(j + 1)) {
                    int tmp = listInt.get(j);
                    listInt.set(i, listInt.get(j + 1));
                    listInt.set(j + 1, tmp);
                }
            }
        }
            System.out.println(listInt);
*/
    }


    }

