package com.ogjg.daitgym;

import com.ogjg.daitgym.BaseEntity;
import com.ogjg.daitgym.ExerciseNoteComment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class RoutineComment extends BaseEntity {

    // TODO : Routine,User 랑 연관관계 맺기

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String comment;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "PARENT_ID")
    private ExerciseNoteComment parent;

    @OneToMany(mappedBy = "parent", orphanRemoval = true)
    private List<ExerciseNoteComment> children = new ArrayList<>();
}
