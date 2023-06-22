package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.model.Admin;

import java.sql.SQLException;

public interface AdminRepo extends BaseRepository<Integer, Admin> {
    boolean isExistsUsername(String username) throws SQLException;
}
