import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer_Consumer_III {

    public static void main(String[] args) {
        BlockingQueue<Integer> list = new ArrayBlockingQueue<>(10);

        Thread p1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    list.put(i);
                    System.out.println("Produced Value : " + i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread c1 = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    int value = list.take();
                    System.out.println(
                            "Consumed Value : " + value
                    );
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        p1.start();
        c1.start();

    }
}