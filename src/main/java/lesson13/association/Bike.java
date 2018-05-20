package lesson13.association;

import java.util.UUID;

public class Bike {

    private final String uuid;

    public Bike() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }
}
