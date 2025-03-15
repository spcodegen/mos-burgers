package edu.icet.ecom.controller;

import edu.icet.ecom.dto.ItemCategory;
import edu.icet.ecom.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@CrossOrigin
public class CategoryController {

    final CategoryService service;

    @PostMapping("/add")
    public void addCategory(@RequestBody ItemCategory itemCategory) {
        service.addCategory(itemCategory);
    }

    @GetMapping("/get-all")
    public List<ItemCategory> getAll() {
        return service.getAll();
    }

    @PostMapping("/update")
    public void updateCategory(@RequestBody ItemCategory category) {
        service.updateCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Integer id) {
        service.deleteCategory(id);
    }
}
