package com.stackroute;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public void resultSetMetaData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "")) {

            PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnName(1));
            System.out.println(resultSetMetaData.getColumnTypeName(2));


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
