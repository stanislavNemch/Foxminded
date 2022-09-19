package ua.com.foxminder.database;

import java.sql.*;

public class DBWorker {

    private final String HOST = "jdbc:mysql://localhost:3306/books";
    private final String USERNAME = "root";
    private final String PASSWORD = "1090260";

    private Connection connection;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);

            System.out.println("Connection to Store DB succesfull!");

        } catch (SQLException e){

            //e.printStackTrace();

            System.out.println("Connection failed...");

            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
