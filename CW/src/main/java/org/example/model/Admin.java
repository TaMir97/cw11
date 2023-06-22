package org.example.model;

import lombok.*;
import org.example.base.model.BaseEntity;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Admin extends BaseEntity<Integer> {
    private String username;
    private String password;


    public Admin(Integer integer, String username, String password) {
        super(integer);
        this.username = username;
        this.password = password;
    }
}
