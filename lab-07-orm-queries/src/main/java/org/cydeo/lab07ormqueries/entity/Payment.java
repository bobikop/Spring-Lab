package org.cydeo.lab07ormqueries.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cydeo.lab07ormqueries.enums.PaymentMethod;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Payment extends BaseEntity {

    private Double paidPrice;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}