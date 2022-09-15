package com.laptop.exercise4.controller;

import com.laptop.exercise4.entity.LaptopEntity;
import com.laptop.exercise4.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository repoLaptop;

    @Autowired
    LaptopController(LaptopRepository repoLaptop){
        this.repoLaptop = repoLaptop;
    }

    @GetMapping( path = "/laptop/all")
    public List<LaptopEntity> all(){
        return repoLaptop.findAll();
    }

    @PostMapping( path = "/laptop/create")
    public ResponseEntity<LaptopEntity> create(@RequestBody LaptopEntity laptop){
        try {
            return ResponseEntity.ok().body(repoLaptop.save(laptop));
        } catch ( Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
