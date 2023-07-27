package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Crackers;

@Repository
public interface CrackersRepo extends JpaRepository<Crackers ,  Integer>{
   
    @Query(value = "SELECT * FROM Crackers c WHERE c.crackers_name = ?1", nativeQuery = true)
    public List<Crackers> findCrackersByName(String crackersName);

    @Query(value = "SELECT * FROM Crackers c WHERE c.crackers_brand = ?1", nativeQuery = true)
    public List<Crackers> findBrand(String crackersBrand);

    @Query(value = "SELECT * FROM Crackers c WHERE c.crackers_name = ?1 AND c.crackers_brand = ?2" , nativeQuery = true)
    public List<Crackers> findByNameAndBrand(String crackersName, String crackersBrand);

    
}
