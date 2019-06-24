package com.waruna;

import java.security.PublicKey;

public class Account {

    int withdrawCount = 5;

    public boolean accountWithdrawValidation() throws AccountException {
        if (withdrawCount<=3){
           return true;
        }else {
            throw new AccountException("Withdraw count exceed");

        }
    }


    public void withdraw(Double amount){


    }
}
