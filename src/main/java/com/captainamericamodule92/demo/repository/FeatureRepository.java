package com.captainamericamodule92.demo.repository;

import com.captainamericamodule92.demo.models.Feature;
import org.springframework.data.repository.CrudRepository;

public interface FeatureRepository extends CrudRepository<Feature, Long> {
    Feature findFeatureByName(String name);
}
