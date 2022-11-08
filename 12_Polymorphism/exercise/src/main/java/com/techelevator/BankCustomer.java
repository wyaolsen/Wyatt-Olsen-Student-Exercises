package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

    public boolean isVip(){
        int VIP_CUSTOMER_AMOUNT = 25000;
        int accountTotal = 0;
        for(Accountable account: this.accounts){
            accountTotal += account.getBalance();
        }
        if(accountTotal >= VIP_CUSTOMER_AMOUNT){
            return true;
        }else{
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public Accountable[] getAccounts() {
        Accountable[] accountsArray= new Accountable[this.accounts.size()];

        for(int i = 0; i < this.accounts.size(); i++){
            accountsArray[i] = this.accounts.get(i);
        }
        return accountsArray;
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }


}
