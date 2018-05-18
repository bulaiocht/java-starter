package ok.lesson9.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 13.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<ISubscriber> subscribers = new ArrayList<>();
        subscribers.add(new TemperatureSubscriber());
        subscribers.add(new PressureSubscriber());
        WeatherService weatherService = new WeatherService();
        weatherService.setSubscribers(subscribers);
        weatherService.generateTemperature();
        weatherService.generateTemperature();
        weatherService.generateTemperature();
        weatherService.generateTemperature();
        weatherService.generateTemperature();
        weatherService.generateTemperature();
        weatherService.generateTemperature();

        System.out.println("Pressure");
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();

        System.out.println("!");
        subscribers.remove(1);

        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();
        weatherService.generatePressure();






    }
}
