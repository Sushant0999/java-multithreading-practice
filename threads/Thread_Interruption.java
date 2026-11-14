public class Thread_Interruption {

    /*
    In Java, Thread Interruption is a mechanism to request a running thread to stop what it is doing
    and terminate gracefully.
     */

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Worker is running...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Worker interrupted!");
                    break;
                }
            }

            System.out.println("Worker terminated.");
        });

        worker.start();

        Thread.sleep(3000);

        System.out.println("Main thread requesting interruption...");

        worker.interrupt();
    }

}