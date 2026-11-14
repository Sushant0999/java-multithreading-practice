public class Print_Odd_Even {
    public static void main(String[] args) throws InterruptedException {

        PrintOddEven printOddEven = new PrintOddEven();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                printOddEven.printEven();
            }
        }, "Thread-1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                printOddEven.printOdd();
            }
        }, "Thread-2");

        t1.start();
        t2.start();

    }

}

class PrintOddEven {
    int number;

    synchronized void printOdd() {
        try {
            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Thread Name " + Thread.currentThread().getName() + " Odd : " + number);
            number++;
            notify();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void printEven() {
        try {
            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Thread Name " + Thread.currentThread().getName() + " Even : " + number);
            number++;
            notify();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
