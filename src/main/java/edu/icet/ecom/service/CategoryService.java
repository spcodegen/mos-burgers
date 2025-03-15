package edu.icet.ecom.service;

import edu.icet.ecom.dto.ItemCategory;

import java.util.List;

public interface CategoryService {
    void addCategory(ItemCategory itemCategory);

    List<ItemCategory> getAll();

    void searchById(Integer id);

    void updateCategory(ItemCategory category);

    void deleteCategory(Integer id);
}
