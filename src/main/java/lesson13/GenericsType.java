package lesson13;


public class GenericsType<Type> {

    private Type t;

    public GenericsType() {
    }

    public GenericsType(Type t) {
        this.t = t;
    }

    public Type getType() {
        return t;
    }

    public void setType(Type t) {
        this.t = t;
    }
}
