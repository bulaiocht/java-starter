package ok.lesson9.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 13.03.2017.
 */
public class TemperatureSubscriber implements ISubscriber {

    private List<Double> results = new ArrayList<>();

    @Override
    public void disable(Message message) {

    }

    @Override
    public void update(Message message) {

        if("Temperature".equals(message.getParameterName())){
            results.add(message.getParameterValue());
            double sum = results.get(0);
            for (Double result : results) {
                sum += result;
            }

            System.out.println(sum / results.size());

        }
    }
}
