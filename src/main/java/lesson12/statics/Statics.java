package lesson12.statics;

public class Statics {

    public static int number = 12;

    public static final String CONSTANT = "I'm a constant";
    public static final double PI = 3.14159265384;

    public static void staticMethod(){}

    public void methodWithFinals(final int argument){
        final int otherArgument = argument;
    }

}
