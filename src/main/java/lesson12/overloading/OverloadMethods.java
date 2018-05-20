package lesson12.overloading;

public class OverloadMethods {

    int field;

    public void changeField(int newNumber){
        System.out.println("public void changeField(int newNumber)");
    }

    public void changeField(int first, int second){
        System.out.println("public void changeField(int first, int second)");
    }

    public void changeField(double newNumber){
        this.field = (int) newNumber;
    }

    public void changeField(int a, int b, int c){
        System.out.println("public void changeField(int a, int b, int c)");
    }

    public void changeField(int ... number){
        System.out.println("public void changeField(int ... number)");
    }

}
