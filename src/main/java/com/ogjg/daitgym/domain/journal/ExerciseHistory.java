package com.ogjg.daitgym.domain.journal;

import com.ogjg.daitgym.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class ExerciseHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "exercise_history_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "exercise_list_id")
    private ExerciseList exerciseList;

    private int setCount;

    private int weight;

    private int repetition_count;

    private boolean exercise_status;

}