package com.vivianeBresolin.webservicespringjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vivianeBresolin.webservicespringjpa.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
