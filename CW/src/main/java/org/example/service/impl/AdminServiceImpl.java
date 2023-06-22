package org.example.service.impl;

import org.example.base.service.impl.BaseServiceImpl;
import org.example.model.Admin;
import org.example.repository.AdminRepo;
import org.example.service.AdminService;

import java.sql.SQLException;

public class AdminServiceImpl extends BaseServiceImpl<Integer, Admin, AdminRepo>
        implements AdminService {

    public AdminServiceImpl(AdminRepo repository) {
        super(repository);
    }

    @Override
    public boolean isExistsUsername(String username) throws SQLException {
        return repository.isExistsUsername(username);
    }
}
