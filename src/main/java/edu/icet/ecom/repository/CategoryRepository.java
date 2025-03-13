package edu.icet.ecom.repository;

import edu.icet.ecom.entity.ItemCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<ItemCategoryEntity,Integer> {
}
