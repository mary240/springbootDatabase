package com.java.springdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ProductRepository repository;

    @GetMapping("/")
    public List<Product> getProducts(){
        return repository.findAll();
    }
}
