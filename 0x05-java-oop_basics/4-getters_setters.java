/**
 * File: 4-getters_setters.java
 * Description: Demonstrates encapsulation using getters and setters.
 */

public class BankAccount {
    private double balance;

    public void setBalance(double amount) {
        if (amount >= 0)
            this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1000.50);
        System.out.println("Balance: $" + acc.getBalance());  // Output: Balance: $1000.5
    }
}

