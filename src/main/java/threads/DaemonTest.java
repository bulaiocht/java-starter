package threads;


public class DaemonTest {

    public static void main(String[] args) {

        new WorkerThread().start();


        try {

            System.out.println("Main Thread starts");

            Thread.sleep(20000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread ending");
    }
}

class WorkerThread extends Thread {

    public WorkerThread(){
        setDaemon(true);
        System.out.println(isDaemon());
    }

    @Override
    public void run() {

        int count = 0;
        while (true){

            System.out.println("Hello from Worker " + count++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
