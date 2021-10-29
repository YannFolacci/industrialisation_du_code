package gmaster;

public class BankAccount {
    private int value;
    private BankClient client;

    public BankAccount(int value, BankClient client) {
        this.value = value;
        this.client = client;
        this.client.addAccount(this);
    }

    public int getValue() {
        return this.value;
    }

    public void deposit(int n) {
        this.value += n;
    }

    public void withdraw(int n) {
        if (this.client.isMajor() || this.value > n) {
            this.value -= n;
        }

    }
}
