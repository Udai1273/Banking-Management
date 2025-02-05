package com.example.repo;
import com.example.model.Account;

import java.util.List;

public class AccountDB {
    List<Account> accounts;

    public Account viewAccount(Account account) {
        for (Account it : accounts) {
            if (it.getAccountNumber().equals(account.getAccountNumber())) {
                return it;
            }
        }

        return null;
    }

    public boolean addAccount(Account newAccount) {
        if (viewAccount(newAccount) == null) return accounts.add(newAccount);
        else return false;
    }

    public boolean removeAccount(Account account) {
        if (viewAccount(account) == null) return false;

        for (Account it : accounts) {
            if (it.getAccountNumber().equals(account.getAccountNumber())) {
                it.setIsDeleted(true);
            }
        }

        return true;
    }
    public boolean updateAccount(Account account) {
        accounts.remove(viewAccount(account));

        return addAccount(account);
    }
}