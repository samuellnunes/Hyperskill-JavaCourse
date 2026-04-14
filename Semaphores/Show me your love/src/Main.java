import java.util.concurrent.*;

class Mouth {
    private final Semaphore s1;
    private final Semaphore s2;

    public Mouth() {
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
    }

    public void first() throws InterruptedException {
        System.out.print("I ");
        s1.release();
    }

    public void second() throws InterruptedException {
        s1.acquire();
        System.out.print("love ");
        s2.release();
    }

    public void third() throws InterruptedException {
        s2.acquire();
        System.out.print("programming!");
    }
}