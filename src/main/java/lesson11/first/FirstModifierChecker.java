package lesson11.first;

public class FirstModifierChecker {
    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass();
        int protectedField = firstClass.protectedField;
        firstClass.protectedMethod();

        int defaultField = firstClass.defaultField;
        firstClass.defaultMethod();

        //firstClass.privateField;
        //firstClass.privateMethod();


        FirstClassChild child = new FirstClassChild();

        int defaultField1 = child.defaultField;
        int protectedField1 = child.protectedField;
        int publicField = child.publicField;

        child.publicMethod();
        child.defaultMethod();
        child.protectedMethod();

        child.firstClassChildMethod();




    }
}
