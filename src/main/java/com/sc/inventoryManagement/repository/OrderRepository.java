package com.sc.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository <Order, Long>{

}
