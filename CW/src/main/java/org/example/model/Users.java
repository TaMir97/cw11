package org.example.model;

import lombok.*;
import org.example.base.model.BaseEntity;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Users extends BaseEntity<Integer> {
    private String firstname;
    private String lastname;
    private String nationalCode;
    private String password;
    private String phoneNumber;
    private String address;

    public Users(Integer integer, String firstname, String lastname, String nationalCode, String password, String phoneNumber, String address) {
        super(integer);
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
