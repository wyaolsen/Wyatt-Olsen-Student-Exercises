package com.techelevator;

public class CheckingAccount extends BankAccount{


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw) {
        int balanceAfter = super.getBalance() - amountToWithdraw;
        int overDraftFee = 10;

        if(balanceAfter < 0 && balanceAfter > -100){
            super.withdraw(amountToWithdraw + overDraftFee);
        }
        if(balanceAfter >= 0){
            super.withdraw(amountToWithdraw);
        }
        return super.getBalance();
    }
}
