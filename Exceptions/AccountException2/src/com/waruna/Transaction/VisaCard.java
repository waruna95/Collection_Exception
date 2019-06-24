package com.waruna.Transaction;

public class VisaCard extends CreditAccount {

    @Override
    public void withdraw() {
        System.out.println("Check the balance from Visa Card");
        checkBalance();

    }

    public void checkBalance(){
        if(accountbalance!= 0){
            System.out.println("Acount balance is not zero");
            super.withdraw();
        }else {
            System.out.println("Account Balance is Zero");
        }

    }
}
