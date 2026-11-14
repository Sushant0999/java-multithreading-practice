public class Thread_Safe_Counter {

    public static void main(String[] args) throws InterruptedException {

        Task12 task12 = new Task12();

        Thread t1 = new Thread(task12);
        Thread t2 = new Thread(task12);
        Thread t3 = new Thread(task12);
        Thread t4 = new Thread(task12);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final Counter: " + task12.getCounter());
    }
}

class Task12 implements Runnable {

    private int counter = 1;

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (counter >= 1000) {
                    break;
                }
                counter++;
            }
        }
    }
}
