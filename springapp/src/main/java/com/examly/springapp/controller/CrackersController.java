package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Crackers;
import com.examly.springapp.service.ApiService;
@RestController
public class CrackersController {
   
    @Autowired
    public ApiService apiService;

    @PostMapping("/")
    public boolean addCrackers(@RequestBody Crackers crackers){
        return apiService.addCrackers(crackers);
    }

    @GetMapping("/crackers/{crackersId}")
    public Crackers getOneCrackers(@PathVariable int crackersId){
        return apiService.getOneCrackers(crackersId);
    }

    @GetMapping("/brand/{crackersBrand}")
    public List<Crackers> getBrand(@PathVariable String crackersBrand){
        return apiService.getBrand(crackersBrand);
    }
    
    @GetMapping("/name/{crackersName}")
    public List<Crackers> getByName(@PathVariable String crackersName){
        return apiService.getCrackersByName(crackersName);
    }

    @GetMapping("/{crackersName}/{crackersBrand}")
    public List<Crackers> getByNameNBrand(@PathVariable String crackersName,@PathVariable String crackersBrand){
        return apiService.getByNameNBrand(crackersName, crackersBrand);
    }



   
}
