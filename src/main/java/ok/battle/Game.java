package ok.battle;


public class Game {

    public static void main(String[] args) {

        Integer characterLife = 100;

        Staff staff = new Staff();
        staff.setWeaponName("staff");
        staff.setDamage(1);
        staff.setMindamage(2);
        staff.setMaxdamage(6);

        Bow bow = new Bow();
        bow.setWeaponName("bow");
        bow.setDamage(2);
        bow.setMindamage(3);
        bow.setMaxdamage(7);

        Sword sword = new Sword();
        sword.setWeaponName("Sword");
        sword.setDamage(4);
        sword.setMindamage(4);
        sword.setMaxdamage(6);

        Fireball fireball = new Fireball();
        fireball.setSpellDamage(7);

        java.lang.Character mage = new Mage();
        mage.setCharacterName("Harry Potter");
        mage.setLife(characterLife);
        mage.setCharacterWeapon(staff);
        mage.setCharacterSpell(fireball);

        java.lang.Character archer = new Archer();
        archer.setCharacterName("Legolas");
        archer.setLife(characterLife);
        archer.setCharacterWeapon(bow);

        java.lang.Character warrior = new Warrior();
        warrior.setCharacterName("Hercules");
        warrior.setLife(characterLife);
        warrior.setCharacterWeapon(sword);

        java.lang.Character warrior1 = new Warrior();
        warrior1.setCharacterName("Aragorn");
        warrior1.setLife(characterLife);
        warrior1.setCharacterWeapon(sword);

       /* Character mage1 = new Mage();
        mage1.setCharacterName("Gendalf");
        mage1.setLife(100);
        mage1.setCharacterWeapon(staff);
        mage1.setCharacterSpell(fireball);*/

        java.lang.Character archer1 = new Archer();
        archer1.setCharacterName("Robin Good");
        archer1.setLife(characterLife);
        archer1.setCharacterWeapon(bow);

        Battle.start(warrior, warrior1);


    }
}
