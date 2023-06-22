package org.example.repository.impl;

import org.example.base.repository.impl.BaseRepositoryImpl;
import org.example.model.Fruit;
import org.example.model.enums.WeightUnit;
import org.example.repository.FruitRepo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FruitRepoImpl extends BaseRepositoryImpl<Integer, Fruit>
        implements FruitRepo {
    @Override
    public String getTableName() {
        return "fruit";
    }

    @Override
    public String getColumnsName() {
        return "(name, description, stock_rate, weight_unit, weight, current_price, previous_price)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "(name = ?, description = ?, stock_rate = ?, weight_unit = ?, weight = ?, current_price = ?, previous_price = ?)";
    }

    @Override
    public String getCountOfQuestionMarkForParams() {
        return "(?, ?, ?, ?, ?, ?, ?)";
    }

    @Override
    public Fruit mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        return new Fruit(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getBoolean(4),
                WeightUnit.valueOf(resultSet.getString(5)),
                resultSet.getDouble(6),
                resultSet.getLong(7),
                resultSet.getLong(8));
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Fruit entity) throws SQLException {

    }

    @Override
    public void fillParamForStatementForUpdate(PreparedStatement preparedStatement, Fruit entity) throws SQLException {

    }
}
