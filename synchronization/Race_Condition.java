public class Race_Condition {

    public static void main(String[] args) throws InterruptedException {

        Task16 task = new Task16();

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + task.count);
    }
}

class Task16 implements Runnable {

    int count = 0;

    /*
     * remove `synchronized` it will become race condition else it will handle race condition.
     */

    @Override
    public synchronized void run() {

        for (int i = 0; i < 1000; i++) {
            int temp = count;
            Thread.yield();
            count = temp + 1;
        }

    }
}