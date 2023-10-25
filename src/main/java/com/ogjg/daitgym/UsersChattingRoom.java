package com.ogjg.daitgym;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class UsersChattingRoom {

    @EmbeddedId
    private UsersChattingRoomPk id;

//    TODO User 테이블 매핑하기
//    @MapsId("memberId")
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MEMBER_ID")

    @MapsId("roomId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;

    public UsersChattingRoom(UsersChattingRoomPk id) {
        this.id = id;
    }

    @Embeddable
    @NoArgsConstructor(access = PROTECTED)
    @EqualsAndHashCode
    @Getter
    public static class UsersChattingRoomPk implements Serializable {
        private String email;
        private Long roomId;

        public UsersChattingRoomPk(String email, Long roomId) {
            this.email = email;
            this.roomId = roomId;
        }
    }
}
