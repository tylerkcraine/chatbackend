package com.tkcraine.chatbackend.Entity;

import java.util.Set;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="account")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name="account_name")
    private String accountName;

    @OneToMany(mappedBy = "account")
    private Set<RoomParticipant> roomParticipated;
}
