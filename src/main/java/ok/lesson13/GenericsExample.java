package ok.lesson13;

import java.util.ArrayList;


public class GenericsExample {

    public static void main(String[] args) {

        GenericsType<Integer> genericsType1 = new GenericsType(Integer.valueOf("5638"));

        System.out.println(genericsType1.getType());

        genericsType1.setType(7834);

        System.out.println(genericsType1.getType());



        MultipleGenericsType<Integer, String> multipleGenericsType
                = new MultipleGenericsType<>(34567, "Your Salary is: ");

        System.out.println(multipleGenericsType.getX() + " " + multipleGenericsType.getT());


        GenericsType<String> genericsType = new GenericsType<>("Apple");

        System.out.println(genericsType.getType());

        MultipleGenericsType<Integer, GenericsType<String>> multipleGenericsType1
                = new MultipleGenericsType<>(123344, genericsType);

        multipleGenericsType1.setT(15);
        multipleGenericsType1.setX(genericsType);

        System.out.println(multipleGenericsType1.getT() + " USD is a price of "
                + multipleGenericsType1.getX().getType());

        BMW bmw = new BMW();
        Audi audi = new Audi();

        bmw.setModel("X5");

        Car<Audi> car = new Car<>(audi);

        car.setT(audi);
        audi.setModel("TT");

        System.out.println(" Model is: " + car.getT().getModel());

        Car<BMW> car1 = new Car<>(bmw);
        bmw.setModel("X3");
        System.out.println(" Model is: " + car1.getT().getModel());

        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(bmw);
        arrayList.add(audi);

    }
}
