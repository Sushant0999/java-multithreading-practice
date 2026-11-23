import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Create_Virtual_Threads_Using_Executors {

    public static void main(String[] args) {

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 10; i++) {
                int taskId = i;

                executor.submit(() -> {
                    System.out.println(
                            "Task " + taskId + " | " +
                                    Thread.currentThread()
                    );
                });
            }
        }
    }
}