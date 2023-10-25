package com.ogjg.daitgym;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class Message {

    // TODO : User 연관관계 맺기

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private MessageType messageType;

    private String message;

    private LocalDateTime sendTime = LocalDateTime.now();
}
