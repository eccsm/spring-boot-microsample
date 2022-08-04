package com.eccsm.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.eccsm.microservice.service.IProductService;

import com.eccsm.microservice.model.Product;

@RestController
@RequestMapping("api/product")
public class ProductController {

	@Autowired
	IProductService service;

	@GetMapping
	public ResponseEntity<?> getProducts() {
		return ResponseEntity.ok(service.listAll());
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Product product) {
		return new ResponseEntity<>(service.save(product), HttpStatus.CREATED);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
