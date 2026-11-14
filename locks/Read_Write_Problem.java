import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Read_Write_Problem {

    public static void main(String[] args) {
        Task14 task14 = new Task14();

        Thread r1 = new Thread(() -> {task14.read();});
        Thread r2 = new Thread(() -> {task14.read();});
        Thread r3 = new Thread(() -> {task14.read();});
        Thread r4 = new Thread(() -> {task14.read();});

        Thread w1 = new Thread(() -> {task14.write(10);});
        Thread w2 = new Thread(() -> {task14.write(20);});
        Thread w3 = new Thread(() -> {task14.write(30);});

        r1.start();
        r2.start();
        r3.start();
        r4.start();

        w1.start();
        w2.start();
        w3.start();
    }


}

class Task14 {

    int value = 0;
    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock rl = lock.readLock();   // shared lock
    Lock wl = lock.writeLock();  // exclusive lock

    int read(){
        try{
            rl.lock();
            Thread.sleep(1000);
            System.out.println("Current Value By Reader : " + value);
        } catch (InterruptedException e) {}
        finally {
            rl.unlock();
        }
        return value;
    }

    void write(int newVal){
        try {
            wl.lock();
            Thread.sleep(1000);
            value = newVal;
            System.out.println("Current Value By Writer : " + value);
        }catch (Exception e){}
        finally {
            wl.unlock();
        }
    }
}
