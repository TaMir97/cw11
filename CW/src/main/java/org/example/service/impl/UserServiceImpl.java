package org.example.service.impl;

import org.example.base.service.BaseService;
import org.example.base.service.impl.BaseServiceImpl;
import org.example.model.Users;
import org.example.repository.UserRepo;
import org.example.service.UserService;
import org.example.util.Validation;

import java.sql.SQLException;

public class UserServiceImpl
        extends BaseServiceImpl<Integer, Users, UserRepo>
        implements UserService {

    public UserServiceImpl(UserRepo repository) {
        super(repository);
    }

    @Override
    public void save(Users user) throws SQLException {
        if (Validation.nationalCodeChecker(user.getNationalCode()) &&
                Validation.passwordChecker(user.getPassword()) &&
                Validation.phoneNumberChecker(user.getPhoneNumber()) &&
                !isExistsByNationalCode(user.getNationalCode())) {

            repository.save(user);
            return;
        }
        throw new RuntimeException("either the input is invalid or te user exists");
    }

    @Override
    public boolean isExistsByNationalCode(String nationalCade) throws SQLException {
        return repository.isExistsByNationalCode(nationalCade);
    }
}
