package com.sc.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository <Customer, Long>{

}
