package ua.com.foxminder.carmanager;

public class PassengerCar extends Car{
    public PassengerCar(String name, Color color, int yearOfProduction, int weight, int price) {
        super(name, color, yearOfProduction, weight, price);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 10000) {
            return true;
        } else {
            return false;
        }
    }
}
