package com.hotmail.neil.britton.dietlogger.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotmail.neil.britton.dietlogger.model.FoodItem;
import com.hotmail.neil.britton.dietlogger.db.FoodItemRepository;

@RestController
@RequestMapping("/dietlogger")
public class FoodItemController {

	private final FoodItemRepository repository;
	
	FoodItemController(FoodItemRepository repository) {
		this.repository = repository;
	}
	
	Logger logger = LoggerFactory.getLogger(FoodItemController.class);
			
	@GetMapping(value="/foodItems",produces = {MediaType.APPLICATION_JSON_VALUE, 
			MediaType.APPLICATION_XML_VALUE})
	List<FoodItem> all() {
		
		return repository.findAll();
	}
	
	@PostMapping(value="/foodItem",consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}) 
	public FoodItem doPost(@RequestBody FoodItem foodItem) {
		FoodItem persistedFoodItem = repository.save(foodItem);
		
		return persistedFoodItem;
		
	}
}
