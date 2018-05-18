package ok.lesson13;

import java.util.ArrayList;
import java.util.List;


public class WildCardExample {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(7.5);

        Double x = sum(list);
        System.out.println(x);
    }

    /**
     *
     * @param sumList
     */
    public static Double sum(List<? extends Number> sumList){
        Double sum = 0.0;
        for (Number n : sumList) {
         sum = sum + n.doubleValue();
        }
        return sum;
    }
}
