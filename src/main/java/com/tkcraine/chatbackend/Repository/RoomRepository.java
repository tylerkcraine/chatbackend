package com.tkcraine.chatbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkcraine.chatbackend.Entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{
    
}
