
public class Thread_Lifecycle {

    static final Object lock = new Object();

    public static void main(String[] args)
            throws InterruptedException {

        // 1. NEW
        // Thread object is created but start() is not called.
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("1. NEW: " + t1.getState());


        // 2. RUNNABLE
        // Thread has been started and is ready to run
        // or currently executing.
        t1.start();

        System.out.println("2. RUNNABLE: " + t1.getState());


        // 3. TIMED_WAITING
        // Thread is waiting for a specified amount of time.
        // Here sleep(3000) puts t1 into TIMED_WAITING.
        Thread.sleep(500);

        System.out.println("3. TIMED_WAITING: " + t1.getState());


        // 4. WAITING
        // Thread waits indefinitely until another thread completes.
        // Here t2 waits for t1 to finish because of join().
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();

        Thread.sleep(500);

        System.out.println("4. WAITING: " + t2.getState());


        // 5. TERMINATED
        // Thread has completed its execution.
        t1.join();

        System.out.println("5. TERMINATED: " + t1.getState());

        t2.join();


        // 6. BLOCKED
        // Thread is waiting to acquire a synchronized lock
        // which is already held by another thread.

        Thread holder = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        holder.start();

        Thread.sleep(300);

        Thread blocked = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Lock acquired");
            }
        });

        blocked.start();

        Thread.sleep(300);

        System.out.println("6. BLOCKED: " + blocked.getState());

        holder.join();
        blocked.join();
    }
}
