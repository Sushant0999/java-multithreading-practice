public class Create_Virtual_Thread_III {
    public static void main(String[] args) {
        Thread thread = Thread.ofVirtual().unstarted(() -> {
            System.out.println(Thread.currentThread());
        });

        try {
            thread.start();
            thread.join();
        }catch (Exception e){}
    }
}
