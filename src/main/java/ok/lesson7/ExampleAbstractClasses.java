package ok.lesson7;

public  abstract class ExampleAbstractClasses {

     static Double first;
     static Double second;

    abstract void arithmeticMean(Integer... args);

    public static Integer getSumOfTwoArithmeticMeans(Integer x, Integer y){
        return x + y;
    }

    abstract Integer sum();
}
