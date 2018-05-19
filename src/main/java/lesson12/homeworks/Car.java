package lesson12.homeworks;

public class Car {

    private String carModel;

    private String color;

    private int fuelLevel;

    private boolean engineStarted;

    private boolean moving;


    public Car(){}

    public Car(String model, String color, int fuel, boolean started, boolean moving){
        this.carModel = model;
        this.color = color;
        this.fuelLevel = fuel;
        this.engineStarted = started;
        this.moving = moving;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    private void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    public boolean isMoving() {
        return moving;
    }

    private void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void isCarMoving(){
        if (isMoving()){
            System.out.println("Car is moving");
        } else System.out.println("Car is not moving");
    }

    public void isCarEngineStarted(){
        if (isEngineStarted()){
            System.out.println("Engine is started");
        } else System.out.println("Engine is not started");
    }

    public void startEngine(){
        if (fuelLevel==0){
            System.out.println("Not enough fuel");
            return;
        }
        if (engineStarted){
            System.out.println("Engine is already started");
        } else this.engineStarted = true;
    }

    public void startMoving(){
        if (!engineStarted){
            System.out.println("Engine not working!");
            return;
        }

        if (moving){
            System.out.println("Car is already moving");
        } else this.moving = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", engineStarted=" + engineStarted +
                ", moving=" + moving +
                '}';
    }
}
