package com.tkcraine.chatbackend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="message")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Message {
    @Id
    @SequenceGenerator(name="message_id_seq", sequenceName="message_id_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="message_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "content")
    private String content;

    @Column(name = "part_id")
    private Integer partId;

    @ManyToOne
    @JoinColumn(name = "part_id", insertable=false, updatable=false)
    private RoomParticipant roomParticipant;

}
