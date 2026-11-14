public class By_Lambda {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                System.out.println("Thread is running");
            }
        });
        thread.start();

    }

}