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
        return service.getAll();
    }

    @GetMapping("/search-by-id/{id}")
    public FoodItem searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @PostMapping("/update")
    public void updateFoodItem(@RequestBody FoodItem foodItem){
        service.updateFoodItem(foodItem);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }
}
