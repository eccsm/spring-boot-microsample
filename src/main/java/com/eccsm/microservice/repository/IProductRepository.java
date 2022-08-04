package com.eccsm.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccsm.microservice.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
