package PingPong;

public class Main {

    public static void main(String[] args) {

        Thread firstThread = new Thread(() -> test(PingPongTest.PING));

        Thread secondThread = new Thread(() -> test(PingPongTest.PONG));

        while (true) {
            firstThread.run();
            secondThread.run();
        }
    }

    public static synchronized void test(PingPongTest pingPongTest) {
        System.out.println(pingPongTest);
    }
}
