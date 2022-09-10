package ua.com.foxminder.carmanager;

public enum Color {

    BLACK("Black"), ORANGE("Orange"), WHITE("White"), YELLOW("Yellow"), BLUE("Blue"), GREEN("Green");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
