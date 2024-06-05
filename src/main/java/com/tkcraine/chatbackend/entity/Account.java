package com.tkcraine.chatbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="account",
        uniqueConstraints={
            @UniqueConstraint(columnNames = ("email"))
        }
)
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Account {
    @Id
    @SequenceGenerator(name="account_id_seq", sequenceName="account_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="account_id_seq")
    @Column(name = "id", nullable = false)
    private Integer accountId;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "external_id", nullable = false)
    private Integer externalId;

    @Column(name="name", nullable = false)
    private String name;

    public Account(String accountName, String accountEmail) {
        this.name = accountName;
        this.email = accountEmail;
    }
}
