package com.example.jpapractice.repository;

import com.example.jpapractice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ItemRepository extends JpaRepository<Item,Long> {
    @Query("select i from Item i inner join fetch i.images where i.id = :id")
    Item findItemWithImages(@Param("id") Long id);
    @Query(value = "SELECT FNAME FROM Image WHERE ITEM_ID = ?1",nativeQuery = true)
    Set<String> findImagesNative(Long id);


}
