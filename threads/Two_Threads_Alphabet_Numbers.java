public class Two_Threads_Alphabet_Numbers {

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        Thread thread1 = new Thread(() -> task6.printAlphaAndNum(0), "Alphabet Thread");
        Thread thread2 = new Thread(() -> task6.printAlphaAndNum(1), "Numbers Thread");
        thread1.start();
        thread2.start();

    }

}

class Task6 {

    char alphabet = 'a';

    int num = 1;

    int currentThreadId = 0;

    public synchronized void printAlphaAndNum(int threadId) {

        while (alphabet <= 'z' || num <= 26) {

            // Wait if it is not this thread's turn.
            while (currentThreadId != threadId) {

                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            // Alphabet thread
            if (threadId == 0 && alphabet <= 'z') {

                System.out.println(Thread.currentThread().getName() + " - " + alphabet);
                alphabet++;

            }
            // Number thread
            else if (threadId == 1 && num <= 26) {

                System.out.println(Thread.currentThread().getName() + " - " + num);
                num++;
            }

            // Switch to the other thread.
            currentThreadId = (currentThreadId + 1) % 2;

            // Wake up the waiting thread.
            notifyAll();
        }

        // Wake up any remaining waiting thread.
        notifyAll();
    }
}
