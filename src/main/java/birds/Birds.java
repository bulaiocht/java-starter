package birds;

import lesson5.Animal;

public class Birds extends Animal {

    String birdsSay = "Piu!";

    @Override
    protected Integer animalLegs() {
        return  super.animalLegs() - 2;
    }
}
