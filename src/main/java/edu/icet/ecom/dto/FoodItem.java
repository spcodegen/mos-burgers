package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FoodItem {
    private Integer id;
    private String name;
    private String categories;
    private Double price;
    private Integer stock;
    private Date date;
    private Double discount;
}
