package org.Masri.SimpleRest;

public class Account {
    private String name;
    private Float balance;

    public Account(String name , Float balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }
    int x=0;



    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
