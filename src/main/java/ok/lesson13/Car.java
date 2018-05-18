package ok.lesson13;


public class Car<T extends Car> {

    private T t;

    public Car(T t) {
        this.t = t;
    }

    public Car() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
