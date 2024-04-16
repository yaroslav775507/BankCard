package org.example;

class CashbackCreditCard extends CreditCard {
    private final double cashbackRate;

    public CashbackCreditCard(double creditLimit, double cashbackRate) {
        super(creditLimit);
        this.cashbackRate = cashbackRate;
    }

    public double calculateCashback(double amount) {
        return amount * cashbackRate;
    }

    @Override
    public boolean pay(double amount) {
        boolean paid = super.pay(amount);
        if (paid) {
            double cashback = calculateCashback(amount);
            deposit(cashback);
        }
        return paid;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Баланс: " + getBalance() + ", Лимит: " + creditLimit;
    }
}
