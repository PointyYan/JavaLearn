package fuxitest.test2;

public class Account {

    protected float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public Account() {
        super();
    }

    public float getBalance() {
        return balance;
    }

    public float deposit(float num) {
        this.balance += num;
        return balance;
    }

    public float withdraw(float num) {
        if (num <= 0) {
            System.out.println("balabala");
            return balance;
        } else {
            this.balance -= num;
            return balance;
        }

    }
}
