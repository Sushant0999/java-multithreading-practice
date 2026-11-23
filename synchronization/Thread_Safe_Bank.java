import java.util.ArrayList;
import java.util.List;

public class Thread_Safe_Bank {

    public static void main(String[] args) throws InterruptedException {

        User_Account userAccount =
                new User_Account("Usha", 1L, 1000);

        Bank bank = new Bank();
        bank.addAccount(userAccount);

        Thread t1 = new Thread(() -> {
            System.out.println(bank.withdrawAmount(1000, 1L));
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            System.out.println(bank.withdrawAmount(1000, 1L));
        }, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + userAccount.getAmount());
    }
}

class User_Account {

    private String name;
    private long accountId;
    private double amount;

    public User_Account(String name, long accountId, double amount) {
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

class Bank {

    private final List<User_Account> accounts = new ArrayList<>();

    public synchronized void addAccount(User_Account account) {
        accounts.add(account);
    }

    public synchronized String withdrawAmount(double amount, long accountId) {

        User_Account account = getAccount(accountId);

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

    private User_Account getAccount(long accountId) {

        return accounts.stream()
                .filter(account -> account.getAccountId() == accountId)
                .findFirst()
                .orElse(null);
    }
}