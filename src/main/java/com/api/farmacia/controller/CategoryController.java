package com.api.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.farmacia.model.Category;
import com.api.farmacia.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class CategoryController {
	
	@Autowired 
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Category>> getAll (){
		return ResponseEntity.ok(categoryRepository.findAll());
	}
}
