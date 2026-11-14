public class RaceConditionExample {

    public static void main(String[] args)
            throws InterruptedException {

        Account account = new Account();

        Thread t1 = new Thread(
                () -> account.withdraw(800), "Thread-1"
        );

        Thread t2 = new Thread(
                () -> account.withdraw(800), "Thread-2"
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
                "Final Balance: " + account.balance
        );
    }

    static class Account {
        int balance = 1000;

        public void withdraw(int amount) {

            if (balance >= amount) {

                System.out.println(
                        Thread.currentThread().getName()
                                + " is processing withdrawal"
                );

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                balance -= amount;

                System.out.println(
                        Thread.currentThread().getName()
                                + " withdrawal successful"
                );

            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

