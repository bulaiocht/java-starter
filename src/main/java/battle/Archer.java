package battle;


public class Archer extends Character {


    @Override
    public void attack(Character character) {

        if (character instanceof Warrior && this.getCharacterWeapon().getRandomDamage() == 5){

            System.out.println(character.name + " blocks " + name + " attack!!! ");
            System.out.println(character.name + " still has  " + character.life);

        }else {

            System.out.println(this.name + " attacks " + character.name + " !!! ");
            archerAttack(character);

            System.out.println(this.name + " attacks for second time " + character.name + "!!!");
            archerAttack(character);
        }

    }

    public void archerAttack(Character character){
        character.life = character.life - this.getCharacterWeapon().getRandomDamage();
        System.out.println(character.name + " now has  " + character.life);
    }
}
