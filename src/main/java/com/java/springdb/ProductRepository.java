package com.java.springdb;

import com.java.springdb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Override
    @Query(value = "SELECT * FROM products")
    List<Product> findAll();

}
