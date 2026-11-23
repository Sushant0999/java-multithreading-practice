public class Create_Virtual_Thread_II {
    public static void main(String[] args) {

        Thread thread = Thread.ofVirtual().start(() -> {
            System.out.println(Thread.currentThread());
        });

        try{
            thread.join();
        }catch (Exception e){}
    }
}
