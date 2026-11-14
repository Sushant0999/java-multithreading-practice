import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer_I {

    public static void main(String[] args) {

        Pro_Con_I proCon = new Pro_Con_I();
        Thread p1 = new Thread(() -> proCon.producer());
        Thread c1 = new Thread(() -> proCon.consumer());

        p1.start();
        c1.start();
    }
}

class Pro_Con_I {

    private static int CAPACITY = 5;
    Queue<Integer> queue = new LinkedList<>();

    synchronized void producer() {
        try {
            for (int i = 0; i < CAPACITY; i++) {
                while (queue.size() == CAPACITY) {
                    wait();
                }
                queue.add(i);
                System.out.println("Produced : " + i);
                notify(); // when single producer
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void consumer() {
        try {
            for (int i = 0; i < 5; i++) {
                while (queue.isEmpty()) {
                    wait();
                }
                int val = queue.poll();
                System.out.println("Consumed : " + val);
                notify(); // when single consumer
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
