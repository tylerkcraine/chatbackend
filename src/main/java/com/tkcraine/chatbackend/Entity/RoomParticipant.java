package com.tkcraine.chatbackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name="room_participant")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RoomParticipant {
    @Id
    @Column(name = "part_id")
    private Integer partId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(mappedBy = "roomParticipant")
    private Set<Message> messages;
}
