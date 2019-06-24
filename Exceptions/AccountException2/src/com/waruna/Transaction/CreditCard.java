package com.waruna.Transaction;

public class CreditCard extends VisaCard {
    @Override
    public void withdraw() {
        System.out.println("Withdraw from credit card");
        super.withdraw();
    }
}
