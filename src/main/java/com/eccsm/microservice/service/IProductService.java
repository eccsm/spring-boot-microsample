package com.eccsm.microservice.service;

import java.util.List;

import com.eccsm.microservice.model.Product;

public interface IProductService {

	List<Product> listAll();

	Product save(Product product);

	void delete(Long id);

}
