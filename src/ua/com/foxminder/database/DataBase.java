package ua.com.foxminder.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase{

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/books";
            String username = "root";
            String password = "1090260";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}


