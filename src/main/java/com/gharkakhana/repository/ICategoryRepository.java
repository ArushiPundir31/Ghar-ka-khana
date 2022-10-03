package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gharkakhana.entity.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
