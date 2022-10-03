package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gharkakhana.entity.Food;

public interface IFoodRepository extends JpaRepository<Food, String> {
	Food findFoodById(String id);

	Food findByItem(String item);

}
