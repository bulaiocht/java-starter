package lesson13.overriding.gadgets;

public class SmartWatch extends Gadget {

    private String model;

    private String waterResistanceRate;

    private final boolean hasGPS;

    public SmartWatch(double price, String model, String waterResistanceRate, boolean hasGPS) {
        super(price);
        this.model = model;
        this.waterResistanceRate = waterResistanceRate;
        this.hasGPS = hasGPS;
    }

    @Override
    public String nameYourCharacteristics() {
        return "SmartWatch{" +
                "model='" + model + '\'' +
                ", waterResistanceRate='" + waterResistanceRate + '\'' +
                ", hasGPS=" + hasGPS +
                ", price='$" + super.getPrice() + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWaterResistanceRate() {
        return waterResistanceRate;
    }

    public void setWaterResistanceRate(String waterResistanceRate) {
        this.waterResistanceRate = waterResistanceRate;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public static void greet(){
        System.out.println("Hello from SmartWatch");
    }

}
