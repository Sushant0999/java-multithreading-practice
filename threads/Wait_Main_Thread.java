public class Wait_Main_Thread {

    public static void main(String[] args) throws InterruptedException {
        Task8 task8 =  new Task8();
        Thread thread = new Thread(task8);
        thread.start();
        System.out.println(Thread.currentThread().getName());
        thread.join();
        System.out.println(Thread.currentThread().getName());
    }

}

class Task8 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread Task Complete");
    }
}
