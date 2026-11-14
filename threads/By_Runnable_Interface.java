public class By_Runnable_Interface {

    //Create a thread using the Runnable interface.

    public static void main(String[] args) {
        Task4 task4 = new Task4("THIS IS TASK 3");
        Thread thread = new Thread(task4);
        thread.start();
    }

}

class Task4 implements Runnable {
    String message;

    public Task4(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message for " + Thread.currentThread().getName() + " " + this.message + " " + i);
        }
    }
}