package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JdbcBasicDemo jdbc=new JdbcBasicDemo();
        jdbc.displayUser();
        jdbc.getUserByName("samaresh");
        DatabaseMetaDataDemo data=new DatabaseMetaDataDemo();
        data.showMetaData();
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo=new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.batchProcessor();
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.resultSetMetaData();
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.resultSetMetaData();


    }
}
