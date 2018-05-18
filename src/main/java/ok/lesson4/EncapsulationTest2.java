package ok.lesson4;


import ok.lesson5.Encapsulation;

public class EncapsulationTest2{

    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();

        encapsulation.x2 = 25;

        EncapsulationTest2 encapsulationTest2 = new EncapsulationTest2();

        //need to be extanded from EncapsulationTest to see protected fields
//       encapsulationTest2.x1 = 15;
//        encapsulationTest2.x2 = 23;

        System.out.println(encapsulation.x2);
    }
}
