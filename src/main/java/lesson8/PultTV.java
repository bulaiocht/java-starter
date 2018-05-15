package lesson8;


public class PultTV extends Pult implements ButtonSwitch, SoundRegulator {

    @Override
    public void switchOFF() {
        System.out.println(" TV OFF!");
    }

    @Override
    public void irPort() {
        Integer [] numbers = {1, 2, 3, 4, 5 , 6, 7, 8, 9};
        for (Integer number : numbers) {
            if(number.equals(7)){
                System.out.println("IR Port Switched!");
                switchON();
            }
        }
    }

    @Override
    public void switchON() {
        System.out.println(" TV ON!");
    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
