package com.waruna.Transaction;

import com.waruna.Exception.AccountException;

import java.util.Scanner;

public class Account {
    float accountbalance = 100000;
    float value= 0;
    public void withdraw(){
      try{
          checkAccount();
      }catch (AccountException e){
          System.out.println(e);
      }

    }

    public void checkAccount() throws AccountException{
        if(accountbalance<=0){
            throw new AccountException("Account Balace is less than zero");
        }else{
            accountbalance = accountbalance-value;
            System.out.println("Account Balance : "+ accountbalance);
        }
    }
}
