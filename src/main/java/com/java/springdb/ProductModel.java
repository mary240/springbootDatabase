package com.java.springdb;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    Integer product_id;

    @Column(name = "product_name")
    String product_name;

    @Column(name = "product_price")
    Integer product_price;

    @Column(name = "production_date")
    String production_date;

    @Column(name = "expiration_date")
    String expiration_date;
}
