package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gharkakhana.entity.Cart;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {

}
