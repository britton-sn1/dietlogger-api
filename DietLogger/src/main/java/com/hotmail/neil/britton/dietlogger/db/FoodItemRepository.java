package com.hotmail.neil.britton.dietlogger.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotmail.neil.britton.dietlogger.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}