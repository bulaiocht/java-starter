package ok.lesson9.test;

import java.util.List;

public class WeatherService {

    private List<ISubscriber> subscribers;



    public void generateTemperature(){
        double temp = Math.random();
        for (ISubscriber subscriber: subscribers) {
            subscriber.update(new Message("Temperature",temp));
        }
    }

    public void generatePressure(){
        double press = Math.random();
        for (ISubscriber subscriber: subscribers) {
            subscriber.update(new Message("Pressure", press));
        }
    }

    public void disablePressure(){
        for (ISubscriber subscriber: subscribers) {
            subscriber.disable(new Message("Pressure"));
        }
    }

    public List<ISubscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<ISubscriber> subscribers) {
        this.subscribers = subscribers;
    }
}
