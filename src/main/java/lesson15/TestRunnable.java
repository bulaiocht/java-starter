package lesson15;


public class TestRunnable {

    public static void main(String[] args) {

        RunnableExample runnableExample1 = new RunnableExample("Thread-1");
        runnableExample1.start();

        RunnableExample runnableExample2 = new RunnableExample("Thread-2");
        runnableExample2.start();
    }
}
