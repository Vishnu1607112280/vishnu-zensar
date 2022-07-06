package com.zensar.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.springbootdemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByUserName(String userName);

}
