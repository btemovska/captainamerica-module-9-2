package com.captainamericamodule92.demo.repository;


import com.captainamericamodule92.demo.models.Difficulty;
import org.springframework.data.repository.CrudRepository;

public interface DifficultyRepository extends CrudRepository<Difficulty, Long> {
    Difficulty findDifficultyByLevel(String level);
}

