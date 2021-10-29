package gmaster;

import java.util.ArrayList;

public class BankClient {
    public String name;
    public int age;
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public BankClient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public BankAccount getAccount(int n) {
        return accounts.get(n);
    }

    public void birthday(int n) {
        this.age += 1;
        this.getAccount(n).deposit(100);
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public boolean isMajor() {
        if (this.age >= 18) {
            return true;
        }
        return false;
    }
}