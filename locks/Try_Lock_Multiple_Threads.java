import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Try_Lock_Multiple_Threads {

    private static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                performTask();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                performTask();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-2");

        Thread t3 = new Thread(() -> {
            try {
                performTask();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }

    public static void performTask() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " trying to acquire lock");
        boolean isLockAcquired = lock.tryLock(2, TimeUnit.SECONDS);
        if (isLockAcquired) {
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could not acquire lock. Doing other work...");
        }
    }
}