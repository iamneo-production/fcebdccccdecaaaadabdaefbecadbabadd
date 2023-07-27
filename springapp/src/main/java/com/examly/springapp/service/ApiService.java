package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Crackers;
import com.examly.springapp.repository.CrackersRepo;

@Service
public class ApiService {
    @Autowired
    public CrackersRepo crackersRepo;

    public boolean addCrackers(Crackers crackers){
        return crackersRepo.save(crackers) != null ? true : false;
    }

    public Crackers getOneCrackers(int crackersId){
        Optional<Crackers> cont = crackersRepo.findById(crackersId);
        if(cont.isPresent()){
            return cont.get();
        }else{
            return null;
        }
    }

    public List<Crackers> getCrackersByName(String crackersName){
        return crackersRepo.findCrackersByName(crackersName);
    }

   public List<Crackers> getBrand(String crackersBrand){
        return crackersRepo.findBrand(crackersBrand);
   }

   public List<Crackers> getByNameNBrand(String crackersName,String crackersBrand){
        return crackersRepo.findByNameAndBrand(crackersName, crackersBrand);
   }
}
