package edu.icet.ecom.service;

import edu.icet.ecom.dto.FoodItem;

import java.util.List;

public interface ItemService {
    void addFoodItem(FoodItem foodItem);

    List<FoodItem> getAll();
}
