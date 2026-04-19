class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("It was interrupted");
                break;
            }
            counter++;
        }
    }
}