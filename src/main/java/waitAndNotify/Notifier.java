package waitAndNotify;


public class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
        System.out.println(name + " started");

            Thread.sleep(1000);

            synchronized (msg) {
                msg.notify();
                msg.setMsg(name + " work done");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
