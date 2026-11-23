import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Create_100_Virtual_Threads {

    public static void main(String[] args) {

        int totalTasks = 100;

        CountDownLatch ready = new CountDownLatch(totalTasks);
        CountDownLatch start = new CountDownLatch(1);

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= totalTasks; i++) {

                int taskId = i;

                executor.submit(() -> {

                    ready.countDown();

                    try {
                        start.await();

                        System.out.println(
                                "Task " + taskId + " | " +
                                        Thread.currentThread()
                        );

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }

            try {
                // Wait until all 100 virtual threads are ready.
                ready.await();

                System.out.println("All 100 virtual threads are ready!");

                // Release all virtual threads together.
                start.countDown();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}