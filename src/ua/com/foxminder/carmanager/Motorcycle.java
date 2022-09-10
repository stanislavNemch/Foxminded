package ua.com.foxminder.carmanager;

import java.util.Objects;

public class Motorcycle {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;
    private int distance = 0;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, Color color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    public void repair (){
        isReadyToDrive = true;
    }
    public void destroy (){
        isReadyToDrive = false;
    }

    public void painting (String colorNew){
        this.color = Color.valueOf(colorNew.toUpperCase());
    }

    private void distanceNew (int distanceNew){
        distance += distanceNew;
    }
    private void distanceNew (double distanceNew){
        distance += (int) Math.round(distanceNew);
    }

    public void setDistance(int distance) {
         distanceNew(distance);
    }

    public void setDistance(double distance) {
        distanceNew(distance);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return isReadyToDrive == that.isReadyToDrive && distance == that.distance && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isReadyToDrive, distance);
    }
}
