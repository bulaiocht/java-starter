package lesson11.inheritance.access.first;

public class FirstClassChild extends FirstClass {

    public void firstClassChildMethod(){
        publicField++;
        protectedField++;
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
