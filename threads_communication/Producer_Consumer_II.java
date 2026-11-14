import java.util.LinkedList;
import java.util.Queue;

public class Producer_Consumer_II {

    public static void main(String[] args) {

        Pro_Con proCon = new Pro_Con();
        Thread p1 = new Thread(() -> proCon.producer());
        Thread p2 = new Thread(() -> proCon.producer());
        Thread p3 = new Thread(() -> proCon.producer());
        Thread p4 = new Thread(() -> proCon.producer());
        Thread c1 = new Thread(() -> proCon.consumer());
        Thread c2 = new Thread(() -> proCon.consumer());

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        c1.start();
        c2.start();

    }
}

class Pro_Con {

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
                notifyAll(); // when multiple producer
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void consumer() {
        try {
            for (int i = 0; i < 10; i++) {
                while (queue.isEmpty()) {
                    wait();
                }
                int val = queue.poll();
                System.out.println("Consumed : " + val);
                notifyAll(); // when multiple producer
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
