package battle;

public class Sword extends Weapon {

    @Override
    public int getRandomDamage() {
        this.damage = (int) (Math.random() * (this.maxDamage - this.minDamage) + this.minDamage);
        return damage;
    }

    @Override
    public void setWeaponName(String weaponName) {
        super.setWeaponName(weaponName);
    }

    @Override
    public String getWeaponName() {
        return super.getWeaponName();
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getMindamage() {
        return super.getMindamage();
    }

    @Override
    public void setMindamage(int mindamage) {
        super.setMindamage(mindamage);
    }

    @Override
    public int getMaxdamage() {
        return super.getMaxdamage();
    }

    @Override
    public void setMaxdamage(int maxdamage) {
        super.setMaxdamage(maxdamage);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);

    }
}
