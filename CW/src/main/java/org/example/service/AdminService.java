package org.example.service;

import org.example.base.repository.BaseRepository;
import org.example.model.Admin;

import java.sql.SQLException;

public interface AdminService extends BaseRepository<Integer, Admin> {
    boolean isExistsUsername(String username) throws SQLException;
}
