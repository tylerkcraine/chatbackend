package com.tkcraine.chatbackend.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkcraine.chatbackend.Entity.Account;
import com.tkcraine.chatbackend.Entity.RoomParticipant;
import com.tkcraine.chatbackend.Repository.AccountRepository;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository repository) {
        this.accountRepository = repository;
    }

    public Long getAccountByName(String name) {
        return accountRepository.count();
    }
}