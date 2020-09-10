package com.java.springdb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<ProductModel, Integer> {
    @Override
    List<ProductModel> findAll();
}
