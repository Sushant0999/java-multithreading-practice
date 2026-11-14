public class Same_Thread_Twice {

    /*

     First t1.start() → Successfully starts the thread.
     Second t1.start() → Throws IllegalThreadStateException.
     Reason: In Java, once a thread has been started, you cannot start the same thread object again, even if its execution has already completed.

     if you want to execute the same task twice kindly create 2 threads.
     */

    public static void main(String[] args) {
        Task9 task9 = new Task9();
        Thread t1 = new Thread(task9);
        t1.start();
        t1.start();

    }

}

class Task9 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().threadId() + " - " + Thread.currentThread().getName());
    }
}
