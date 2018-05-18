package ok.lesson2;


public class MathClassExample {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        double test = 14.6;

        System.out.println("Max value = " + Math.max(x,y));
        System.out.println("Min value =  " + Math.min(x,y));
        System.out.println("Square = " + Math.sqrt(x));
        System.out.println("PI number = " + Math.PI);
        System.out.println("Round number = " + Math.round(test));

        int result;
        System.out.println(Math.random());
        result = (int)(Math.random() * (y - x)+1)+x;
        System.out.println(result);

    }
}
