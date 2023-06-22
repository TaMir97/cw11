package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.model.Users;

import java.sql.SQLException;

public interface UserRepo extends BaseRepository<Integer, Users> {
    boolean isExistsByNationalCode(String nationalCade) throws SQLException;
}
