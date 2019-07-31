package com.stackroute;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowSetDemo {
    public void resultSetMetaData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "")) {

            // PreparedStatement preparedStatement=connection.prepareStatement("select * from user");
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/user");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("");
            jdbcRowSet.setCommand("select * from user");
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                System.out.println(jdbcRowSet.getString(3));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
