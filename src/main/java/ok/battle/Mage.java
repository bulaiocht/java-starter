package ok.battle;


public class Mage extends java.lang.Character {

      @Override
    public void attack(java.lang.Character character) {

        if (character instanceof Warrior && this.getCharacterWeapon().getRandomDamage() == 5){

            System.out.println(character.name + " blocks " + name + " attack!!!");
            System.out.println(character.name + " still has  " + character.life);
        }

        if (this.getCharacterWeapon().getRandomDamage() == 3)
            spellAttack(character);
        else
            mageAttack(character);

    }

    /**
     * Casts Mage spell attack
     * @param character
     */
    public void spellAttack(java.lang.Character character){
        System.out.println(this.name + " attacks " + character.name + " USING FIREBALL !!! ");
        character.life = character.life - this.getCharacterSpell().getSpellDamage();
        System.out.println(character.name + " now has " + character.life);
    }

    /**
     * Makes mages normal attack
     * @param character
     */
    public void mageAttack(java.lang.Character character){
        System.out.println(this.name + " attacks " + character.name + " !!! ");
        character.life = character.life - this.getCharacterWeapon().getRandomDamage();
        System.out.println(character.name + " now has " + character.life);
    }
}
