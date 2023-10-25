package com.ogjg.daitgym;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class ChatMessage {

    // TODO : User 연관관계 맺기

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private MessageType type;

    private String message;

    private LocalDateTime sendTime = LocalDateTime.now();
}
