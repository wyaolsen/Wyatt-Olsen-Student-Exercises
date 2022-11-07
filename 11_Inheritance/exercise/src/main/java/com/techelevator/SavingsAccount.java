package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){

        int balanceAfter = super.getBalance() - amountToWithdraw;
        final int SERVICE_CHARGE = 2;

        if(balanceAfter < 150 && (balanceAfter - SERVICE_CHARGE) >= 0){
            super.withdraw(amountToWithdraw + SERVICE_CHARGE );
        }
        if(balanceAfter >= 150 ){
            super.withdraw(amountToWithdraw);
        }
        return super.getBalance();
    }
}
