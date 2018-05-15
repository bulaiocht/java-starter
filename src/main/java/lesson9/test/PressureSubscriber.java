package lesson9.test;

import java.util.ArrayList;
import java.util.List;

public class PressureSubscriber implements ISubscriber {

    private List<Double> results = new ArrayList<>();

    @Override
    public void disable(Message message) {

        if("Pressure".equals(message.getParameterName())){

            for (Double result : results) {
                results.remove(result);
                System.out.println("Disabled");
            }
        }
    }

    @Override
    public void update(Message message) {

        if("Pressure".equals(message.getParameterName())){
            results.add(message.getParameterValue());
            double sum = results.get(0);
            for (Double result : results) {
                sum += result;
            }

            System.out.println(sum / results.size());

        }
    }

}
