package lesson7;

public class RealizationOfFirstVariable extends ExampleAbstractClasses {

    @Override
    void arithmeticMean(Integer... args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++)
            sum += args[i];

        ExampleAbstractClasses.first = (double) sum / args.length;

    }

    @Override
    Integer sum() {
        return null;
    }
}

