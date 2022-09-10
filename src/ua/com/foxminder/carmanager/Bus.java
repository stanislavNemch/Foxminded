package ua.com.foxminder.carmanager;

public class Bus extends Car{
    public Bus(String name, Color color, int yearOfProduction, int weight, int price) {
        super(name, color, yearOfProduction, weight, price);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 50000) {
            return true;
        } else {
            return false;
        }
    }
}
