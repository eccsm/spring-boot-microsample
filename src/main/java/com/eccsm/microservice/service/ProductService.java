package com.eccsm.microservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eccsm.microservice.model.Product;
import com.eccsm.microservice.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository repository;

	@Override
	public List<Product> listAll() {
		return repository.findAll();
	}

	@Override
	public Product save(Product product) {
		product.setCreatedAt(LocalDateTime.now());
		return repository.save(product);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
