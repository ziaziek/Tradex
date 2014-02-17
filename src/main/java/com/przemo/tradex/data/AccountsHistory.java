package com.przemo.tradex.data;
// Generated 2014-02-13 15:12:34 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * AccountsHistory generated by hbm2java
 */
public class AccountsHistory  implements java.io.Serializable {


     private long id;
     private Transactions transactions;
     private Accounts accounts;
     private double balance;
     private Date entryDate;

    public AccountsHistory() {
    }

    public AccountsHistory(long id, Transactions transactions, Accounts accounts, double balance, Date entryDate) {
       this.id = id;
       this.transactions = transactions;
       this.accounts = accounts;
       this.balance = balance;
       this.entryDate = entryDate;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Transactions getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }
    public Accounts getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Date getEntryDate() {
        return this.entryDate;
    }
    
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }




}


