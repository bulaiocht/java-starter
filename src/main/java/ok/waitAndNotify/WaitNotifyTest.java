package ok.waitAndNotify;


public class WaitNotifyTest {

    public static void main(String[] args) {

        Message msg = new Message("process it");
        Waiter waiter1 = new Waiter(msg);
        Thread thread = new Thread(waiter1,"waiter1");
        thread.start();

        Waiter waiter2 = new Waiter(msg);
        new Thread(waiter2, "waiter2").start();

        Notifier notifier = new Notifier(msg);
        Thread thread1 = new Thread(notifier, "notifier1");
        thread1.start();
        new Thread(notifier, "notifier2").start();
        System.out.println("All the main.java.threads are started");

    }
}
