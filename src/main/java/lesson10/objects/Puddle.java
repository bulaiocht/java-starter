package lesson10.objects;

public class Puddle extends Dog {

    int lifeSpan;

    public Puddle(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
