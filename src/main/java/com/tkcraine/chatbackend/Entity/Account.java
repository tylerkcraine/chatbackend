package com.tkcraine.chatbackend.Entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="account")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Account {
    @Id
    @SequenceGenerator(name="account_id_seq", sequenceName="account_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="account_id_seq")
    @Column(name = "id", nullable = false)
    private Integer accountId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name="name", nullable = false)
    private String name;

    public Account(String accountName, String accountEmail) {
        this.name = accountName;
        this.email = accountEmail;
    }
}
