package com.example.bigstore.repositories;


import com.example.bigstore.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends JpaRepository<ProductEntity,Long> {
}
