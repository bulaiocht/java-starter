package access.one;

public class One {

    public int publicField = 1;

    int defaultField = 2;

    protected int protectedField = 3;

    private int privateFiled = 4;

    public void publicMethod(){}

    void defaultMethod(){}

    protected void protectedMethod(){}

    private void privateMethod(){}

    public One chain(){
        return this;
    }
}

