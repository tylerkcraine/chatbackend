package com.tkcraine.chatbackend.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkcraine.chatbackend.Entity.RoomParticipant;

@Repository
public interface RoomParticipantRepository extends JpaRepository<RoomParticipant, Integer> {
    Set<RoomParticipant> findAllByAccountName(String name);
    Set<RoomParticipant> findAllByRoomName(String name);
}
