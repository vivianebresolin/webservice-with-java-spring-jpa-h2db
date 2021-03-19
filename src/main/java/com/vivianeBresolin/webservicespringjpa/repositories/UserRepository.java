package com.vivianeBresolin.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivianeBresolin.webservicespringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
