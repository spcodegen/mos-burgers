package edu.icet.ecom.repository;

import edu.icet.ecom.entity.FoodItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<FoodItemEntity, Integer> {
}
