package org.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Order extends BaseEntity<Integer> {
    private int userID;
    private boolean status;
    private int shippingID;
    private long paycheck;
}
