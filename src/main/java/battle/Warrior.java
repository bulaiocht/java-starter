package battle;


public class Warrior extends Character {

    @Override
    public void attack(Character character) {

        if (character instanceof Warrior && this.getCharacterWeapon().getRandomDamage() == 5){

            System.out.println(character.name + " blocks " + name + " attack!!!");
            System.out.println(character.name + " still has  " + character.life);

        }else {

            System.out.println(this.name + " attacks " + character.name + " !!! ");
            character.life = character.life - this.getCharacterWeapon().getRandomDamage();
            System.out.println(character.name + " now has  " + character.life);

        }
    }
}
