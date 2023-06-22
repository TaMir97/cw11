package org.example.model;

import lombok.*;
import org.example.base.model.BaseEntity;
import org.example.model.enums.WeightUnit;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Fruit extends BaseEntity<Integer> {
    private String name;
    private String description;
    private boolean stock;
    private WeightUnit weightUnit;
    private double weight;
    private long previousPrice;
    private long currentPrice;

    public Fruit(Integer integer, String name, String description, boolean stock, WeightUnit weightUnit, double weight, long previousPrice, long currentPrice) {
        super(integer);
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.weightUnit = weightUnit;
        this.weight = weight;
        this.previousPrice = previousPrice;
        this.currentPrice = currentPrice;
    }
}
