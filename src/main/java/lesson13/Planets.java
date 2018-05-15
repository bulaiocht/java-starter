package lesson13;


public enum  Planets {

    MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;

    /**
     * ordinal() and name() is implemented automatically.
     * @return
     */
    public int order() {
        return ordinal() + 1;
    }
}
