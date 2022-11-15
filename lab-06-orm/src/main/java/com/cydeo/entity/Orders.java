package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Orders extends BaseEntity{
    private Double paidPrice;
    private Double totalPrice;
    @OneToOne
    private Cart cart;
    @OneToOne
    private Payment payment;
    @ManyToOne
    private Customer customer;
}