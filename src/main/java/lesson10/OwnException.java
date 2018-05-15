package lesson10;


public class OwnException extends Exception {

    public OwnException(Throwable ex){
        initCause(ex);
    }
}
