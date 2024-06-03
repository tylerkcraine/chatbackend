package com.tkcraine.chatbackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="room_participant")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RoomParticipant {
    @Id
    @SequenceGenerator(name="part_id_seq", sequenceName="room_participant_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="part_id_seq")
    @Column(name = "id")
    private Integer partId;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;

    public RoomParticipant(Account a, Room r) {
        this.account = a;
        this.room = r;
    }
}
