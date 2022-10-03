package com.gharkakhana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gharkakhana.entity.Category;
import com.gharkakhana.service.ICategoryService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/category")
public class ICategoryController {

	@Autowired
	ICategoryService categoryService;

	@PostMapping("/addCategory")
	public Category addCategory(@RequestBody Category category) {

		return categoryService.addCategory(category);
	}

	@PutMapping("/updateCategory")
	public Category updateCategory(@RequestBody Category category) {
		return categoryService.updateCategory(category);
	}

	@DeleteMapping("/removeCategory/{categoryId}")
	public Category removeCategory(@PathVariable int categoryId) {
		return categoryService.removeCategory(categoryId);
	}

	@GetMapping("/viewCategory/{categoryId}")
	public Category viewCategory(@PathVariable int categoryId) {
		return categoryService.viewCategory(categoryId);
	}

	@GetMapping("/viewAllCategory")
	public List<Category> viewAllCategory() {
		return categoryService.viewAllCategory();
	}
}
