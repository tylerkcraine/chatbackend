package com.tkcraine.chatbackend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @Column(name = "message_id")
    private Integer messageId;

    @Column(name = "message_content")
    private String messageContent;

    @Column(name = "part_id")
    private Integer partId;

    @ManyToOne
    @JoinColumn(name = "part_id", insertable=false, updatable=false)
    private RoomParticipant roomParticipant;

}
