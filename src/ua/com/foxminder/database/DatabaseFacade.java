package ua.com.foxminder.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade {

    public static List<String> getBooks() {

        List<String> result = new ArrayList<String>();


    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books",
            "root", "1090260"))
    {
        System.out.println("Java JDBC MySQL Example");

        System.out.println("Connected to MySQL database!");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from books");

        while (resultSet.next()) {
            result.add(resultSet.getString("name"));
        }
    }       catch (SQLException e) {
                    System.out.println("Connection failure.");
                    e.printStackTrace();
                }

         return result;
    }
}