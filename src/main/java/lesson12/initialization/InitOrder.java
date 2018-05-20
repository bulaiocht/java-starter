package lesson12.initialization;

public class InitOrder {

    private static int staticField = 80;

    private int instanceField = 3;

    {
        System.out.println("Inside instance initializer. Field before: " + instanceField);
        instanceField = 5;
        System.out.println("Inside instance initializer. Field after: " + instanceField);
    }

    public InitOrder(){
        System.out.println("Inside constructor. Field before: " + instanceField);
        this.instanceField = 6;
        System.out.println("Inside constructor. Field after: " + instanceField);
    }

    static {
        System.out.println("Inside static initializer. Static field before: " + staticField);
        staticField = 7;
        System.out.println("Static field after: " + staticField);
    }

}
