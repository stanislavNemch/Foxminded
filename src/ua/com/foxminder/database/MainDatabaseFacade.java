package ua.com.foxminder.database;

public class MainDatabaseFacade {

    public static void main(String[] args) {

        for (String name: DatabaseFacade.getBooks()) {
            System.out.println(name);
        }
    }
}
