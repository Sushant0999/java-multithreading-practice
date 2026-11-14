public class Start_V_Run {

    //Demonstrate the difference between start() and run() through code.
    /*
     Here when we use simply .run it will start the execution on existing thread
     Here when we use start() it will create a new thread and start executing task.
     */

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        Thread thread = new Thread(task7);
        thread.start();
        thread.run();
    }
}

class Task7 implements Runnable {
    @Override
    public void run() {
        for(int j=0;j<10;j++){
            System.out.println("Thead Is Running...." + Thread.currentThread().getName());
        }
    }
}