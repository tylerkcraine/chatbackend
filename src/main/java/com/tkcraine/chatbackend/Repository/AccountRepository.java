package com.tkcraine.chatbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkcraine.chatbackend.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
    public Account getAccountByName(String name);
}
