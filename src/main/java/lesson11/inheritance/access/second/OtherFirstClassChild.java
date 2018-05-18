package lesson11.inheritance.access.second;

import lesson11.inheritance.access.first.FirstClass;

public class OtherFirstClassChild extends FirstClass {

    public void otherFirstClassMethod(){
        super.protectedField++;
    }

}
