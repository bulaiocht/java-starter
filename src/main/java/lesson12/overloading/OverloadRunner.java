package lesson12.overloading;

public class OverloadRunner {
    public static void main(String[] args) {

        OverloadMethods methods = new OverloadMethods();

        methods.changeField();
        methods.changeField(1.0);
        methods.changeField(new int [10]);

        //System.out.println();


    }
}
