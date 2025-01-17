package com.ogjg.daitgym.feed.repository;

import com.ogjg.daitgym.domain.feed.FeedExerciseJournal;
import com.ogjg.daitgym.domain.feed.FeedExerciseJournalImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedExerciseJournalImageRepository extends JpaRepository<FeedExerciseJournalImage, Long> {

    void deleteAllByFeedExerciseJournal(FeedExerciseJournal feedExerciseJournal);

}
