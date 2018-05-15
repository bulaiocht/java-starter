package lesson1;

//http://docs.robovm.com/
//https://software.intel.com/en-us/multi-os-engine/
//J2ObjC - Google

public class Operators {

    public static void main(String[] args) {

        int x = 5;
        int y = x + 7;

        System.out.println(y);


        // y = y + x;  y+=x;
        y += x;

        System.out.println(y);

        int test = 10;

        //Prefix increment
        ++test;

        //Suffix increment
        test++;

        //Prefix decrement
        --test;

        //Suffix decrement
            test--;

        int a = 3; int b = 3;

        int testPre = 15 / 3 + ++a + ++a;
        System.out.println(testPre);

        System.out.println("testPre = " + testPre);

        int testPost = 15/3 + b++ + b++;
        System.out.println("testPost = " + testPost + "" + "but b now is " + b);

        int testNew = 15/3 + b;

        System.out.println(testNew);


        int increment = 3; int decrement = 3;
        increment =  (5 + ++increment) + increment++;
        System.out.println("Increment result: " + increment);

        System.out.println("Decrement sum result: " + (--decrement + decrement--));
        System.out.println("Decrement result " + decrement);

        int q = 10;

        /*Modulo operation
        Деление c остатком (деление по модулю)
        Числа остаток от деления на 2 == 0 - парные, иначе непарные!
         */
        System.out.println(q % 3);
        System.out.println(q % 2);

        int x1 = 4;
        int q1 = 8;
        int y1 = 6;

        if (x1 > q1 || y1 > x1){
            System.out.println("Hello");
        }else{
            System.out.println("World");
        }

        if (x1 > q1 || y1 > x1)
            System.out.println("Hello");
        else
            System.out.println("World");

        //Ternary operator
        String str;
        System.out.println(str = (x1 > q1)? "Hello" : "World");

        int month = 7;

        if (month == 12 || month == 1 || month == 2){
            System.out.println("Winter");
        }else if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }else if (month == 6 || month == 7 || month == 8){
            System.out.println("Summer");
        }else if (month == 9 || month == 10 || month == 11){
            System.out.println("Autumn");
        } else {
            System.out.println("There is no such month number");
        }


        int first = 10; int second = 20; int third = 5;

        if(first >= second && first >= third) {
            System.out.println("First one is bigger one!");
        }else if(first == second){
            System.out.println("First equals Second!");
        }else if(second > third){
            System.out.println("Second one is bigger one!");
        }else {
            System.out.println("Third one is bigger one!");
        }

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        Boolean bool = new Boolean("true");
        System.out.println(bool);

        Character xz = 'c';
        System.out.println("?" + Character.isLowerCase(xz));

        int increment1 = 5;
        int decrement1 = 6;
        int test1;

        test1 = --decrement1 + ++increment1 + increment1++;
        System.out.println(test1);

        increment1 = --decrement1 + ++increment1 + increment1++;
        System.out.println(increment1);

    }
}
