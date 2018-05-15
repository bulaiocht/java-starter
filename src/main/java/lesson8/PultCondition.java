package lesson8;

public class PultCondition extends  Pult implements ButtonSwitch {

    @Override
    public void switchON() {
        System.out.println("Condition ON!");
    }

    @Override
    public void switchOFF() {
        System.out.println("Condition OFF!");
    }

    @Override
    public void irPort() {
        Integer [] numbers = {1, 2, 3, 4, 5 ,6, 7, 8, 9};
        for (Integer number : numbers) {
            if(number.equals(9)){
                System.out.println("IR Port Switched!");
                switchON();
            }
        }
    }
}
