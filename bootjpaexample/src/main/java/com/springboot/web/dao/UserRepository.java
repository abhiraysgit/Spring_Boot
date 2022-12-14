package com.springboot.web.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User save(User user);

//	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

}
