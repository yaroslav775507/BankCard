package org.example;

class DebitCard extends BankCard {
    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Баланс: " + balance;
    }
}
