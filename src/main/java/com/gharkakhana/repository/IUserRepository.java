package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gharkakhana.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String userName);

	User findUserById(Integer id);

}
