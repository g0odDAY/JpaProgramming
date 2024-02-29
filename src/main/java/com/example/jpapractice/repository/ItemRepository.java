package com.example.jpapractice.repository;

import com.example.jpapractice.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ItemRepository extends CrudRepository<Item,Long> {
    Iterable<Item> findByMetricWeight(double weight);
}
