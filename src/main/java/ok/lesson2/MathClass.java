package ok.lesson2;


public class MathClass {

    public static void main(String[] args) {

        int x = 5;

        int y = 10;

        double q = -132;

        double c = 123.424343;

        System.out.println("Выводим 5 в степени 10: " + (int)Math.pow(x, y));

        // Returns max value of two numbers
        System.out.println(Math.max(x, y));

        // Returns absolute value
        System.out.println(Math.abs(x));

        System.out.println(Math.abs(q));

        System.out.println(Math.min(x, y));

        System.out.println(Math.round(c));

        System.out.println("!" + (int)Math.sqrt(x));

        System.out.println(Math.sqrt(9));

        System.out.println(Math.random());

        int result;

        result = (int)(Math.random() * (y - x)+1)+x;

        System.out.println(result);

        System.out.println(Math.PI);

    }
}
