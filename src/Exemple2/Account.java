package Exemple2;

public class Account {
    private String name;
    private String address;
    private double balance;

    public Account(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
