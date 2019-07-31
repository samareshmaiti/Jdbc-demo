package com.stackroute;
public class App {
    public static void main(String[] args) {
        //implementation of JdbcBasicDemo class
        JdbcBasicDemo jdbc = new JdbcBasicDemo();
        jdbc.displayUser();
        jdbc.getUserByName("samaresh");
        //implementation of DatabaseMetaDataDemo class
        DatabaseMetaDataDemo data = new DatabaseMetaDataDemo();
        data.showMetaData();
        //implementation of JdbcBatchProcessingDemo class
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo = new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.batchProcessor();
        //implementation of ResultSetMetaDataDemo class
        ResultSetMetaDataDemo resultSetMetaDataDemo = new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.resultSetMetaData();
        //implementation of RowSetDemo class
        RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.resultSetMetaData();
        //implementation of JdbcTransactionDemo class
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.jdbcTransaction();


    }
}
