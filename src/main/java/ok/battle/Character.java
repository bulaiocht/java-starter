package ok.battle;

public abstract class Character   {

    protected String name;
    protected int life;
    protected Weapon characterWeapon;
    protected Spell characterSpell;
    protected Armor characterArmor;

    /**
     * Makes One Character attack other Character
     * @param character
     */
    public abstract void attack(Character character);

    /**
     * Decrease Health of One Character after attack of another Character
     * @param damage
     */
    public void decreaseHealth(int damage) {
        life -= damage;
    }

    public Armor getCharacterArmor() {
        return characterArmor;
    }

    public void setCharacterArmor(Armor armor) {
        this.characterArmor = armor;
    }


    public Spell getCharacterSpell() {
        return characterSpell;
    }

    public void setCharacterSpell(Spell characterSpell)
    {
        this.characterSpell = characterSpell;
    }


    public Weapon getCharacterWeapon() {
        return characterWeapon;
    }

    public void setCharacterWeapon(Weapon characterWeapon) {
        this.characterWeapon = characterWeapon;
    }

    public String getCharacterName() {
        return name;
    }

    public void setCharacterName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

}
