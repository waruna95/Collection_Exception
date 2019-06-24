package com.waruna;

import java.io.InvalidObjectException;

public class CreditCard extends VisaCard {

    @Override
    public void withdraw(Double amount) {
        try {
//            try {
            if (validateCardNumber("8126")) {
                super.withdraw(amount);
            }
//            } catch (CreditAccountException e) {
//                e.printStackTrace();
//            }
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        } catch (CreditAccountException e) {
            e.printStackTrace();
        }
    }
}
