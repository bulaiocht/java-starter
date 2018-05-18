package ok.battle;

/**
 * Battle class
 */
public class Battle {

    /**
     * Starts a main.java.battle
     * @param first
     * @param second
     */
    public static void start(java.lang.Character first, java.lang.Character second) {


        System.out.println(first.getCharacterName() + " has " + first.getLife() + " of life.");
        System.out.println(second.getCharacterName() + " has " + second.getLife() + " of life.");
        System.out.println("Start Battle!!!");

        while (first.getLife() > 0 || second.getLife() > 0) {

            first.attack(second);

            if (second.getLife() <= 0) {
                System.out.println(first.getCharacterName() + " Wins!!! ");
                break;
            }

            second.attack(first);

            if (first.getLife() <= 0) {
                System.out.println(second.getCharacterName() + " Wins!!! ");
                break;
            }
        }
    }
}

