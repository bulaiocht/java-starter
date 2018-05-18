package main.java.lesson11.first;

import lesson11.first.FirstClass;

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
