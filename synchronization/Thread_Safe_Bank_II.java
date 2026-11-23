
import java.util.ArrayList;
import java.util.List;

public class Thread_Safe_Bank_II {

    public static void main(String[] args) throws InterruptedException {

        User_Account_I userAccount =
                new User_Account_I("Usha", 1L, 1000);

        Bank_I bank = new Bank_I();
        bank.addAccount(userAccount);

        // Deposit threads
        Thread t1 = new Thread(() -> {
            System.out.println(bank.depositAmount(1000, 1L));
        }, "Deposit-Thread-1");

        Thread t2 = new Thread(() -> {
            System.out.println(bank.depositAmount(500, 1L));
        }, "Deposit-Thread-2");

        Thread t3 = new Thread(() -> {
            System.out.println(bank.depositAmount(200, 1L));
        }, "Deposit-Thread-3");

        // Withdrawal threads
        Thread t4 = new Thread(() -> {
            System.out.println(bank.withdrawAmount(1000, 1L));
        }, "Withdraw-Thread-1");

        Thread t5 = new Thread(() -> {
            System.out.println(bank.withdrawAmount(500, 1L));
        }, "Withdraw-Thread-2");

        Thread t6 = new Thread(() -> {
            System.out.println(bank.withdrawAmount(300, 1L));
        }, "Withdraw-Thread-3");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();
        t6.start();

        // Wait for all threads to complete
        t1.join();
        t2.join();
        t3.join();

        t4.join();
        t5.join();
        t6.join();

        System.out.println("\nFinal Balance: "
                + userAccount.getAmount());
    }
}

class User_Account_I {

    private String name;
    private long accountId;
    private double amount;

    public User_Account_I(String name, long accountId, double amount) {
        this.name = name;
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public long getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class Bank_I {

    private final List<User_Account_I> accounts = new ArrayList<>();

    public synchronized void addAccount(User_Account_I account) {
        accounts.add(account);
    }

    public synchronized String withdrawAmount(
            double amount, long accountId) {

        User_Account_I account = getAccount(accountId);

        if (account == null) {
            return "Account not found";
        }

        if (amount <= 0) {
            return "Invalid withdrawal amount";
        }

        if (account.getAmount() < amount) {
            return Thread.currentThread().getName()
                    + " | Insufficient balance";
        }

        account.setAmount(account.getAmount() - amount);

        return Thread.currentThread().getName()
                + " | Withdrawal successful | Remaining Balance: "
                + account.getAmount();
    }

    public synchronized String depositAmount(
            double amount, long accountId) {

        User_Account_I account = getAccount(accountId);

        if (account == null) {
            return "Account not found";
        }

        if (amount <= 0) {
            return "Invalid deposit amount";
        }

        account.setAmount(account.getAmount() + amount);

        return Thread.currentThread().getName()
                + " | Deposit successful | Updated Balance: "
                + account.getAmount();
    }

    private User_Account_I getAccount(long accountId) {

        return accounts.stream()
                .filter(account ->
                        account.getAccountId() == accountId)
                .findFirst()
                .orElse(null);
    }
}
