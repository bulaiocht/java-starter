package access.one;

public class OneRunner {

    public static void main(String[] args) {

        One one = new One();

        OneChild child = new OneChild();

        final int publicField = one.publicField;
        final int defaultField = one.defaultField;
        final int protectedField = one.protectedField;

        //final int privateField = one.privateField;

        one.publicMethod();
        one.defaultMethod();
        one.protectedMethod();

        //one.privateMethod();

        final int publicField1 = child.publicField;
        final int defaultField1 = child.defaultField;
        final int protectedField1 = child.protectedField;

        child.publicMethod();
        child.defaultMethod();
        child.protectedMethod();

    }

}
