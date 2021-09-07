package com.project.votingApp.repository;

import com.project.votingApp.model.Dish;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Transactional(readOnly = true)
public interface DishRepository extends BaseRepository<Dish> {
    List<Dish> findAllByDate(LocalDate date);
}
