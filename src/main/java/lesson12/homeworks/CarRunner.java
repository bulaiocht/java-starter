package lesson12.homeworks;

public class CarRunner {

    public static void main(String[] args) {

        Car teslaCar = new Car("Tesla", "Red", 0, false, false);
        teslaCar.startEngine();
        teslaCar.isCarEngineStarted();
        teslaCar.isCarMoving();

        Car toyotaCar = new Car();
        toyotaCar.setCarModel("Toyota");
        toyotaCar.setColor("Yellow");
        toyotaCar.startEngine();
        teslaCar.isCarEngineStarted();
        teslaCar.isCarMoving();

        Car [] cars = new Car[2];
        cars[0] = teslaCar;
        cars[1] = toyotaCar;

        startAndRunCars(cars);

        for (Car car:cars) {
            System.out.println(car);
        }

     }

     private static void startAndRunCars(Car[] cars){
         for (Car car : cars) {
             car.setFuelLevel(10);
             car.startEngine();
             car.startMoving();
             car.isCarEngineStarted();
             car.isCarMoving();
         }

     }
}