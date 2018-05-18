package ok.lesson5;

/**
 * Created by admin on 16.12.2016.
 */
public class EncapsulationTest {

    public static void main(String[] args) {


            String variety = "пепепепвукркноег";
            if (variety.matches("^[a-zA-Z0-9 +-.,!@#$%^&*();\\/|<>\"\\'_\\\\:áéñóúüÁÉÑÚÜ]+$")) {

                System.out.println("OK");
            } else {
                System.out.println("BAD");
            }
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.x1 = 10;
        encapsulation.x2 = 20;
        encapsulation.x3 = 30;

        System.out.println(encapsulation.x1 + " " + encapsulation.x2 + " " + encapsulation.x3);

    }
}
