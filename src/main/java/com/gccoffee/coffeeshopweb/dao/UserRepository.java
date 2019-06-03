package com.gccoffee.coffeeshopweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gccoffee.coffeeshopweb.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
