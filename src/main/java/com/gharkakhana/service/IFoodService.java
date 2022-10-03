package com.gharkakhana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gharkakhana.entity.Food;
import com.gharkakhana.exception.CategoryAlreadyExistException;
import com.gharkakhana.exception.IdAlreadyExistException;
import com.gharkakhana.repository.IFoodRepository;

@Service
public class IFoodService {
	@Autowired
	private IFoodRepository iFoodRepository;

	public List<Food> getFoodList() {
		List<Food> food;
		food = iFoodRepository.findAll();
		return food;
	}

	public Food validateFoodInfo(String productId) {
		Food food = null;
		food = iFoodRepository.findById(productId).get();
		return food;
	}

	public Food getFoodById(String id) {
		return iFoodRepository.findFoodById(id);
	}

	public Food FoodId(Food food) throws IdAlreadyExistException {
		Food foodId = iFoodRepository.findFoodById(food.getId());
		if (foodId != null) {
			throw new IdAlreadyExistException("Id Already Exist");
		} else {
			iFoodRepository.save(food);
			return food;
		}
	}

	public Food FoodList(Food food) throws CategoryAlreadyExistException {
		Food foodlist = iFoodRepository.findByItem(food.getItem());
		if (foodlist != null) {
			throw new CategoryAlreadyExistException("Item already exist");
		} else {
			iFoodRepository.save(food);
			return food;
		}

	}

	public void delete(String id) {
		iFoodRepository.deleteById(id);
	}

}
