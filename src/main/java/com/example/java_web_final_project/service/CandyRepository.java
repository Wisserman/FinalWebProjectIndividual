package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandyRepository extends JpaRepository<Candy, Long> {
    Candy findById( long id );
}
