package com.waruna;

public class CreditAccount extends Account {

    boolean validateAccount(String accountNumber) throws AccountException {

       try {

           if (accountWithdrawValidation()) {
               if (accountNumber.length() > 5) {
                   return true;
               }else {
                   throw new IllegalArgumentException("Account Number Should length over 5 digits");
               }
           } else {
                   return false;
               }
       }catch (AccountException ae){
           throw new IllegalArgumentException("withdraw count validation failed",ae);
       }
    }

    @Override
    public void withdraw(Double amount){

    }
}
