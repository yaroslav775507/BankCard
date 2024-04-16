package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
abstract class BankCard {
    protected double balance;

    public BankCard() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean pay(double amount);

    public abstract String getAvailableFundsInfo();
}

