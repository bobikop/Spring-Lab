package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product extends  BaseEntity{

    private String name;
    private Double price;
    private Integer quantity;
    private Integer remainingQuantity;


    @ManyToMany
    @JoinTable (name = "product_category_rel", joinColumns = @JoinColumn(name = "p_id"), inverseJoinColumns = @JoinColumn(name="c_id"))
    private List<Category> category;
}
