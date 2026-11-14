import java.util.concurrent.locks.ReentrantLock;

public class Shared_Counter_By_Reentrant {

    public static void main(String[] args) {
        Shared_Counter_By_Reentrant counter = new Shared_Counter_By_Reentrant();
        counter.method1();
    }

    ReentrantLock lock = new ReentrantLock();

    public void method1() {
        System.out.println("Inside method1 - " + " Hold Count : " + lock.getHoldCount());
        lock.lock();
        try {
            System.out.println("Inside method1 - " + " Hold Count : " + lock.getHoldCount());
            method2();
            System.out.println("Inside method1 - " + " Hold Count : " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
        System.out.println("Inside method1 - " + " Hold Count : " + lock.getHoldCount());
    }

    public void method2() {
        lock.lock();
        try {
            System.out.println("Inside method2 - " + " Hold Count : " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }

}
