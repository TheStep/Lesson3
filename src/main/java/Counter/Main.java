package Counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            CountThread countThread = new CountThread(counter);
            countThread.start();
        }

        Thread.sleep(1000);

        System.out.println("Counter : " + counter.getCounter());
    }
}
