public class Threads_With_Name_N_Id {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {System.out.println("Running Thread 1" + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());}, "Thread 1");
        Thread thread2 = new Thread(() -> {System.out.println("Running Thread 2" + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());}, "Thread 2");
        Thread thread3 = new Thread(() -> {System.out.println("Running Thread 3" + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());}, "Thread 3");
        Thread thread4 = new Thread(() -> {System.out.println("Running Thread 4" + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());}, "Thread 4");
        Thread thread5 = new Thread(() -> {System.out.println("Running Thread 5" + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());}, "Thread 5");

        thread1.start();
//        thread2.join();
        thread2.start();
//        thread3.join();
        thread3.start();
//        thread4.join();
        thread4.start();
//        thread5.join();
        thread5.start();

    }


}
