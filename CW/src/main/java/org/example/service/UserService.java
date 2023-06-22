package org.example.service;

import org.example.base.service.BaseService;
import org.example.model.Users;

import java.sql.SQLException;

public interface UserService extends BaseService<Integer, Users> {
    boolean isExistsByNationalCode(String nationalCade) throws SQLException;
}
