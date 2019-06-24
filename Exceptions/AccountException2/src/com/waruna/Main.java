package com.waruna;

import com.waruna.Transaction.Account;
import com.waruna.Transaction.CreditAccount;
import com.waruna.Transaction.CreditCard;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account account = new CreditCard();
        account.withdraw();


    }
}
