package org.xpdojo.bank;

public class Account {
    int balance;

    public Account (){
        balance = 0;
    }
    public int balance() {
        return balance;

    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance)
            return false;
        balance -= amount;
        return true;
    }

}
