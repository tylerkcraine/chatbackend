package com.tkcraine.chatbackend.entity;

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
    @SequenceGenerator(name="room_id_seq", sequenceName="room_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="room_id_seq")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    public Room(String roomName) {
        this.name = roomName;
    }
}
