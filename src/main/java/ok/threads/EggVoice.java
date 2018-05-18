package ok.threads;


public class EggVoice extends Thread {


    public void run() {
        for (int i = 0; i < 5 ; i++) {
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Egg!");
        }
    }
}
