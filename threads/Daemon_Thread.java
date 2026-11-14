public class Daemon_Thread {

    /*
      A Daemon Thread is a background thread that provides services to user threads.
      For example:
       Garbage Collector
       Background monitoring
       Background cleanup tasks
     */

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("Main thread completed");

        // Creating a daemon thread
        thread.setDaemon(true);

        thread.start();
    }
}