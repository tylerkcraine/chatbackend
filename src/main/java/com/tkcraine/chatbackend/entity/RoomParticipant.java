package com.tkcraine.chatbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="room_participant",
        uniqueConstraints = @UniqueConstraint(
            columnNames = {"account_id", "room_id"}
        )
)
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RoomParticipant {
    @Id
    @SequenceGenerator(name="part_id_seq", sequenceName="room_participant_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="part_id_seq")
    @Column(name = "id")
    private Integer partId;

    @ManyToOne
    @JoinColumn(name="account_id", nullable = true)
    private Account account;

    @ManyToOne
    @JoinColumn(name="room_id", nullable = false)
    private Room room;

    public RoomParticipant(Account a, Room r) {
        this.account = a;
        this.room = r;
    }
}
