public class Shared_Counter_With_Multiple_Threads {

    public static void main(String[] args) throws InterruptedException {

        Task_15 task15 = new Task_15();

        Thread t1 = new Thread(task15, "Thread-1");
        Thread t2 = new Thread(task15, "Thread-2");
        Thread t3 = new Thread(task15, "Thread-3");
        Thread t4 = new Thread(task15, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final Shared Count: " + task15.count);
    }
}

class Task_15 implements Runnable {

    int count = 0;

    @Override
    public void run() {

        while (true) {

            synchronized (this) {

                if (count >= 100) {
                    break;
                }

                count++;

                System.out.println(
                        Thread.currentThread().getName()
                                + " | Count: " + count
                );
            }
            Thread.yield();
        }
    }
}