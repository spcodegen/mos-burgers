package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.ItemCategory;
import edu.icet.ecom.entity.ItemCategoryEntity;
import edu.icet.ecom.repository.CategoryRepository;
import edu.icet.ecom.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    final CategoryRepository repository;
    final ModelMapper mapper;

    @Override
    public void addCategory(ItemCategory itemCategory) {
        repository.save(mapper.map(itemCategory, ItemCategoryEntity.class));
    }

    @Override
    public List<ItemCategory> getAll() {
        List<ItemCategory> itemCategoryList = new ArrayList<>();
        List<ItemCategoryEntity> itemCategoryEntityList = repository.findAll();

        itemCategoryEntityList.forEach(itemCategoryEntity -> {
            itemCategoryList.add(mapper.map(itemCategoryEntity,ItemCategory.class));
        });
        return itemCategoryList;
    }

    @Override
    public void searchById(Integer id) {
        repository.findById(id);
    }

    @Override
    public void updateCategory(ItemCategory category) {
        repository.save(mapper.map(category,ItemCategoryEntity.class));
    }

    @Override
    public void deleteCategory(Integer id) {
        repository.deleteById(id);
    }

}
