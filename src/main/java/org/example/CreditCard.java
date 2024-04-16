package org.example;

class CreditCard extends BankCard {
    double creditLimit;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else if (balance + creditLimit >= amount) {
            double remainingAmount = amount - balance;
            balance = 0;
            creditLimit -= remainingAmount;
            return true;
        }
        return false;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Баланс: " + balance + ", Кредитные средства: " + creditLimit;
    }
}
