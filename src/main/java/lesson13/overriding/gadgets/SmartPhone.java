package lesson13.overriding.gadgets;

public class SmartPhone extends Gadget {

    private String model;

    private double diagonal;

    private int batteryCapacity;

    private String processor;

    public SmartPhone(double price, double diagonal, int batteryCapacity, String model, String processor) {

        super(price);

        this.diagonal = diagonal;
        this.batteryCapacity = batteryCapacity;
        this.model = model;
        this.processor = processor;
    }

    @Override
    public String nameYourCharacteristics(){
        return "SmartPhone{" +
                "diagonal=" + diagonal +
                ", batteryCapacity=" + batteryCapacity + "mAh" +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", price='$" + super.getPrice() +'\'' +
                "}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public static void greet(){
        System.out.println("Hello from SmartPhone");
    }

}
