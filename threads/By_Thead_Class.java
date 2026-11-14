public class By_Thead_Class {

    // Create a thread by extending the Thread class.

    public static void main(String[] args) {
        Task3 task3 = new Task3("THIS IS TASK 3");
        task3.start();
    }

}

class Task3 extends Thread {
    String message;

    public Task3(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message for " + Thread.currentThread().getName() + " " + this.message + " " + i);
        }
    }

}
