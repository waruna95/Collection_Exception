package com.waruna.Transaction;

import com.waruna.Exception.CreditAccountException;

import java.util.Scanner;
import java.util.SortedMap;

public class CreditAccount extends Account {
    float creditAmount = 50000;

    @Override
    public void withdraw() {
        try {
            System.out.println("validate account from credit Account-----");
            getAmount();
            AccountValidation();

        }catch(CreditAccountException e) {
            System.out.println(e);
            withdraw();
        }
    }

    public void AccountValidation(){
        if(value< accountbalance){
            super.withdraw();
        }else {
            System.out.println("Cannot Withdraw");
        }

    }

    public void getAmount() throws CreditAccountException {

        System.out.print("Enter Amount :");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if(userInput.matches("^\\d+(\\.\\d+)?")){
            value = Float.parseFloat(userInput);
        }else{
            throw new CreditAccountException("Enter valid amount");
        }

    }
}
