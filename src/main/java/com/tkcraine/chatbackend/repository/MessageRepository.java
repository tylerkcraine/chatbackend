package com.tkcraine.chatbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkcraine.chatbackend.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer>{
    
}
