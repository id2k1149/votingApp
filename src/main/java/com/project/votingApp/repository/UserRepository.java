package com.project.votingApp.repository;

import org.springframework.transaction.annotation.Transactional;
import com.project.votingApp.model.User;

import java.util.Optional;

@Transactional(readOnly = true)
public interface UserRepository extends BaseRepository<User> {
    Optional<User> getByEmail(String email);
}