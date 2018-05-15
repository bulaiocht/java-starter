package threads;


public class ProgramMain {

    public static int value = 0;

    static Incrementator incrementator;

    public static void main(String[] args) {

        incrementator = new Incrementator();

        System.out.print("Value =  ");
        incrementator.start();

        for (int i = 1; i <= 3 ; i++) {
            try {
                Thread.sleep(i*3*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            incrementator.changeAction();
        }
        incrementator.finish();
    }
}
