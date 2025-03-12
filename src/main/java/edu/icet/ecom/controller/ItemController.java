package edu.icet.ecom.controller;

import edu.icet.ecom.dto.FoodItem;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foodItem")
@RequiredArgsConstructor
public class ItemController {

    final ItemService service;

    @PostMapping("/add")
    public void addFoodItem(@RequestBody FoodItem foodItem){
        service.addFoodItem(foodItem);
    }

    @GetMapping("/get-all")
    public List<FoodItem> getAll(){
        List<FoodItem> all = service.getAll();
        return all;
    }
}
