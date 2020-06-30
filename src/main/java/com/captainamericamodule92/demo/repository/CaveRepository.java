package com.captainamericamodule92.demo.repository;


import com.captainamericamodule92.demo.models.Cave;
import org.springframework.data.repository.CrudRepository;

public interface CaveRepository extends CrudRepository<Cave, Long> {
}