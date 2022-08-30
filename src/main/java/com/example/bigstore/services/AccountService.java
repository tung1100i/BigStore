package com.example.bigstore.services;


import com.example.bigstore.entities.AccountEntity;
import com.example.bigstore.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public List<AccountEntity> findAll() {
        return accountRepo.findAll();
    }

    @Override
    public AccountEntity addAccount(AccountEntity account) {
        return accountRepo.save(account);
    }

    @Override
    public Optional<AccountEntity> findUsername(String username) {
        return accountRepo.findById(username);
    }

    @Override
    public Optional<AccountEntity> findName(String name) {
        return accountRepo.findByName(name);
    }

    @Override
    public void deleteAccountByUsername(String username) {
        accountRepo.deleteById(username);
    }

    @Override
    public AccountEntity updateAccount( AccountEntity account) {
        AccountEntity updateAcc = new AccountEntity();

        updateAcc.setUsername(account.getUsername());
        updateAcc.setPassword(account.getPassword());
        updateAcc.setFullname(account.getFullname());
        updateAcc.setAdmin(account.getAdmin());
        accountRepo.save(updateAcc);
        return updateAcc;
    }

}
