package com.application.springqlbh.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersDal extends CrudRepository<Customers, Integer> {
    List<Customers> findAll();
}
