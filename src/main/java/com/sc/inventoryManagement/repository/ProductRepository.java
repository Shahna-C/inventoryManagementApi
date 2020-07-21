package com.sc.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository <Product, Long>{

}
