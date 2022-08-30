package com.example.bigstore.repositories;


import com.example.bigstore.entities.AccountEntity;
import com.example.bigstore.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, String> {

    @Query(value = "SELECT * FROM CATEGORY WHERE LOWER(NAME) LIKE %?1%", nativeQuery = true)
    Optional<CategoryEntity> findByName(String categoryname);

    @Query(value = "SELECT * FROM CATEGORY WHERE LOWER(CATEGORYID) LIKE %?1%", nativeQuery = true)
    Optional<CategoryEntity> findByCateId(String categoryid);
}
