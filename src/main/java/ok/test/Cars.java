package ok.test;


public abstract class Cars {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected abstract void warranty();
}
