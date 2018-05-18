package lesson10.objects;

public class ObjectRunner {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.printDog();

        dog.setColor("Black");
        dog.setName("Pirate");
        dog.setNumberOfLegs(-100);

        dog.printDog();

        Puddle puddle = new Puddle(10);
        System.out.println(puddle.getLifeSpan());

    }


}
