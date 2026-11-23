import java.util.concurrent.Executors;

public class Create_Virtual_Thread_I {

    public static void main(String[] args) {
        Thread thread = Thread.startVirtualThread(() -> {
            System.out.println(Thread.currentThread());
        });
        try{
            thread.join();
        }catch (Exception e){}
    }

}
