
public class Create_3_Threads {

    // Print numbers from 1–100 using three threads.
    // Each thread prints 10 numbers in its turn.
    public static void main(String[] args) {

        // Create one shared Task5 object.
        // All three threads will use the same counter and currentThread.
        Task5 task5 = new Task5();

        // Create three threads.
        // Thread 1 gets ID 0, Thread 2 gets ID 1, Thread 3 gets ID 2.
        Thread thread1 = new Thread(() -> task5.printNumbers(0));
        Thread thread2 = new Thread(() -> task5.printNumbers(1));
        Thread thread3 = new Thread(() -> task5.printNumbers(2));

        // Start all three threads.
        // They will coordinate their execution inside printNumbers().
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Task5 {

    // Shared counter used by all three threads.
    // Starts from 1 and ends at 100.
    private int counter = 1;

    // Determines which thread is allowed to print.
    // 0 = Thread 1
    // 1 = Thread 2
    // 2 = Thread 3
    private int currentThread = 0;

    // synchronized ensures that only one thread at a time
    // can execute this method on the shared Task5 object.
    public synchronized void printNumbers(int threadId) {

        // Continue until all numbers from 1 to 100 are printed.
        while (counter <= 100) {

            // Check whether it is this thread's turn.
            // If not, wait until another thread notifies us.
            while (currentThread != threadId && counter <= 100) {

                try {

                    // Releases the object's lock and puts this thread
                    // into the waiting state.
                    // Another thread can now acquire the lock.
                    wait();

                } catch (InterruptedException e) {

                    // Restore the interrupted status.
                    Thread.currentThread().interrupt();

                    // Stop execution if this thread is interrupted.
                    return;
                }
            }

            // Check whether another thread has already printed 100.
            if (counter > 100) {

                // Wake up any threads still waiting.
                notifyAll();

                // Exit this method.
                return;
            }

            // Print 10 numbers in this thread's turn.
            for (int i = 0; i < 10 && counter <= 100; i++) {

                // Print the current thread name and counter value.
                System.out.println(
                        Thread.currentThread().getName()
                                + " - " + counter
                );

                // Increment the shared counter.
                counter++;
            }

            // Move to the next thread.
            // 0 -> 1 -> 2 -> 0 -> repeat.
            currentThread = (currentThread + 1) % 3;

            // Wake up all waiting threads.
            // Each awakened thread will compete to acquire the lock.
            // Only the thread whose ID matches currentThread can proceed.
            notifyAll();
        }

        // Notify any remaining waiting threads when printing finishes.
        notifyAll();
    }
}
