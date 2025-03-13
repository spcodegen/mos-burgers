package edu.icet.ecom.service;

import edu.icet.ecom.dto.FoodItem;

import java.util.List;

public interface ItemService {
    void addFoodItem(FoodItem foodItem);
    
    FoodItem searchById(Integer id);

    List<FoodItem> getAll();

    void updateFoodItem(FoodItem foodItem);

    void deleteById(Integer id);
}
