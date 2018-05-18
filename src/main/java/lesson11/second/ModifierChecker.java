package lesson11.second;

import lesson11.first.FirstClass;
import lesson11.first.FirstClassChild;

public class ModifierChecker {

    public static void main(String[] args) {


        FirstClass firstClass = new FirstClass();

        int publicField = firstClass.publicField;
        firstClass.publicMethod();

        //firstClass.protectedField;
        //firstClass.protectedMethod();

        //firstClass.defaultField;
        //firstClass.defaultMethod();

        //firstClass.privateField;
        //firstClass.privateMethod();

        FirstClassChild child = new FirstClassChild();

//        int defaultField1 = child.defaultField;
//        int protectedField1 = child.protectedField;
        int publicField1 = child.publicField;

        child.publicMethod();
//        child.defaultMethod();
//        child.protectedMethod();

        child.firstClassChildMethod();

    }

}
