package lesson6;

public class Phone {

    private final String osType1 = "Android";
    private final String osType2 = "IOS";
    private final String madeIn = "Made in China";
    private String model;
    private Integer memory;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public String getOsType1() {
        return osType1;
    }

    public String getOsType2() {
        return osType2;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public String getModel() {
        return model;
    }

    public Integer getMemory() {
        return memory;
    }
}
