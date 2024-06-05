package com.tkcraine.chatbackend.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkcraine.chatbackend.entity.RoomParticipant;
import com.tkcraine.chatbackend.entity.Account;

@Repository
public interface RoomParticipantRepository extends JpaRepository<RoomParticipant, Integer> {
    Set<RoomParticipant> findAllByAccountName(String name);
    Set<RoomParticipant> findAllByRoomName(String name);
    Set<RoomParticipant> findAllByAccount(Account account);
    RoomParticipant findByAccountNameAndRoomName(String accountName, String roomName);
}
