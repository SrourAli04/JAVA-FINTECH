package com.example.JDB_new.services;

import com.example.JDB_new.Models.AccountHolder;
import com.example.JDB_new.repositories.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AccountHolderService {

    @Autowired
    AccountHolderRepository accountHolderRepository;

    public AccountHolder createAccountHolder(AccountHolder accountHolder){
        return accountHolderRepository.save(accountHolder);
    }

    public Optional<AccountHolder> getById(UUID id){
        return accountHolderRepository.findById(id);
    }

    public void deletById(UUID id) {
        accountHolderRepository.deleteById(id);
    }

}
