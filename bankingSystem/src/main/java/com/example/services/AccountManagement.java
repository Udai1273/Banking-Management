package com.example.services;

import com.example.model.Account;
import com.example.repo.AccountDB;

public class AccountManagement {
    private final AccountDB data;

    public AccountManagement(AccountDB data) {
        this.data = data;
    }

    public void addAccount(Account newAccount) {
        data.addAccount(newAccount);
    }

    public void removeAccount(Account toDelete) {
        data.removeAccount(toDelete);
    }

    public void searchAccount(Account account) {
        data.viewAccount(account);
    }

    public void updateAccount(Account account) {
        data.updateAccount(account);
    }
}