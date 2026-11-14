public class Print_Numbers {

    /* * * GOLDEN RULE * * *

    start() creates a new thread of execution.
    run() is the method containing the task logic.
    Calling run() directly does not create a new thread, regardless of which approach you use.

     */

    //Create two threads. One prints numbers from 1–10 and another prints 11–20
    public static void main(String[] args) {
        Task1 t1 = new Task1("THIS IS 1");
        Task2 t2 = new Task2("THIS IS 2");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.setName("THIS IS 1");
        thread2.setName("THIS IS 2");
        thread1.start();
        thread2.start();
    }
}

class Task1 implements Runnable {

    String message;

    public Task1(String message) {
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

class Task2 implements Runnable {
    String message;

    public Task2(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Message for " + Thread.currentThread().getName() + " " + this.message + " " + i);
        }
    }
}
