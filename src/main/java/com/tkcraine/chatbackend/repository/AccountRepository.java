package com.tkcraine.chatbackend.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkcraine.chatbackend.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
    public Set<Account> findAllByName(String name);
}
