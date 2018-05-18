package threads;


public class ChickenVoice {

    static EggVoice eggVoice;

    public static void main(String[] args) {

        eggVoice = new EggVoice();

        System.out.println("Спор начат...");

        eggVoice.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
                System.out.println("Chicken!");
            }

            if (eggVoice.isAlive()){
                try {
                    eggVoice.join();
                }catch (InterruptedException e) {
                }
                    System.out.println("Первым появилось яйцо!");
                }else {
                System.out.println("Первой появилась курица!");
            }
        System.out.println("Спор закончен!");
        }

    }

