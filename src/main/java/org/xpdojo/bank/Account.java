package org.xpdojo.bank;

public class Account {

    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new RuntimeException("Cannot deposit negative amount.");
        }

        balance = Math.addExact(balance, amount);
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new RuntimeException("Cannot withdraw negative amount.");
        }

        balance = Math.subtractExact(balance, amount);
    }
}
