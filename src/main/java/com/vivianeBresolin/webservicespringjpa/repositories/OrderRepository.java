package com.vivianeBresolin.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivianeBresolin.webservicespringjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
