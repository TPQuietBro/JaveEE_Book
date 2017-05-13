package com.allen.Dao;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by allentang on 2017/5/11.
 */
public class DBConnection {
    public static Connection getConnection() throws Exception{
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/allen?characterEncoding=utf8&useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,"root","alen@114657");
        return connection;
    }
}
