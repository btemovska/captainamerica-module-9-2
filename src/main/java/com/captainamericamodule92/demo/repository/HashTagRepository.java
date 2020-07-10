package com.captainamericamodule92.demo.repository;

import com.captainamericamodule92.demo.models.HashTag;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HashTagRepository extends CrudRepository<HashTag, Long> {
    Optional<HashTag> findByName(String hashTagName);
}