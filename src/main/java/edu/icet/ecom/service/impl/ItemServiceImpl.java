package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.FoodItem;
import edu.icet.ecom.entity.FoodItemEntity;
import edu.icet.ecom.repository.ItemRepository;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    final ItemRepository repository;
    final ModelMapper mapper;

    @Override
    public void addFoodItem(FoodItem foodItem) {
        repository.save(mapper.map(foodItem, FoodItemEntity.class));
    }

    @Override
    public FoodItem searchById(Integer id) {
        return mapper.map(repository.findById(id), FoodItem.class);
    }

    @Override
    public List<FoodItem> getAll() {
        List<FoodItem> foodItemList = new ArrayList<>();
        List<FoodItemEntity> foodItemEntityList = repository.findAll();
        foodItemEntityList.forEach(foodItemEntity -> {
            foodItemList.add(mapper.map(foodItemEntity, FoodItem.class));
        });
        return foodItemList;
    }

    @Override
    public void updateFoodItem(FoodItem foodItem) {
        repository.save(mapper.map(foodItem, FoodItemEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
