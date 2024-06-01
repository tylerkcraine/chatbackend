package com.tkcraine.chatbackend.Entity;

import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="room")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue
    @Column(name = "room_id")
    private Integer roomId;

    @Column(name="room_name")
    private String roomName;

    @OneToMany(mappedBy = "room")
    private Set<RoomParticipant> roomParticipants;
}
