import javax.lang.model.UnknownEntityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount_ReentrantLock {


    public static void main(String[] args) {

        try{
            Account account = new Account();
            account.setAccountBalance(1200);
            account.setAccountHolderName("Sushant");
            account.setAccountNumber(123);
            account.createAccount(account);
            System.out.println("Current Balance : " + account.checkBalance(123));
            Thread thread = new Thread(() -> {
                System.out.println(account.depositBalance(123, 5000.0));
            });
            Thread thread1 =  new Thread(() -> {
                System.out.println(account.widthDrawBalance(123, 400.0));
            });
            Thread thread3 =  new Thread(() -> {
                System.out.println(account.widthDrawBalance(123, 1400.0));
            });
            thread.start();
            thread1.start();
            thread3.start();

            thread1.join();
            thread3.join();
            thread.join();
            System.out.println("Current Balance : " + account.checkBalance(123));


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }




}

class Account{

    Lock lock = new ReentrantLock();
    List<Account> accounts = new ArrayList<>();

    int accountNumber;
    String accountHolderName;
    double accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean createAccount(Account account){
        return accounts.add(account);
    }

    public Double checkBalance(int accountNumber) {
        lock.lock();
        Account account = findAccount(accountNumber);
        if(account == null){
            lock.unlock();
            throw new RuntimeException("No Account Exist");
        }
        lock.unlock();
        return account.accountBalance;
    }


    public Account findAccount(int accountNumber) {
        return accounts.stream()
                .filter(ele -> ele.accountNumber == accountNumber)
                .findFirst()
                .orElse(null);
    }

    public boolean widthDrawBalance(int accountNumber, Double requestedAmount){
        lock.lock();
        Account account = findAccount(accountNumber);
        if(account == null){
            lock.unlock();
            throw new RuntimeException("No Account Exist");
        }
        Double currentBalance = checkBalance(accountNumber);
        if(currentBalance < requestedAmount){
            lock.unlock();
            throw new RuntimeException("Insufficient Amount Exception");
        }
        Double updatedBalance = account.accountBalance - requestedAmount;
        account.setAccountBalance(updatedBalance);
        lock.unlock();
        return accounts.add(account);
    }

    public boolean depositBalance(int accountNumber, Double depositedAccount){
        lock.lock();
        Account account = findAccount(accountNumber);
        if(account == null){
            lock.unlock();
            throw new RuntimeException("No Account Exist");
        }
        Double updatedBalance = account.accountBalance + depositedAccount;
        account.setAccountBalance(updatedBalance);
        lock.unlock();
        return accounts.add(account);
    }


}