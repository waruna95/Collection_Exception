package com.waruna;

import java.io.InvalidObjectException;

public class VisaCard extends CreditAccount {

    @Override
    public void withdraw(Double amount){
        System.out.println("Withdraw made from credit Account class");

    }
    public boolean validateCardNumber(String cardNumber) throws InvalidObjectException, CreditAccountException {

      try {

          try {
              if (validateAccount(cardNumber)) {
                  if (cardNumber.startsWith("812")) {
                      return true;
                  } else {
                      throw new InvalidObjectException("Invalid card number");
                  }

              } else {
                  throw new CreditAccountException("Invalid account number");
              }
          } catch (AccountException e) {
              throw new CreditAccountException("Account validation failed", e);
          }
      }catch (IllegalArgumentException iae){
          throw new CreditAccountException("Account validation failed ",iae);
      }
    }

}

