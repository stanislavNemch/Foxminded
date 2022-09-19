package ua.com.foxminder.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBWorker worker = new DBWorker();

        String query = "select * from books";
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getInt(1));
                book.setBookName(resultSet.getString(2));

                System.out.println(book);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
