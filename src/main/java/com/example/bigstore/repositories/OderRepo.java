package com.example.bigstore.repositories;


import com.example.bigstore.entities.OderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderRepo extends JpaRepository<OderEntity,Long> {
}
