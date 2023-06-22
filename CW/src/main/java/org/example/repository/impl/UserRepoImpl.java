package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;
import org.example.connection.DBConnection;
import org.example.model.Users;
import org.example.repository.UserRepo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepoImpl extends BaseRepositoryImpl<Integer, Users> implements UserRepo {

    @Override
    public boolean isExistsByNationalCode(String nationalCade) throws SQLException {
        String sql = "select national_code from users where national_code = ?";
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(sql)) {
            statement.setString(1,nationalCade);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        }
    }

    @Override
    public String getTableName() {
        return "users";
    }

    @Override
    public String getColumnsName() {
        return "(firstname, lastname, national_code, phone_number, address, password)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "(firstname = ?, lastname = ?, national_code = ?, phone_number = ?, address = ?, password = ?)";
    }

    @Override
    public String getCountOfQuestionMarkForParams() {
        return "(?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Users mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new Users(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getString(5),
                resultSet.getString(6),
                resultSet.getString(7)

        );
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Users entity) throws SQLException {
                preparedStatement.setString(1,entity.getFirstname());
                preparedStatement.setString(2,entity.getLastname());
                preparedStatement.setString(3,entity.getNationalCode());
                preparedStatement.setString(4,entity.getPhoneNumber());
                preparedStatement.setString(5,entity.getAddress());
                preparedStatement.setString(6,entity.getPassword());
    }

    @Override
    public void fillParamForStatementForUpdate(PreparedStatement preparedStatement, Users entity) throws SQLException {
        fillParamForStatement(preparedStatement, entity);
        preparedStatement.setInt(7,entity.getId());
    }

}
