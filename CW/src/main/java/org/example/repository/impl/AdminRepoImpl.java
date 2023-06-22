package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;
import org.example.connection.DBConnection;
import org.example.model.Admin;
import org.example.repository.AdminRepo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepoImpl extends BaseRepositoryImpl<Integer, Admin>
        implements AdminRepo {

    @Override
    public boolean isExistsUsername(String username) throws SQLException {
        String sql = "select username from admin where username = ?";
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(sql)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        }
    }

    @Override
    public String getTableName() {
        return "admin";
    }

    @Override
    public String getColumnsName() {
        return "(username, password)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "(username = ?, password = ?)";
    }

    @Override
    public String getCountOfQuestionMarkForParams() {
        return "(?, ?)";
    }

    @Override
    public Admin mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new Admin(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3));
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Admin entity) throws SQLException {
        preparedStatement.setString(1, entity.getUsername());
        preparedStatement.setString(2, entity.getPassword());
    }

    @Override
    public void fillParamForStatementForUpdate(PreparedStatement preparedStatement, Admin entity) throws SQLException {
        fillParamForStatement(preparedStatement, entity);
        preparedStatement.setInt(3, entity.getId());
    }


}
