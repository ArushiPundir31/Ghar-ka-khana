package com.gharkakhana.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gharkakhana.entity.Food;
import com.gharkakhana.service.IFoodService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin
public class IFoodController {
	@Autowired
	private IFoodService iFoodService;

	@RequestMapping(value = "/menu")
	public List<Food> getMenu(Model model) {
		List<Food> foodItems;
		foodItems = iFoodService.getFoodList();
		return foodItems;
	}

	@PostMapping("/FoodId")
	public ResponseEntity<Food> FoodId(@RequestBody Food food, HttpSession session) {
		Food foodId = iFoodService.FoodList(food);
		if (foodId != null) {
			session.setAttribute("food", foodId);
			return new ResponseEntity<Food>(foodId, HttpStatus.OK);
		} else {
			return new ResponseEntity<Food>(foodId, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/FoodList")
	public List<Food> getFoodList() {
		return iFoodService.getFoodList();
	}

	@PostMapping("/Addmenu")
	public ResponseEntity<Food> addmenu(@RequestBody Food food, HttpSession session) {
		Food food_info = iFoodService.FoodId(food);
		if (food_info != null) {
			session.setAttribute("food", food_info);
			return new ResponseEntity<>(food_info, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/FoodDetails")
	public ResponseEntity<String> menulist(HttpSession session) {
		if (session.getAttribute("food") != null) {
			session.invalidate();
			return new ResponseEntity<>("Menu Details are updated", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Menu Details not Found", HttpStatus.BAD_REQUEST);
		}
	}

}
