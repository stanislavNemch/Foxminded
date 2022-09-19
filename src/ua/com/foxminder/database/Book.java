package ua.com.foxminder.database;

public class Book {

    private int id;
    private String bookName;

    public Book() {
    }

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + "{id: " + id
                + ", Book name: " + bookName
                + "}";
    }
}
