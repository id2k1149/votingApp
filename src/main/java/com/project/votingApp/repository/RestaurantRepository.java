package com.project.votingApp.repository;

import com.project.votingApp.model.Restaurant;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface RestaurantRepository extends BaseRepository<Restaurant> {
}
