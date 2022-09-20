package ua.com.foxminder.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        DBWorker worker = new DBWorker();

        String query = "select * from books"; //строка для формирования запросов
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){ //перебор всех строк таблицы

                Book book = new Book();

                book.setId(resultSet.getInt(1)); //доступ по имени поля "id"
                book.setBookName(resultSet.getString(2)); //доступ по имени поля "name"

                System.out.println(book);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
