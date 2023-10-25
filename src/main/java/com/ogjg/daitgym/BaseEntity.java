package com.ogjg.daitgym;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass // 이 어노테이션이 사용된 클래스는 실제 데이터베이스 테이블에 매핑되지 않고, 다른 JPA 엔티티 클래스에서 상속받아 공통 필드 및 기능을 재사용할 수 있음
@EntityListeners(AuditingEntityListener.class) // AuditingEntityListener.class : 생성 및 수정 시간을 자동으로 관리하는데 사용되는 리스터 클래스를 지정한다.
public abstract class BaseEntity {

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
