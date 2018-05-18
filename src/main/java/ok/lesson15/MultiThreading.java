package ok.lesson15;


public class MultiThreading extends Thread {

    public void run(){
        System.out.println("My second thread is running.");
    }

    public static void main(String[] args) {

//        Thread mainThread = Thread.currentThread();
//
//        System.out.println("Current Thread: " + mainThread.getName());
//
//        // Меняем имя и выводим в текстовом поле
//        mainThread.setName("newThread");
//        System.out.println("New Thread name: " + mainThread.getName());
//
//        //  - имя потока, его приоритет и имя его группы.
//
//        System.out.println(mainThread);
//        mainThread.setPriority(MAX_PRIORITY);
//        System.out.println(mainThread);
//
//
//        MultiThreading multiThreading = new MultiThreading();
//        multiThreading.start();


        Count cnt = new Count();
        try {
            while(cnt.isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}
