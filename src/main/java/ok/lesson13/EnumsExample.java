package ok.lesson13;

import java.util.EnumMap;


public class EnumsExample {

    public static void main(String[] args) {

        for (DayEnums day: DayEnums.values()) {
            System.out.println(day.name() + " " + day.getValue());
        }


        System.out.println(DayEnums.FRIDAY.toString());

        DayEnums.SUNDAY.setValue(8);
        System.out.println(DayEnums.SUNDAY.getValue());


        for (DayEnums day: DayEnums.values()) {
            System.out.println(day.toString());
        }

        for (Phone phone: Phone.values()) {
            System.out.println(phone.name() + " cost is: " + phone.getPrice());
        }


        // Create an EnumMap that contains all constants of the Phone enum.
        EnumMap<Phone, Integer> phones = new EnumMap(Phone.class);

        // Put some values in the EnumMap.
        phones.put(Phone.APPLE, Phone.APPLE.getPrice());
        phones.put(Phone.SAMSUNG, Phone.SAMSUNG.getPrice());
        phones.put(Phone.HTC, Phone.HTC.getPrice());
        phones.put(Phone.LG, Phone.LG.getPrice());

        // Print the values of an EnumMap.
        for(Phone phone: phones.keySet())
            System.out.println(phone.name());

        System.out.println(phones.size());

        // Remove a Phone object.
        phones.remove(Phone.HTC);
        System.out.println("After removing Phone.HTC, size: " + phones.size());

        for (Phone phone: phones.keySet()) {
            System.out.println(phone.name());
        }
        // Insert a Phone object.
        phones.put(Phone.valueOf("HTC"), Phone.HTC.getPrice());

       System.out.println("Size is now: " + phones.size());

        Double x = 7.5;
        Double y = 10.5;
        System.out.println(Operation.PLUS.eval(x, y));
        System.out.println(Operation.MINUS.eval(x, y));
        System.out.println(Operation.MULTI.eval(x, y));
        //System.out.println(Operation.DIVIDE.eval(6, 0));

        System.out.println(Planets.EARTH.order());

        for (Planets planet: Planets.values()) {
            System.out.println(planet.name() + " order is: " + planet.order());
        }
    }
}
