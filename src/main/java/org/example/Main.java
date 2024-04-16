package org.example;

public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        debitCard.deposit(500);
        System.out.println(debitCard.getAvailableFundsInfo());
        CreditCard creditCard = new CreditCard(10000);
        creditCard.deposit(5000);
        System.out.println(creditCard.getAvailableFundsInfo());
        BonusDebitCard bonusDebitCard = new BonusDebitCard();
        bonusDebitCard.deposit(1000);
        bonusDebitCard.addBonusPoints(200);
        System.out.println(bonusDebitCard.getAvailableFundsInfo());
        CashbackCreditCard cashbackCreditCard = new CashbackCreditCard(20000, 0.05);
        cashbackCreditCard.deposit(8000);
        cashbackCreditCard.pay(3000);
        System.out.println(cashbackCreditCard.getAvailableFundsInfo());
        CreditCard creditCard2 = new CreditCard(10000);
        System.out.println("Кредитная карта с лимитом 10 000. Кредитные средства: " + creditCard2.getBalance() + ". Собственные средства: 0.");
        creditCard.deposit(5000);
        System.out.println("После пополнения карты на 5 000: Кредитные средства: " + creditCard2.getBalance() + ". Собственные средства: " + creditCard.getAvailableFundsInfo() + ".");
    }
}