package org.example;

import lombok.Getter;

@Getter
class BonusDebitCard extends DebitCard {
    private double bonusPoints;

    public BonusDebitCard() {
        this.bonusPoints = 0.0;
    }

    public void addBonusPoints(double points) {
        bonusPoints += points;
    }

    @Override
    public boolean pay(double amount) {
        if (balance + bonusPoints >= amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                double remainingAmount = amount - balance;
                balance = 0;
                bonusPoints -= remainingAmount;
            }
            return true;
        }
        return false;
    }

    @Override
    public String getAvailableFundsInfo() {
        return "Баланс: " + balance + ", Кэшбек: " + bonusPoints;
    }
}

