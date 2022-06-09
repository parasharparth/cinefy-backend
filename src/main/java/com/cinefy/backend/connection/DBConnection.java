package com.cinefy.backend.connection;

import com.cinefy.backend.properties.DBConnectionProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    @Autowired
    DBConnectionProperties dbConnectionProperties;

    public Connection dbconnect() throws Exception
    {
        //the first step is to get all the properties of the database connection

        String url = dbConnectionProperties.getUrl();
        String user = dbConnectionProperties.getUser();
        String password = dbConnectionProperties.getPassword();

        return DriverManager.getConnection(url, user , password);
    }
}
