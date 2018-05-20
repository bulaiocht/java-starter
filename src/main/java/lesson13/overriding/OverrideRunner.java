package lesson13.overriding;

import lesson13.overriding.gadgets.Gadget;
import lesson13.overriding.gadgets.SmartPhone;
import lesson13.overriding.gadgets.SmartWatch;

import java.util.UUID;

public class OverrideRunner {

    private static UUID uuid;

    public static void main(String[] args) {

        Gadget gadget = new Gadget(255);

        Object obj1 = new SmartPhone(300,
                5.5,
                4000,
                "Gnusmas",
                "Flapdongle");

        Object obj2 = new SmartWatch(500,
                "WaterWatch",
                "IP68",
                true);

        Object obj3 = new Object();

        SmartPhone smartPhone = (SmartPhone) obj1;

        SmartWatch smartWatch = (SmartWatch) obj2;

        Gadget someGadget = (Gadget) obj3;

        System.out.println(smartPhone.nameYourCharacteristics());

        System.out.println(smartWatch.nameYourCharacteristics());

        System.out.println(someGadget.nameYourCharacteristics());

        uuid.randomUUID();

    }
}
