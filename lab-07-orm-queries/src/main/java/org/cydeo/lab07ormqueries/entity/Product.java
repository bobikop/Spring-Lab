package org.cydeo.lab07ormqueries.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity {

    private String name;
    private Double price;
    private Integer quantity;
    private Integer remainingQuantity;


    @ManyToMany
    @JoinTable (name = "product_category_rel", joinColumns = @JoinColumn(name = "p_id"), inverseJoinColumns = @JoinColumn(name="c_id"))
    private List<Category> category;
}
