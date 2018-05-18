package ok.battle;


public abstract class Weapon {

    protected String weaponName;
    protected int damage;
    protected int minDamage;
    protected int maxDamage;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public int getMindamage() {
        return minDamage;
    }

    public void setMindamage(int mindamage) {
        this.minDamage = mindamage;
    }

    public int getMaxdamage() {
        return maxDamage;
    }

    public void setMaxdamage(int maxdamage) {
        this.maxDamage = maxdamage;
    }

    /**
     * Returns random damage value
     * @return
     */
    public abstract int getRandomDamage();



}
