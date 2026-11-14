public class Sleep_N_Yield {

    /*

    sleep() = Wait for a specified amount of time.
    yield() = Give other threads a chance to execute.

     */

    public static void main(String[] args) {

        Task11 task11 = new Task11();

        Thread thread1 = new Thread(task11, "Thread-1");
        Thread thread2 = new Thread(task11, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class Task11 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " - Count: " + i
            );

            // Demonstrating sleep()
            if (i == 2) {
                try {
                    System.out.println(
                            Thread.currentThread().getName()
                                    + " is going to sleep"
                    );

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Demonstrating yield()
            if (i == 4) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " is yielding"
                );

                Thread.yield();
            }
        }
    }
}
