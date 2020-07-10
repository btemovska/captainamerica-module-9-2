package com.captainamericamodule92.demo.repository;

import com.captainamericamodule92.demo.models.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
    Location findLocationByName(String name);
}
