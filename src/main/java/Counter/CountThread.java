package Counter;

class CountThread extends Thread {
    private final Counter counter;

    public CountThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increaseCounter();
        }
    }
}
