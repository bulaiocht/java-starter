package lesson13.association;

public class Body {

    private final Brain brain;

    public Body() {
        this.brain = new Brain();
    }

    public String getBrainId() {
        return brain.getBrainId();
    }
}
