package com.Bank;


import java.util.ArrayList;

public class Bank {
    private ArrayList < Account > accounts;

    public Bank() {
        accounts = new ArrayList < Account > ();
        add();
    }
    public void add()
    {
        Account account1 = new Account("Ahmed ", "A000", 50000);
        Account account2 = new Account("Mohamed", "M001", 45000);
        Account account3 = new Account("Mostafa ", "MO002", 20000);

        addAccount(account1);
        addAccount(account2);
        addAccount(account3);
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    public String checkAccountExistence(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                String newAccount = account.getAccountInfo();
                return newAccount;
            }
        }
        return null; // Return null if the account does not exist
    }

    public Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Return null if the account does not exist
    }

    public String showInfo(String account) {
        String newAcc=checkAccountExistence(account);
        return newAcc;
    }
}