package ua.com.foxminder.carmanager;

import java.util.Objects;

public class Car {

    String name;
    Color color;
    int yearOfProduction;
    int weight;
    int price;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, Color color, int yearOfProduction, int weight, int price) {
        this.name = name;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.weight = weight;
        this.price = price;
    }

    private void distanceOnServiceCalculate (int distance){
        distanceOnService = this.distance;
    }

    public void addDistance(int additinalDistance){
        if (additinalDistance < 0){
            throw new IllegalArgumentException("Ввод отрицательного пробега не предусмотрен!!!");
        }
        distance += additinalDistance;
        distanceOnServiceCalculate(distance);
    }

    public void addDistance(double additinalDistance){
        if (additinalDistance < 0){
            throw new IllegalArgumentException("Ввод отрицательного пробега не предусмотрен!!!");
        }
        distance += Math.round(additinalDistance);
        distanceOnServiceCalculate(distance);
    }

    public int service(){
        return distanceOnService = 0;
    }

    public boolean isReadyToService(){
        if (distanceOnService > 10000) {
            return true;
        } else {
            return false;
        }
    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && weight == car.weight && price == car.price && name.equals(car.name) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, yearOfProduction, weight, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", yearOfProduction=" + yearOfProduction +
                ", weight=" + weight +
                ", price=" + price +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }
}
