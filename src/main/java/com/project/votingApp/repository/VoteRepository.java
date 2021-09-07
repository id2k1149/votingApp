package com.project.votingApp.repository;

import com.project.votingApp.model.Vote;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Repository
@Transactional(readOnly = true)
public interface VoteRepository extends BaseRepository<Vote> {
    Vote findVoteByDateAndUser(LocalDate date, int user_id);
}
