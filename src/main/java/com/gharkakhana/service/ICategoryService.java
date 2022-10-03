package com.gharkakhana.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gharkakhana.entity.Category;
import com.gharkakhana.exception.CategoryAlreadyExistException;
import com.gharkakhana.exception.IdAlreadyExistException;
import com.gharkakhana.repository.ICategoryRepository;

@Service
public class ICategoryService {
	@Autowired
	ICategoryRepository CategoryRepository;

	public Category addCategory(Category category) throws CategoryAlreadyExistException {
		if (category == null) {
			throw new CategoryAlreadyExistException("Category already exist");
		} else {
			CategoryRepository.save(category);
		}
		return CategoryRepository.save(category);
	}

	@SuppressWarnings("unused")
	public Category updateCategory(Category category) throws IdAlreadyExistException {
		Optional<Category> container = CategoryRepository.findById(category.getId());
		if (category == null) {
			throw new IdAlreadyExistException("Id already exist");
		} else {
			CategoryRepository.save(category);
		}
		if (container.isPresent()) {
			Category result = container.get();
			result.setId(category.getId());
			result.setName(category.getName());
			return CategoryRepository.save(result);
		}
		return null;
	}

	private void extracted() {
		throw new IdAlreadyExistException("Id already exist");
	}

	public Category removeCategory(int categoryId) {
		Optional<Category> container = CategoryRepository.findById(categoryId);
		if (container.isPresent()) {
			Category result = container.get();
			CategoryRepository.delete(result);
			return result;
		}
		return null;
	}

	public Category viewCategory(int categoryId) {
		Optional<Category> container = CategoryRepository.findById(categoryId);
		if (container.isPresent()) {
			return container.get();
		}
		return null;
	}

	public List<Category> viewAllCategory() {
		List<Category> result = new ArrayList<Category>();
		result = CategoryRepository.findAll();
		return result;
	}
}
