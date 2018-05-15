package threads;


public class Incrementator extends Thread {

    private  boolean isIncrement = true;
    private  boolean finish = false;

    public void changeAction(){
        isIncrement = !isIncrement;
    }

    public void finish(){
        finish = true;
    }

    @Override
    public void run() {
        do {
            if (!finish){
                if (isIncrement) {
                    ProgramMain.value++;
                }
                else {
                    ProgramMain.value--;
                }
                System.out.print(ProgramMain.value + " ");
            }
            else
                return;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true);
    }
}
