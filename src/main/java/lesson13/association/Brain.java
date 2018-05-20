package lesson13.association;

import java.util.UUID;

public class Brain {

    private final String brainId;

    public Brain() {
        this.brainId = UUID.randomUUID().toString();
    }

    public String getBrainId(){
        return this.brainId;
    }
}
