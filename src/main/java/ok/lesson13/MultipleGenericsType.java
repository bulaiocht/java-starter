package ok.lesson13;


public class MultipleGenericsType<T, X> {

    private T t;
    private X x;

    public MultipleGenericsType(T t, X x) {
        this.t = t;
        this.x = x;
    }

    public MultipleGenericsType() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }
}
