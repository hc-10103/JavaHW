
public class BankAccount {
    private final String id;
    private double balance;

    public BankAccount(String id, double initialBalance) {
        this.id = id;
        if (initialBalance <= 0) this.balance = 0;
        else this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;

    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount >= 0)) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }




}