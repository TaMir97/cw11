package org.example.model;

import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Shipping extends BaseEntity<Integer> {
    private String name;
    private long shippingPrice;
    private Date shippingDate;
}
