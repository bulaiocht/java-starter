package lesson12.statics;

public class Bicycle {

    public static int numberOfBicycles;

    private int instanceField = 3;


    {
        instanceField = 75;
    }

    static {
        numberOfBicycles = 0;
    }


    public Bicycle(){
        numberOfBicycles++;
    }

    public static int getNumberOfBicycles(){

        // isNumberOfBikesOdd();
        // int i = instanceField;

        return numberOfBicycles;
    }

    public boolean isNumberOfBikesOdd(){
        int number = numberOfBicycles;
        return getNumberOfBicycles()%2 == 0;
    }


}
